package day07;

public class CommandLineArgumentExample {

	public static void main(String[] city) {

		String cityNames[] = city;

		// for loop
		for (int i = 0; i < cityNames.length; i++) {
			System.out.println(cityNames[i]);
		}

		// for-each loop
		for (String c : cityNames) {
			System.out.println(c);
		}

	}

}
