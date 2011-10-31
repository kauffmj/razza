/**
* This file is part of Razza.
*
* Razza is free software: you can redistribute it and/or modify it under
* the terms of the GNU Lesser Public License as published by the Free
* Software Foundation, either version 2 of the License, or (at your option)
* any later version.
*
* Razza is distributed in the hope that it will be useful, but WITHOUT
* WARRANTY; without even the implied warranty of MERCHANTABILITY or
* FITNESS FOR A PARTICULAR PURPOSE.  Se the GNU Lesser Public License for
* more details.
*
* You should have received a copy of the GNU Lesser Public License along
* with Razza.  If not, see <http://www.gnu.org/licenses/>.
**/

package algorithms;
public class GnomeSortAlgorithm{// extends SortAlgorithm {

    public static int[] sort(int a[]){// throws Exception {
		
	int i=0, temp;
		
	while(i < a.length) {
			
	    if(i == 0 || a[i-1] <= a[i])
		{
		    i++;
		}
			
	    else
		{		
		    temp = a[i];		
		    a[i] = a[i-1];	
		    a[--i] = temp;			
		}
			
	    //pause(i);
			
	}
		
	//pause(-1,-1);
	return a;
    }

    public static long sortPerformance(int[] a) /*throws Exception*/ {
	long count = 0;
        for (int i = 1; i < a.length; i++)
        {
            int j = i;
            int B = a[i];
            while ((j > 0) && (a[j-1] > B))
            {
                count++;
                //if (stopRequested)
                //{
                //	return;
                //}
                a[j] = a[j-1];
                j--;
                //pause(i,j);
            }
            a[j] = B;
            //pause(i,j);
        }

        return count;
    }
}
