package Assignment1;

public class Problem03 {

	public static void main(String[] args) {
		
		char c = 'A';

		// Loop 5 times
		for(int i = 0; i < 5; i++) {
			// Prints alphabet one time and repeats on the same line
			for(int j = 0; j <= i; j++) {
				System.out.print(c);
			}
			// Go to next line
			System.out.println();
			
			// Change to the next character eg. from 'A' to 'B'
			c += 1;	
		}
	}

}
