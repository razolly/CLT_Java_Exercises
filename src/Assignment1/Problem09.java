package Assignment1;

import java.util.Arrays;
import java.util.List;

public class Problem09 {

	/*
	 * How do I determine whether an array contains a particular value in Java? Use
	 * Java 1.8 streams
	 */
	public static void main(String[] args) {

		// Create list of integers
		List<Integer> number = Arrays.asList(2, 3, 4, 5);

		// Value to be searched for
		int searchValue = 6;

		// Loop through the stream to find the value
		// If found, it should not be null
		if (number.stream()
				.filter(value -> value.equals(searchValue))
				.findAny()
				.orElse(null) != null) {
			System.out.println("Value was found!");
		} else {
			System.out.println("Value not found...");
		}

	}

}
