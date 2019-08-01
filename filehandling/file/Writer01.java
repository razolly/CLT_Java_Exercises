package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Writer01 {

	public static void main(String[] args) {
				
		try {
			
			boolean doesFileExist = false;
			
			File f = new File("someTextFile.doc");
			System.out.println(f.exists()); 		// Check if file exists		false or true
			
			doesFileExist = f.createNewFile();		// Create a file if doesn't exist		
			System.out.println(doesFileExist); 		// Already there?			false or true
			System.out.println(f.exists());			// Check if file exists		false or true
			
			FileWriter fw = new FileWriter("someTextFile.doc");
			BufferedWriter br = new BufferedWriter(fw);
			
			br.write("This is a file writer");
			br.newLine();
			
			br.write("I am learning file handling");
			br.newLine();
			
			br.write("Its a little weird");
			br.newLine();
			
			br.write("Just teach us Spring already!");
			br.newLine();
			
			br.write("Or some Kotlin!");
			br.newLine();
			
			br.write("Maybe not SQL");
			br.newLine();
			
			br.write("But its important");
			br.newLine();
			
			br.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
