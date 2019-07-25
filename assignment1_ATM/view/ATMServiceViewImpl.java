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

		System.out.print("\nEnter email address: ");
		String email = sc.next();

		return email;
	}

	/*
	 * Request a SINGLE password. Does not request password to be retyped
	 */
	@Override
	public String requestPassword() {

		System.out.print("Enter password: ");
		String password = sc.next();

		return password;
	}

	/*
	 * Request a NEW password. This includes retyping the password
	 */
	@Override
	public String requestNewPassword() {

		System.out.print("Enter password: ");
		String password = sc.next();

		System.out.print("Re-enter password: ");
		String retypePassword = sc.next();

		// TODO retype password
		while (!password.equals(retypePassword)) {
			displayRetypedPasswordError();

			System.out.print("Enter password: ");
			password = sc.next();

			System.out.print("Re-enter password: ");
			retypePassword = sc.next();
		}

		return password;
	}

	@Override
	public String requestFavoriteColor() {

		System.out.print("What is your favourite color? ");
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
	public void displayRegistrationSuccessMessage() {
		System.out.println("\nRegistration Successful!");
	}

	@Override
	public void displayWithdrawSuccessMessage(int withdrawAmount) {
		System.out.println("$" + withdrawAmount + " withdrawn successfully!");
	}

	@Override
	public void displayAllUsers(ArrayList<User> users) {
		for (User user : users) {
			System.out.println();
			System.out.println("Email: \t\t" + user.getCredential().getEmail());
			System.out.println("Password: \t" + user.getCredential().getPassword());
			System.out.println("Security Key: \t" + user.getCredential().getFavouriteColor());
			System.out.println("Balance: \t$" + user.getAccountInfo().getBalance());
		}
	}

	@Override
	public void displayLogoutMessage() {
		System.out.println("\nLogged out successfully!");
	}

	@Override
	public void displayLoginSuccessfulMessage() {
		System.out.println("\nLogin Successful!");
	}

	@Override
	public void displayLoginFailMessage() {
		System.out.println("Login failed! Invalid username/password...");
	}

	@Override
	public void displayAccountMenu() {
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println("------------------- Account Options --------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println(
				"Type 1: Check Available Bank Balance\nType 2: Deposit Amount\nType 3: Withdraw Amount\nType 4: Quit");
		System.out.println();
	}

	@Override
	public int requestUserChoice() {

		boolean isInputValid = false; 	// Flag to check if input is valid
		int choice = -1; 	// Rubbish value

		while (!isInputValid) {
			try {
				System.out.print("\nEnter your choice: ");
				choice = sc.nextInt();
				isInputValid = true; 	// break out of loop
			} catch (Exception e) {
				System.out.println("Invalid input!");
				sc.next();	// Clear scanners buffer
			}
			
		}

		return choice;
	}

	@Override
	public void displayAccountBalance(int balance) {
		System.out.println("\nAvailable balance: $" + balance);
	}

	@Override
	public int requestDepositAmount() {

		System.out.print("\nEnter amount: $");
		int depositAmount = sc.nextInt();

		// Ensure amount is not negative
		while (depositAmount < 0) {
			System.out.println("Amount cannot be negative!");
			System.out.print("Enter amount: $");
			depositAmount = sc.nextInt();
		}

		return depositAmount;
	}

	@Override
	public void displayDepositSuccessMessage(int amount) {
		System.out.println("$" + amount + " successfully deposited!");
	}

	@Override
	public int requestWithdrawAmount() {

		System.out.print("\nEnter amount: $");
		int withdrawAmount = sc.nextInt();

		// Ensure amount is not negative
		while (withdrawAmount < 0) {
			System.out.println("Amount cannot be negative!");
			System.out.print("Enter amount: $");
			withdrawAmount = sc.nextInt();
		}

		return withdrawAmount;
	}

	@Override
	public void displayInsufficientBalanceMessage() {
		System.out.println("Sorry! Insufficient balance...");
	}

	@Override
	public String requestSecurityKey() {

		System.out.print("Enter security key: ");
		String favoriteColor = sc.next();

		return favoriteColor;
	}

	@Override
	public void displaySecurityKeyFailMessage() {
		System.out.println("Sorry! Security key invalid...");
	}

	@Override
	public void displayPasswordResetSuccessMessage() {
		System.out.println("Your password has been reset successfully!");
	}

	@Override
	public void displayUserAlreadyExistsMessage() {
		System.out.println("Email already exists!");
	}

}
