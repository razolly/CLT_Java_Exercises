package day04;

abstract class Visa {	// Will behave like a parent class
	
	abstract void login();
	
	void logout() {
		System.out.println("Logging out");
	}
}

class Hsbc extends Visa {	// Behaves as child class

	@Override
	void login() {
		System.out.println("Login");
	}
	
}

public class AbstractClassExample01 {

	public static void main(String[] args) {

		Hsbc h = new Hsbc();
		
		h.login();
		h.logout();
		
	}

}
