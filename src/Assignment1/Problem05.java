package Assignment1;

public class Problem05 {

	public static void main(String[] args) {

		// Loops 5 times. Counter "i" decrements
		for(int i = 5; i > 0; i--) {
			// Prints number one time and repeats on the same line
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			// Go to next line
			System.out.println();
		}
	}

}
