package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WriteRead01 {

	/*
	 * Ask user for file name if it exists, open it, else create it ask user to
	 * enter text into file do word count and print to console
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			// Ask user for file name
			System.out.print("What file do you want to read from? ");
			String fileName = sc.next();

			// Check if file exists, else create it
			File f = findOrCreateFile(fileName);

			// Ask if want to read or write
			System.out.println("Choose an option:\n1) Display file contents\n2) Edit file contents");
			System.out.print("\nYour option: ");

			String choice = sc.next();

			if (choice.equals("1")) {

				displayFileContents(f);

			} else if (choice.equals("2")) {

				editFileContents(f);
				displayFileContents(f);

			} else {

				System.out.println("Invalid choice!");
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	/*
	 * Asks user for input to enter into file
	 */
	private static void editFileContents(File f) throws IOException {

		Scanner sc = new Scanner(System.in);

		// Ask user for text to enter into file
		BufferedWriter br = new BufferedWriter(new FileWriter(f));
		boolean quit = false;
		String userInput;

		System.out.println();

		while (!quit) {

			System.out.print("Enter some text to file (Type q to quit) : ");
			userInput = sc.nextLine();

			if (userInput.equals("q")) {
				quit = true;
				break;
			}

			br.write(userInput);
			br.newLine();

		}

		br.close();
	}

	/*
	 * Displays contents and word count of a file
	 */
	private static void displayFileContents(File f) throws IOException {

		int wordCount = 0;

		if (f.exists()) {

			System.out.println("\nReading contents of " + f);

			// Use filereader to get data from file
			FileReader fr = new FileReader(f);

			// Store content read via file reader
			BufferedReader br2 = new BufferedReader(fr);

			// Read the text in the buffer and display
			String currentLine;
			while ((currentLine = br2.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(currentLine);
				wordCount += st.countTokens();
				System.out.println(currentLine);
			}

			fr.close();

			// Do word count and print to console
			System.out.println("\nWord count: " + wordCount);

		} else {

			System.out.println(f + " does not exist!");
		}
	}

	/*
	 * Ask for file name If it exists, return the file name (with .txt appended)
	 * Else, create it and return the file name
	 */
	private static File findOrCreateFile(String fileName) throws IOException {

		File f = null;

		// Check if file name already has .txt or .doc at the back else, append it
		if (fileName.contains(".txt") || fileName.contains(".doc")) {
			f = new File(fileName);
		} else {
			f = new File(fileName + ".txt");
		}

		// Check if file exists. Else, create it
		if (!f.exists()) {
			System.out.println(f + " does not exist! Creating " + f + "!\n");
			f.createNewFile();
		} else {
			System.out.println("Opening " + f + "\n");
		}

		return f;
	}

}
