package day11;

// List, Set, Queue, Map

// List<T> interface
interface Book<T> { // Java is Type of book <T>
	void showDetails(T programming);
	// void add(T object)
}

// ArrayList<T> implements List<T>
class CoreJava<T> implements Book<T> {

	@Override
	public void showDetails(T java) {
		System.out.println(java);

	}

	// void add(T object)

}

class Person {

	String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class GenericsApplication {

	public static void main(String[] args) {

		Integer price = 60;
		Person person = new Person();
		person.setName("Boi");

		// CoreJava can take any data type in <>
		new CoreJava<Integer>().showDetails(price);
		new CoreJava<String>().showDetails("Complete reference");
		new CoreJava<Person>().showDetails(person);
	}

}
