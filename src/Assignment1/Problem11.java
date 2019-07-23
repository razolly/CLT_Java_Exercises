package Assignment1;

public class Problem11 {

	/* 
	 * Remove duplicate elements from an array 
	 */
	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 1, 2, 3, 4 };
		int searchElement; // The current element being searched for

		// Loop through each element
		// If a duplicate element is found, then set it to 0
		for (int i = 0; i < array.length - 1; i++) {
			// Set as the current element to be searched
			searchElement = array[i];

			// Look for duplicates in the rest of the array
			for (int j = i + 1; j < array.length; j++) {

				if (array[j] == searchElement) {
					// If duplicate is found, set value to 0
					array[j] = 0;
				}
			}
		}

		// Display new array with unique elements
		for (int i : getNewUniqueArray(array)) {
			System.out.println(i + " ");
		}
	}
	
	static int[] getNewUniqueArray(int[] array) {
		
		int noOfUniqueElements = 0;
		
		// Get number of unique elements
		for (int i : array) {
			if (i != 0) {
				noOfUniqueElements++;
			}
		}
		
		// Create new array to hold all unique elements
		int[] uniqueArray = new int[noOfUniqueElements];
		int count = 0;	// To hold index and insert element in new array
		for (int element : array) {
			if (element != 0) {
				uniqueArray[count++] = element;
			}
		}
		
		return uniqueArray;
	}

}
