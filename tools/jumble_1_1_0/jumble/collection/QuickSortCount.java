/*
* Source: http://en.wikibooks.org/wiki/Algorithm_Implementation/Sorting/Bubble_sort#Java
* Wikibooks Java Quick Sort Implementation
*/
package algorithms;
import java.util.Arrays;
import java.util.Random;

public class QuickSortCount {
    public static final Random RND = new Random();
 	static int  count;
    private static void swap (int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
 
    private static int partition(int[] array, int begin, int end) {
        int index = begin + RND.nextInt(end - begin + 1);
        int pivot = array[index];
        swap(array, index, end);
        for (int i = index = begin; i < end; ++i) {
            if (array[i] < pivot || array[i] == pivot) {
                swap(array, index++, i);
            }
        }
        swap(array, index, end);
        return index;
    }
 
    private static void qsort(int[] array, int begin, int end) {
	int count=0;       
 if (end > begin) {
            int index = partition(array, begin, end);
            qsort(array, begin, index - 1);
            qsort(array, index + 1, end);
		count++;
        }
    }
 
    public static int sort(int[] array) {
        qsort(array, 0, array.length - 1);
	return count;
    }
}