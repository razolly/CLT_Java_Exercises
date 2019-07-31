package day12;

import java.util.LinkedList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		
		// Create new list without specified type
		List list = new LinkedList();
		
		// Add an Integer type to the list
		list.add(new Integer(1));

		// The list can hold any data type. It does not recognize 
		// the newly added variable as Integer data type
		// Get the Object from the list and cast as Integer
		Integer number1 = (Integer) list.iterator().next();
		
		
		
		// To make it simpler, we can specify a data type that the List can hold
		List<Integer> newList = new LinkedList<>();
		
		newList.add(1);
		
		// No need to cast as Integer has already been specified
		Integer number2 = newList.iterator().next();
	}

}
