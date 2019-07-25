package view;

import java.util.Scanner;

public class ATMServiceViewImpl implements ATMServiceView {
	
	Scanner sc;
	
	public ATMServiceViewImpl() {
		sc = new Scanner(System.in);
	}
	
	@Override
	public String requestEmailAddress() {
		
		System.out.println("Enter email address: ");
		String email = sc.next();
		
		return email;
	}

	@Override
	public String requestPassword() {
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
		System.out.println("Re-enter password: ");
		String retypePassword = sc.next();
		
		//TODO retype password
		while(!password.equals(retypePassword)) {
			displayRetypedPasswordError();
			
			System.out.println("Enter password: ");
			password = sc.next();
			
			System.out.println("Re-enter password: ");
			retypePassword = sc.next();
		}
		
		return password;
	}

	@Override
	public String requestFavoriteColor() {
		
		System.out.println("What is your favourite color? ");
		String favouriteColor = sc.next();
		
		System.out.println(favouriteColor + " is your security key, in case you forget your password.");
		
		return favouriteColor;
	}

	@Override
	public void displayExistingEmailError() {
		System.out.println("Email already exists!");
	}

	@Override
	public void displayRetypedPasswordError() {
		System.out.println("Password doesn't match!");
	}

	@Override
	public void displaySuccessMessage() {
		System.out.println("Registration Successful!");
	}

}
