package day02;

class MyClass {
	int number1 = 20;
	
	void displayNumber() {
		System.out.println(number1);
	}
}

public class JVMDemo {
	
	

	public static void main(String[] args) {

		MyClass myClass = new MyClass();
		myClass.displayNumber();
		
	}

}
