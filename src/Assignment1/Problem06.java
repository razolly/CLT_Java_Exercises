package Assignment1;

public class Problem06 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				if (i > 2) {
					System.out.print("*");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
