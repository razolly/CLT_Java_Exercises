package day02;

class Mobile {
	
	int price;
	String brand;
	
	Mobile() {
		this(20);
		System.out.println("Default constructor");
	}
	
	Mobile(int price){
		this(50, "Dell");
		this.price = price;
		System.out.println("Price is " + price);
	}
	
	Mobile(int price, String brand) {
		this.price = price;
		this.brand = brand;
		System.out.println("Price is " + price + " and brand is " + brand);
	}
}

public class ConstructorExample {

	public static void main(String[] args) {

		new Mobile();
		
	}

}
