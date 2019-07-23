package Assignment1;

public class Problem10 {

	public static void main(String[] args) {

		int[] input1 = new int[] { 1, 5, 10, 20, 40, 80 };
		int[] input2 = new int[] { 6, 7, 20, 80, 100 };
		int[] input3 = new int[] { 3, 4, 15, 20, 30, 70, 80, 120 };
		
		int curr;	// Hold the current number being searched for
		
		for(int i = 0; i < input1.length; i++) {
			// Loop through elements of 1st array and search for
			// that element in the other 2 arrays
			curr = input1[i];
			
			// Search for current number in the 2nd array
			for(int j = 0; j < input2.length; j++) {
				
				// If number is found in 2nd array, look for the 
				// current number in the 3rd array
				if(input2[j] == curr) {
					
					for(int k = 0; k < input3.length; k++) {
						
						// Search for current number in 3rd array
						if(input3[k] == curr) {
							System.out.print(curr + " ");
						}
					}
				}
				
			}
		}

	}

}
