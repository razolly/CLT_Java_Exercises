package file;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader01 {

	public static void main(String[] args) throws IOException {

		DataInputStream in = null;

		try {
			// Open the file
			// FileInputStream fs = new FileInputStream("c:\\file\\demo.txt"); // Absolute path
			// FileInputStream fs = new FileInputStream("sample.txt"); // Relative path
			// DataInputStream in = new DataInputStream(fs);
			// BufferedReader br = new BufferedReader(new InputStreamReader(in));

			// FileInputStream: obtains input bytes from a file in a file system
			// DataInputStream: lets an application read primitive Java data types 
			// from an underlying input stream in a machine-independent way
			// BufferedReader: Reads text from a character-input stream, buffering characters 
			// so as to provide for the efficient reading of characters, arrays, and lines.
			
			in = new DataInputStream(new FileInputStream("sample.txt"));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			String str;

			// Read file line by line
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (Exception e) {
			System.out.println("File not found...");
		} finally {
			// Close input stream
			in.close();
		}

	}

}
