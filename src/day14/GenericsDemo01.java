package day14;

class GenericClass<T> {

	T object;

	public GenericClass(T object) {
		this.object = object;
	}

	public void displayType() {
		System.out.println("This holds objects of type: " + object.getClass().getName());
	}

}

class User {
	
	String name;
	int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

public class GenericsDemo01 {

	public static void main(String[] args) {

		GenericClass s1 = new GenericClass<Integer>(15);
		GenericClass s2 = new GenericClass<String>("Hello");
		GenericClass s3 = new GenericClass<Double>(0.5);
		GenericClass s4 = new GenericClass<User>(new User("John", 20));

		s1.displayType();	// Integer
		s2.displayType();	// String
		s3.displayType();	// Double
		s4.displayType();	// User

	}

}
