package factory;

import java.util.Scanner;

public class FactoryDesignPatternExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your bank: ");
		String bankName = sc.next();
		
		Bank bankRef = BusinessLogic.myFactoryMethod(bankName);
		bankRef.offerCreditCard();
	}

}
