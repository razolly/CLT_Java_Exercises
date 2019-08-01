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
	 * Ask user for file name 
	 * if it exists, open it, else create it 
	 * ask user to enter text into file 
	 * do word count and print to console
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Ask user for file name
		System.out.print("What file do you want to read from? ");
		String filename = sc.next();

		try {

			// Check if it exists, else create it
			File f = new File(filename + ".txt"); // TODO what if user enters .txt? It will be .txt.doc
			if (!f.exists()) {
				System.out.println(f + " does not exist! Creating " + f + "!\n");
				f.createNewFile();
			} else {
				System.out.println("Opening " + f + "\n");
			}

			// Ask user for text to enter into file
			BufferedWriter br = new BufferedWriter(new FileWriter(f));
			boolean quit = false;
			String userInput;

			sc.nextLine(); // Clear buffer

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

			// Display text entered and do word count
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
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	/* 
	 * Ask for file name
	 * If it exists, return the file name (with .txt appended) 
	 * Else, create it and return the file name
	 */
	static String findOrCreateFile() {
		// This comment should not be on master branch
		return "";
	}

}
