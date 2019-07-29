package day11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<Object>();
		list.add("Hello");
		list.add(50);
		list.add(new User("Boi"));

		for (Object object : list) {
			System.out.println(object);
		}

	}

}

class User {
	String name;

	public User(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}