package Assignment1;

public class Problem04 {

	public static void main(String[] args) {
		
		// Loop 4 times. The counter decrements from 4 to 1
		for(int i = 4; i > 0; i--) {
			// Prints * one time and repeats on the same line
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			// Go to next line
			System.out.println();
		}
	}

}
