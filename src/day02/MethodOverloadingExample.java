package day02;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		
		System.out.println("Class loader loads this main");
		main(20);
	}
	
	public static void main(int number) {
		
		main("data");
		System.out.println(number);
	}
	
	public static void main(String reference) {
		
		System.out.println(reference);

	}

}
