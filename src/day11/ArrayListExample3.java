package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer {

	String name;

	public Customer(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}

public class ArrayListExample3 {

	public static void main(String[] args) {

		List refList = new ArrayList();

		refList.add(new Customer("Charles"));
		refList.add(new Customer("Jerret"));

		Scanner sc = new Scanner(System.in);

		boolean quit = false;

		while (!quit) {
			System.out.print("Enter name: ");
			String name = sc.next();

			if (name.equals("quit")) {
				quit = true;
				break;
			}
			
			// Check if name exists
			for(Object c: refList) {
				if(c.hashCode() == name.hashCode()) {
					System.out.println(c.hashCode());
					System.out.println(name.hashCode());
					System.out.println(c.toString() + " already exists!");
					continue;
				}
			}
			
			refList.add(new Customer(name));
		}

		System.out.println(refList);
	}

}








