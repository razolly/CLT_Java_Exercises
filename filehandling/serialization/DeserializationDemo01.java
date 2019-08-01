package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo01 {

	public static void main(String[] args) {

		SerializationDemo01 e = null;

		try {
			FileInputStream fileIn = new FileInputStream("john.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (SerializationDemo01) in.readObject(); // Deserialized object
			in.close();
			fileIn.close();

		} catch (IOException i) {
			i.printStackTrace();

		} catch (ClassNotFoundException c) {
			System.out.println("Serialization class not found");
			c.printStackTrace();
			return;
		}

		System.out.println("Deserialized Player...");
		System.out.println("Name: " + e.name);
		System.out.println("Address: " + e.city);
		System.out.println("Age: " + e.age);
		System.out.println("Number: " + e.mobile); // because variable was declared as transient
	}

}
