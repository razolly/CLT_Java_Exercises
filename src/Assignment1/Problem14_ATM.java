package Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

class User {

	private Credentials credential;
	private AccountInfo accountInfo;

	User() {
		credential = new Credentials();
		accountInfo = new AccountInfo();
	}

	public Credentials getCredential() {
		return credential;
	}

	public AccountInfo getAccountInfo() {
		return accountInfo;
	}
}

class Credentials {

	private String username;
	private String password;
	private String email;
	private String favouriteColor;

	public Credentials() {
		username = "";
		password = "";
		email = "";
		favouriteColor = "";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFavouriteColor() {
		return favouriteColor;
	}

	public void setFavouriteColor(String favouriteColor) {
		this.favouriteColor = favouriteColor;
	}

	// TODO method for resetting password (requires favourite color)
}

class AccountInfo {

	private int balance;

	public AccountInfo() {
		balance = 1000; // Set balance to $1000 by default
	}

	/* Returns balance. Calling method can print the returned value */
	public int checkAvailableBalance() {
		return balance;
	}

	public void depositAmount(int amount) {
		balance += amount;
	}

	/*
	 * Returns true if able to withdraw and deducts amount from balance returns
	 * false if unable to withdraw due to insufficient value
	 */
	public boolean withdrawAmount(int amount) {
		if (balance < amount) {
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}
}

public class Problem14_ATM {

	/*
	 * Create a console based Java Application (ATM)
	 */
	public static void main(String[] args) {

		int userChoice;
		ArrayList<User> listOfUser = new ArrayList<User>();

		Scanner sc = new Scanner(System.in);

		do {
			displayMenu();
			System.out.print("\n\nEnter your choice: ");
			userChoice = sc.nextInt();

			switch (userChoice) {
			case 1:
				register(listOfUser);
				break;
			case 2:
				login();
				break;
			case 3:
				forgotPassword();
				break;
			case 4:
				logout();
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		} while (userChoice != 4);

	}

	static void register(ArrayList<User> lisfOfUser) {

		// Get email address
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter email address: ");
		String email = sc.next();

		// Check if email already exists
		while (!isEmailValid(lisfOfUser, email)) {
			System.out.print("\nEnter email address: ");
			email = sc.next();
		}

		// Get password
		System.out.print("Enter Password: ");
		String password = sc.next();

		// Re-enter password
		System.out.print("Re-type Password: ");
		String retypePassword = sc.next();

		// Check if both passwords are same
		while (!password.equals(retypePassword)) {
			System.out.println("Password does not match!");
			System.out.print("\nRe-type Password: ");
			retypePassword = sc.next();
		}

		// Get favorite color
		System.out.print("\nWhat is your favourite color? ");
		String favColor = sc.next();
		System.out.println(favColor + " is your security key, in case you forget your password.");

		// Store details of user in a POJO class
		User newUser = new User();
		newUser.getCredential().setEmail(email);
		newUser.getCredential().setPassword(password);
		newUser.getCredential().setFavouriteColor(favColor);
		lisfOfUser.add(newUser);

		// Display success message
		System.out.println("\nRegistration Successful!");
	}

	static void login() {

		// Get username
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter User ID: ");
		String username = sc.next();

		// Get password
		System.out.print("Enter password: ");
		String password = sc.next();

		// Check if user credentials is valid
		while (!isUserDataValid(username, password)) {
			System.out.print("\nEnter User ID: ");
			username = sc.next();

			System.out.print("Enter password: ");
			password = sc.next();
		}

		System.out.println("\nLogin Successful!");

		int userAccountChoice;

		// Display next menu. Loop until user quits (choice 4)
		do {
			displayAccountOptions();
			System.out.print("\nEnter your choice: ");
			userAccountChoice = sc.nextInt();

			switch (userAccountChoice) {
			case 1:
				checkBalance();
				break;
			case 2:
				depositAmount();
				break;
			case 3:
				withdrawAmount();
				break;
			case 4: // Exit menu
				break;
			default:
				System.out.println("Invalid choice!");
				break;
			}
		} while (userAccountChoice != 4);

	}

	static void forgotPassword() {

	}

	static void logout() {
		System.out.println("\nSystem shut down!");
	}

	static void checkBalance() {
		int balance = 0;
		System.out.println("Available balance: " + balance);
		System.out.print("Wish to continue? (y/n): ");

		Scanner sc = new Scanner(System.in);
		if (sc.next().equals("y")) {
			// Do nothing
		}
	}

	static void depositAmount() {

		// Get amount to deposit
		System.out.print("\nEnter Amount: ");
		Scanner sc = new Scanner(System.in);
		int depositAmount = sc.nextInt();

		while (depositAmount < 0) {
			System.out.println("Amount can't be negative!");
			System.out.print("\nEnter Amount: ");
			depositAmount = sc.nextInt();
		}

		System.out.println("$" + depositAmount + " deposited successfully!");
		// System.out.print("\nWish to continue? (y/n): ");
	}

	static void withdrawAmount() {

	}

	static boolean isEmailValid(ArrayList<User> listOfUser, String email) {

		// Check if email exists within list of users
		for (User user : listOfUser) {
			if (user.getCredential().getEmail().equals(email)) {
				System.out.println("Email already exists!");
				return false;
			}
		}
		return true;
	}

	static boolean isUserDataValid(String username, String password) {
		return true;
	}

	static void displayMenu() {
		System.out.println("-----------------------------------------------------");
		System.out.println("------------------- ATM Options ---------------------");
		System.out.println("-----------------------------------------------------");
		System.out.print(
				"User Home Page: " + "\n1. Register" + "\n2. Login" + "\n3. Forgot Password" + "\n4. Logout (exit)");
		// System.out.print("\n\nEnter your choice: ");
	}

	static void displayAccountOptions() {
		System.out.println("--------------------------------------------------------");
		System.out.println("------------------- Account Options --------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println(
				"Type 1: Check Available Bank Balance\nType 2: Deposit Amount\nType 3: Withdraw Amount\nType 4: Quit");
	}

}
