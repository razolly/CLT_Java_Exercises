package day04;

interface Bank {
	void deposit();
	abstract void withdraw();
	void checkBalance();
	final static int CODE = 204050;	// Can be called by Bank.CODE
}

interface UserLoginCredential {
	void userLogin();
	void userLogout();
}

@FunctionalInterface
interface SingleMethod {
	void method1();
	// void method2();
}

interface DefaultMethod extends SingleMethod {
	default public void myMethod() {
		System.out.println("from Java 1.8 version we can have a method with a body");
	}
}

class CitiBank implements Bank, UserLoginCredential {

	@Override
	public void userLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userLogout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
