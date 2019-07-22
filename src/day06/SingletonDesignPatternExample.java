package day06;

class SingletonClass {
	private static SingletonClass ref;

	private SingletonClass() {
		System.out.println("Hello");
	}

	public static SingletonClass getSingleton() {
		if (ref == null) {
			ref = new SingletonClass();
		}
		return ref;
	}
}

public class SingletonDesignPatternExample {

	public static void main(String[] args) {
		SingletonClass.getSingleton();
	}

}
