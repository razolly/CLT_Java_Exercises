package day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

class Vegetable {
	
	String color;
	int weight;
	
	public Vegetable(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "I am " + color + " and " + weight + "kg";
	}
	
}

public class WildCardDemo {

	public static void main(String[] args) {

		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Orange");
		fruitList.add("Watermelon");
		printCollection(fruitList);
		
		HashMap<String, Vegetable> vegMap = new HashMap<>();
		vegMap.put("Broccoli", new Vegetable("Green", 15));
		vegMap.put("Carrot", new Vegetable("Orange", 5));
		vegMap.put("Cauliflower", new Vegetable("White", 10));
		//printCollection(vegMap);
	}

	static void printCollection(Collection c) {
		
		Iterator itr = c.iterator();
		
		// Display elements in the collection
//		for (int i = 0; i < c.size(); i++) {
//			System.out.println(itr.next());
//		}
		
		for(Object o: c) {
			System.out.println(o);
		}
	}

}
