package Assignment1;

public class Problem11 {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 1, 2, 3, 4 };
		int searchElement; // The current element being searched for
		
		for(int i = 0; i < array.length; i++) {
			searchElement = array[i];
			
			// Look for duplicates
			if(array[i] == searchElement) {
				
				// If found, set value to 0
				array[i] = 0;
			}
		}
		
		// Print array
		for(int i : array) {
			System.out.println(i + " ");
		}
	}

}
