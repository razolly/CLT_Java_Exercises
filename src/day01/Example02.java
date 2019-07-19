package day01;

class UserApplication{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
} // end of UserApplication

class StaticDemo {
	static int number = 10;
	int number2 = 30;
}

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hii");	
		UserApplication.main(null);
		
		System.out.println(StaticDemo.number);
		
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.number2);
	}

} 
