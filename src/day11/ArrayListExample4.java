package day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample4 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("data1");
		list.add("data2");
		list.add("data3");
		list.add("data4");

		System.out.println("Loop with simple for-loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Loop with enhanced for loop");
		for (Object object : list) {
			System.out.println(object);
		}

		System.out.println("Loop with Java 1.8 forEach and lambda");
		list.forEach(temp -> System.out.println(temp));

		System.out.println("Loop with iterator");
		Iterator itr = list.iterator(); // Iterator is interface not class
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
