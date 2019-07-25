package view;

import java.util.ArrayList;
import java.util.Scanner;

import pojo.User;

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
	
	/* 
	 * Request a SINGLE password. Does not request password to be retyped 
	 */
	@Override
	public String requestPassword() {
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
		return password;
	}
	
	/* 
	 * Request a NEW password. This includes retyping the password 
	 */
	@Override
	public String requestNewPassword() {

		System.out.println("Enter password: ");
		String password = sc.next();

		System.out.println("Re-enter password: ");
		String retypePassword = sc.next();

		// TODO retype password
		while (!password.equals(retypePassword)) {
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

	@Override
	public void displayAllUsers(ArrayList<User> users) {
		for (User user : users) {
			System.out.println();
			System.out.println(user.getCredential().getEmail());
			System.out.println(user.getCredential().getPassword());
			System.out.println(user.getCredential().getFavouriteColor());
			System.out.println(user.getAccountInfo().getBalance());
		}
	}

	@Override
	public void displayLogoutMessage() {
		System.out.println("Logged out successfully!");
	}

	@Override
	public void displayLoginSuccessfulMessage() {
		System.out.println("Login Successful!");
	}

	@Override
	public void displayAccountMenu() {
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println("------------------- Account Options --------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println(
				"Type 1: Check Available Bank Balance\nType 2: Deposit Amount\nType 3: Withdraw Amount\nType 4: Quit");
	}

	@Override
	public int requestUserChoice() {
		
		System.out.print("\nEnter your choice: ");
		int choice = sc.nextInt();
		
		return choice;
	}

}
