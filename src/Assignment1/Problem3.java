package Assignment1;

public class Problem3 {

	public static void main(String[] args) {
		
		char c = 'A';

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(c);
			}
			System.out.println();
			c += 1;
		}
	}

}
