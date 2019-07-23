package Assignment1;

public class Problem01 {

	public static void main(String[] args) {

		// Loop 4 times
		for(int i = 0; i < 4; i++) {
			// Prints * one time and repeats on the same line
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			// Go to the next line
			System.out.println();
		}
	}

}
