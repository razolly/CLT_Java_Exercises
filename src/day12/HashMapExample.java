package day12;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap();
		map.put(52, "Oracle");
		map.put(12, "Java");
		map.put(40, "Python");

		for (Map.Entry e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		TreeMap treeMap = new TreeMap(map);
		System.out.println("Sorted HashMap: " + treeMap);

	}

}
