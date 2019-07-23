package day03;

class MasterCard {
	
	static void loginAuthentication1() {
		System.out.println("I am in Visa => loginAuthentication1");
	}
	
	void loginAuthentication2() {
		System.out.println("I am in Visa => loginAuthentication2");
	}
}

class DbsBank extends MasterCard {
	
	static void loginAuthentication1() {
		System.out.println("I am in DbsBank => loginAuthentication1");
	}
	
	void loginAuthentication2() {
		System.out.println("I am in DbsBank => loginAuthentication2");
	}
}

public class InheritanceDemo2 {

	public static void main(String[] args) {

		//MasterCard mc = new DbsBank(); // up casting
		DbsBank mc = (DbsBank) new MasterCard(); // down casting
		mc.loginAuthentication1();
		mc.loginAuthentication2();
		
	}

}
