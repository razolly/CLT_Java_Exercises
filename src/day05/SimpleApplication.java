package day05;

import java.util.Scanner;

class A {
	
	B refB;

	public B getRefB() {
		return refB;
	}

	public void setRefB(B refB) {
		this.refB = refB;
	}
	
}

class B {
	
	C refC;

	public C getRefC() {
		return refC;
	}

	public void setRefC(C refC) {
		this.refC = refC;
	}
	
}

class C {
	String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	void displayMessage() {
		System.out.println(message);
	}
}

public class SimpleApplication {

	public static void main(String[] args) {
		
		A refA;
		B refB;
		C refC;
		
		refA = new A();
		refB = new B();
		refC = new C();
		
		refC.setMessage(getMessage());
		refB.setRefC(refC);
		refA.setRefB(refB);
		
		refA.getRefB().getRefC().displayMessage();
		
	}
	
	static String getMessage() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter message: ");
		return sc.next();
	}

}
