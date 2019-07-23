package Assignment1;

public class Problem12 {

	/* 
	 * Find the second largest and second smallest element in an array 
	 */
	public static void main(String[] args) {

		//int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] array = new int[] { 1111, 222, 33, 4, 555555, 6 };
		int smallest = array[0]; 
		int biggest = array[0];
		
		// Loop through array to find the biggest
		// and the smallest elements
		for(int element: array) {
			
			// Find the smallest element
			if(element < smallest) {
				smallest = element;
			}
			
			// Find the biggest element
			if(element > biggest) {
				biggest = element;
			}
		}
		
		System.out.println("Smallest is " + smallest);
		System.out.println("Biggest is " + biggest);
		
		int secondSmallest = array[0] + 1; 
		int secondBiggest = array[0] - 1;
		
		// Loop through array to find the SECOND biggest
		// and the SECOND smallest elements
		for(int element: array) {
			
			// Find the second smallest element
			if(element < secondSmallest && element != smallest) {
				secondSmallest = element;
			}
			
			// Find the second biggest element
			if(element > secondBiggest && element != biggest) {
				secondBiggest = element;
			}
		}
		
		System.out.println("\nSecond Smallest is " + secondSmallest);
		System.out.println("Second Biggest is " + secondBiggest);
		
		
	}

}
