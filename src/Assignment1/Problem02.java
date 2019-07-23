package Assignment1;

public class Problem02 {

	public static void main(String[] args) {

		// Loop 5 times
		for(int i = 0; i < 5; i++) {
			// Prints number one time and repeats on the same line
			// Increment the number every time it prints
			for(int j = 0; j <= i; j++) {
				System.out.print(j + 1);
			}
			// Go to next line
			System.out.println();
		}
	}

}
