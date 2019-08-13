package aug13_java8;

import java.util.ArrayList;
import java.util.List;

/*
 * https://www.javatpoint.com/java-8-foreach
 * Java provides a new method forEach() to iterate the elements. 
 * It is defined in Iterable and Stream interface.
 */

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Orange");
		fruitList.add("Watermelon");
		
		// For-each method 
		// Takes single parameter which is a functional interface. 
		// Can pass lambda expression as an argument.
		fruitList.forEach(fruit -> System.out.println(fruit));
	}

}
