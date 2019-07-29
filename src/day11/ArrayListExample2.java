package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample2 {

	public static void main(String[] args) {

		List list = new MyList<String>();
		Scanner sc = new Scanner(System.in);

		boolean quit = false;
		String s;

		while (!quit) {
			System.out.print("\nEnter a name: ");
			s = sc.next();

			if (s.equals("quit")) {
				quit = true;
				break;
			} else if (s.equals("print")) {
				System.out.println(((MyList<String>) list).getObjects());
			} else {
				list.add(s);
			}
		}
	}

}

class MyList<T> extends ArrayList<T> {

	ArrayList<T> objects;

	public MyList() {
		objects = new ArrayList<T>();
	}

	@Override
	public boolean add(T e) {

		if (objects.contains(e)) {
			System.out.println(e.toString() + " already exists!");
			return false;
		}

		objects.add(e);
		System.out.println(e.toString() + " was added");
		return true;
	}

	ArrayList<T> getObjects() {
		return objects;
	}

}
