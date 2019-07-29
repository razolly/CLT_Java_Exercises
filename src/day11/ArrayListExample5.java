package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee {

	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}

}

public class ArrayListExample5 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(new Employee("John", 34));
		list.add(new Employee("Adam", 30));
		list.add(new Employee("Elias", 21));
		list.add(new Employee("Ariana", 36));
		list.add(new Employee("Barry", 44));

		// Sort by name
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// For String, we use compareTo
				return o1.getName().compareTo(o2.getName()); 
			}
		});

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Sort by Age
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// For int, we use -
				return o1.getAge() - o2.getAge() ;
			}
			
		});
		
		System.out.println();
		Iterator itr2 = list.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
