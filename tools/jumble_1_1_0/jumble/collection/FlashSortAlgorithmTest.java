import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;
import java.util.Random;
import java.util.Arrays;

/** FlashSortAlgorithmTest.java
  *
  * Tests the flash sort algorithm.
  *
  * @author Jonathan Miller Kauffman
  * PLEDGE:
  *
  * @author Tyler J. Abbott
  * PLEDGE:
  *
  * @author Cory Matthew Jones
  * PLEDGE:
  */

public class FlashSortAlgorithmTest extends TestCase{

	/**
	 * Generates a random array of integers
	 * @param arraySize the size of the array you want
	 * @param maxValue  the max value you want
	 * @return an array full of values at the specified size
	 */
	public static int[] generateRandomArray(int arraySize, int maxValue)
    {
        Random rand = new Random();
        int[] randomArray = new int[arraySize];
        for(int i=0;i < arraySize; i++)
        {
            randomArray[i] = rand.nextInt(maxValue);
        }

        return randomArray;
    }
	
	/**
	 * Test method for {@link FlashSortAlgorithm#sort(int[])}.
	 * 
	 */
	@Test
	public  void testSort() {
		int[] array =  { 3, 28, 342, 26, 13 };
		int[] expectedarray = new int[] { 3, 13, 26, 28, 342 }; 
		array = FlashSortAlgorithm.partialFlashSort(array);
		assertArrayEquals(expectedarray, array);
	}
	
	/**
	 * Test method for {@link FlashSortAlgorithm#insertionSort(int[])}
	 */
	@Test
	public void testInsertionSort()
	{
		fail("not yet implemented");
	}
	
	/**
	 * Test method for {@link FlashSortAlgorithm#partialFlashSort(int[])}
	 */
	@Test
	public void testPartialFlashSort() {
		fail("blah");
	}


  private static boolean arrayEqual(int[] array, int[] expectedarray)
    {
        if(array.length != expectedarray.length)
            return false;

	    for(int i = 0; i < array.length; i++)
	    {
		    if(array[i] != expectedarray[i])
			    return false;
        }
			return true; 
    }

 

// Tyler James Abbott's tests 

   @Test
    public void testsmoke() 
	{
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[] expectedarray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; 
		assertTrue(arrayEqual(expectedarray, InsertionSortAlgorithm.sort(array)));
		
	}

    @Test
    public void testsmokeone() 
	{
		int[] array = new int[] { 76, 843, 44, 1, 3, 9 };
		int[] expectedarray = new int[] { 1, 3, 9, 44, 76, 843 }; 
		assertTrue(!arrayEqual(expectedarray, InsertionSortAlgorithm.sort(array)));
		
	}

    @Test
    public void testsmoketwo() 
	{
		int[] array = new int[] {6, 1 };
		int[] expectedarray = new int[] { 1, 6 }; 
		assertTrue(arrayEqual(expectedarray, InsertionSortAlgorithm.sort(array)));
		
	}

    @Test
    public void testsmokethree() 
	{
		int[] array = new int[] { 5678, 6789, 1234, 2345, 3456, 9876 };
		int[] expectedarray = new int[] { 1234, 2345, 3456, 5678, 6789, 9876 }; 
		assertTrue(arrayEqual(expectedarray, InsertionSortAlgorithm.sort(array)));
		
	}

   @Test
   public void testsearchEmptyArray()
	{
 		int[]testArray = new int[] {};
		int[]testArray1 = new int[] {};
		assertTrue(arrayEqual(testArray1, InsertionSortAlgorithm.sort(testArray)));
	} 
   @Test
   public void testsearchEmptyArrayone()
	{
 		int[]testArray = new int[] {1};
		int[]testArray1 = new int[] {};
		assertTrue(!arrayEqual(testArray1, InsertionSortAlgorithm.sort(testArray)));
	} 

   @Test
   public void testsearchEmptyArraytwo()
	{
 		int[]testArray = new int[] {1, 987, 45, 2, 56, 8, 34, 55};
		int[]testArray1 = new int[] {};
		assertTrue(!arrayEqual(testArray1, InsertionSortAlgorithm.sort(testArray)));
	} 

    @Test
    public void testgenerateRandomArray() 
	{
		int[] array = generateRandomArray(77777, 11111);
		int[] expectedarray = array;
		Arrays.sort(expectedarray);
		assertTrue(arrayEqual(expectedarray, InsertionSortAlgorithm.sort(array)));
		
	}

    @Test
    public void testgenerateRandomArray1() 
	{
		int[] array = generateRandomArray(6, 7);
		int[] expectedarray = array;
		Arrays.sort(expectedarray);
		assertTrue(arrayEqual(expectedarray, InsertionSortAlgorithm.sort(array)));
		
	}

    @Test
    public void testgenerateRandomArray2() 
	{
		int[] array = generateRandomArray(34567545, 23 );
		int[] expectedarray = array;
		Arrays.sort(expectedarray);
		assertTrue(arrayEqual(expectedarray, InsertionSortAlgorithm.sort(array)));
		
	} 

// Jonathan Miller Kauffman's tests
 @Test
   public void testsearchEmptyArray2()
	{
 		int[]testArray = new int[] {};
		int[]testArray1 = new int[] {1, 2, 3, 4, 5};
		assertTrue(!arrayEqual(testArray1, InsertionSortAlgorithm.sort(testArray)));
	}

    @Test
    public void testArraySizeOne()
    {
        int[] testArray = new int[] {3};
        int[] testArray1 = new int[] {3};
        assertTrue(arrayEqual(testArray1, InsertionSortAlgorithm.sort(testArray)));
    }

   @Test
    public void testSmokeOne() 
	{
		int[] array = new int[] { 7, 23, 32, 26, 13 };
		int[] expectedarray = new int[] { 7, 13, 23, 26, 32 }; 
		assertTrue(arrayEqual(expectedarray, RadixSortAlgorithm.sort(array)));
		
	}

    @Test
    public void testSmokeTwo() 
	{
		int[] array = new int[] { 3, 43, 32, 36, 13, 332, 1005, 89, 123, 2398, 3, 4 };
		int[] expectedarray = new int[] { 3, 3, 4, 13, 32, 36, 43, 89, 123, 332, 1005, 2398 }; 
		assertTrue(arrayEqual(expectedarray, RadixSortAlgorithm.sort(array)));
		
	}

    @Test
    public void testSmokeThree() 
	{
		int[] array = new int[] { 3, 43};
		int[] expectedarray = new int[] { 3, 43}; 
		assertTrue(arrayEqual(expectedarray, RadixSortAlgorithm.sort(array)));
		
	}

    @Test
    public void testSmokeFour() 
	{
		int[] array = new int[] { 5, 4, 3, 2, 1 };
		int[] expectedarray = new int[] { 1, 2, 3, 4, 5 }; 
		assertTrue(arrayEqual(expectedarray, RadixSortAlgorithm.sort(array)));
		
	}

    @Test
    public void testBoundaryOne()
    {
        int[] array = new int[] {};
        int[] expectedarray= new int[] {};
		assertTrue(arrayEqual(expectedarray, RadixSortAlgorithm.sort(array)));
    }

    @Test
    public void testBoundaryTwo()
    {
        int[] array = new int[] {7};
        int[] expectedarray= new int[] {7};
		assertTrue(arrayEqual(expectedarray, RadixSortAlgorithm.sort(array)));
    }

    @Test
    public void testBoundaryThree()
    {
        int[] array = generateRandomArray(3000,300);
        int[] expectedarray= Arrays.copyOf(array,array.length);
        Arrays.sort(expectedarray);
		assertTrue(arrayEqual(expectedarray, RadixSortAlgorithm.sort(array)));
    }

    @Test
    public void testBoundaryFour()
    {
        int[] array = generateRandomArray(3000,300000);
        int[] expectedarray= Arrays.copyOf(array,array.length);
        Arrays.sort(expectedarray);
		assertTrue(arrayEqual(expectedarray, RadixSortAlgorithm.sort(array)));
    }

}

