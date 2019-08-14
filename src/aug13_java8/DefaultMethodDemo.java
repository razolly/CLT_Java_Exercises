package aug13_java8;


/*
 * https://www.javatpoint.com/java-default-methods
 * The concept of default method is used to define a method with 
 * default implementation. You can override default method also to 
 * provide more specific implementation for the method.
 */
interface Service {
	
	/*
	 * default method in interface
	 * No need to implement this method in the implementation classes
	 */  
	default void welcome() {
		System.out.println("Welcome! Have a nice day");
	}
	
	 /* 
	  * This is a static method. Static method in interface is
      * similar to default method except that we cannot override 
      * them in the implementation classes.
      * Need to implement in implementation classes
      */
	static void goodbye() {
		System.out.println("Goodbye!");
	}
	
	// abstract methods
	void giveFood();
	void getMoney();
}

class ServiceImpl implements Service {

	@Override
	public void giveFood() {
		System.out.println("Giving food!");
	}

	@Override
	public void getMoney() {
		System.out.println("Giving money!");
	}
	
}

public class DefaultMethodDemo {

	public static void main(String[] args) {
		
		new ServiceImpl().welcome();
		Service.goodbye();
	}

}
