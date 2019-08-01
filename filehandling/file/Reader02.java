package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*
 * This class is a more concise version of class Reader01
 */
public class Reader02 {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;

		try {

			// Use filereader to get data from file
			fr = new FileReader("sample.txt");

			// Store content read via file reader
			BufferedReader br = new BufferedReader(fr);

			// Read the text in the buffer and display
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (Exception e) {
			
			System.out.println("Sorry file not found");
			
		} finally {
			
			fr.close();
		}

	}

}
