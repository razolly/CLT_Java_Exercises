package Assignment1;

public class Problem06 {

	public static void main(String[] args) {

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 0; j < i; j++) {
//				if (i > 2) {
//					System.out.print("*");
//				}
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// Loop 5 times
		for (int i = 0; i < 5; i++) {
			// Prints * one time and repeats on the same line
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			// Print an extra * if at row 3
			if(i > 1) {
				System.out.print("*");
			}
			// Go to the next line
			System.out.println();
		}
	}

}
