package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo01 implements Serializable {

	String name, city;
	int age;
	transient int mobile; 	// transient prevents variable from being serialized
							// static can also be used to prevent serialization

	public static void main(String[] args) {

		SerializationDemo01 e = new SerializationDemo01();
		e.name = "John";
		e.city = "London";
		e.mobile = 111222333;
		e.age = 30;

		try {

			FileOutputStream fileOut = new FileOutputStream("john.txt"); // create
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();

		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}

}
