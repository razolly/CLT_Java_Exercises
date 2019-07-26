package Assignment1;

import java.util.Arrays;

public class Problem12 {

	/*
	 * Find the second largest and second smallest element in an array
	 */
	public static void main(String[] args) {

		int[] array = new int[] { 1111111, 222, 33, 4, 555555, 666 };
		
		// Method 1: Find using sorting
		findSecondSmallLarge1(array);
		
		// Method 2: Find without sorting
		// findSecondSmallLarge2(array);

	}

	private static void findSecondSmallLarge1(int[] array) {
		
		// Sort the array
		Arrays.sort(array);
		
		// Display whole array 
		System.out.println(Arrays.toString(array));
		
		// Display second smallest. It will be the second element (index 1)
		System.out.println("Second smallest element is " + array[1]);
		
		// Display second biggest. It will be the second last element (index length - 2)
		System.out.println("Second biggest element is " + array[array.length - 2]);
	}

	private static void findSecondSmallLarge2(int[] array) {
		
		int smallest = array[0];
		int biggest = array[0];

		// Loop through array to find the biggest
		// and the smallest element
		for (int element : array) {

			// Find the smallest element
			if (element < smallest) {
				smallest = element;
			}

			// Find the biggest element
			if (element > biggest) {
				biggest = element;
			}
		}

		System.out.println("Smallest is " + smallest);
		System.out.println("Biggest is " + biggest);

		int secondSmallest = array[0] + 1;
		int secondBiggest = array[0] - 1;

		// Loop through array to find the SECOND biggest
		// and the SECOND smallest elements
		for (int element : array) {

			// Find the second smallest element
			if (element < secondSmallest && element != smallest) {
				secondSmallest = element;
			}

			// Find the second biggest element
			if (element > secondBiggest && element != biggest) {
				secondBiggest = element;
			}
		}

		System.out.println("\nSecond Smallest is " + secondSmallest);
		System.out.println("Second Biggest is " + secondBiggest);
	}

}
