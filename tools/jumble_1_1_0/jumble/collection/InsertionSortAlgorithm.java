/** FlashSortAlgorithmTest.java
  *
  * Tests the flash sort algorithm.
  *

/*
 * @(#)InsertSortAlgorithm.java	1.0 95/06/23 Jason Harrison
 *
 * Copyright (c) 1995 University of British Columbia
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL purposes and without
 * fee is hereby granted provided that this copyright notice
 * appears in all copies. Please refer to the file "copyright.html"
 * for further important copyright and licensing information.
 *
 * UBC MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. UBC SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

/**
  * An insertion sort demonstration algorithm
  * SortAlgorithm.java, Thu Oct 27 10:32:35 1994
  *
  * @author Jason Harrison@cs.ubc.ca
  * @version 	1.0, 23 Jun 1995
  *
  * Modified by:
  *
  * Jonathan Miller Kauffman
  * PLEDGE:
  *
  * Tyler J. Abbott
  * PLEDGE:  
  *
  * Cory Matthew Jones
  * PLEDGE:
  *
  */
package algorithms;

public class InsertionSortAlgorithm //extends SortAlgorithm
{
    public static int[] sort(int a[]) //throws Exception
    {
        for (int i = 1; i < a.length; i++)
        {
            int j = i;
            int B = a[i];
            while ((j > 0) && (a[j-1] > B))
            {
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

        return a;
    }

    public static long sortPerformance(int a[]) //throws Exception
    {
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

    public static int[] sortMutated(int a[]) //throws Exception
    {
        for (int i = 100; i < a.length; i=i+2)
        {
            int j = 1;
            int B = a[i];
            // Should be j > 0
            while ((j > 1000) && (a[j-1] > B))
            {
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

        return a;
    }
}
