package Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * POJO to store user information
 */
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

}

class AccountInfo {

	private int balance;

	public AccountInfo() {
		balance = 1000; // Set balance to $1000 by default
	}

	public void depositAmount(int amount) {
		balance += amount;
	}

	/*
	 * Returns true if able to withdraw and deducts amount from balance returns
	 * false if unable to withdraw due to insufficient value
	 */
	public boolean withdrawAmount(int amount) {
		if (isWithdrawOk(amount)) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	public int getBalance() {
		return balance;
	}

	public boolean isWithdrawOk(int amount) {
		if (balance < amount) {
			return false;
		} else {
			return true;
		}
	}
}

public class Problem14_ATM {

	/*
	 * Create a console based Java Application (ATM)
	 */
	public static void main(String[] args) {

		// Stores record of all Users registered. Similar to a database
		ArrayList<User> listOfUser = new ArrayList<User>();
		int userChoice;

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
				login(listOfUser);
				break;
			case 3:
				forgotPassword(listOfUser);
				break;
			case 4:
				logout();
				break;
			case 5:
				displayAllUserInfo(listOfUser); // Secret method
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		} while (userChoice != 4);

	}

	static void register(ArrayList<User> listOfUser) {

		// Get email address
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter email address: ");
		String email = sc.next();

		// Ensure email does not exist, before registering
		while (isEmailExisting(listOfUser, email)) {
			// Display error message
			System.out.println("\nEmail already exists!");
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
		System.out.print("What is your favourite color? ");
		String favColor = sc.next();
		System.out.println(favColor + " is your security key, in case you forget your password.");

		// Store details of user in a POJO class
		User newUser = new User();
		newUser.getCredential().setEmail(email);
		newUser.getCredential().setPassword(password);
		newUser.getCredential().setFavouriteColor(favColor);
		listOfUser.add(newUser);

		// Display success message
		System.out.println("\nRegistration Successful!");
	}

	static void login(ArrayList<User> listOfUser) {

		// Get username
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter User ID: ");
		String username = sc.next();

		// Get password
		System.out.print("Enter password: ");
		String password = sc.next();

		// Check if user credentials is valid
		while (!isUserDataValid(listOfUser, username, password)) {
			System.out.println("Invalid username/password!");
			System.out.print("\nEnter User ID: ");
			username = sc.next();

			System.out.print("Enter password: ");
			password = sc.next();
		}

		System.out.println("\nLogin Successful!");

		// Reference to the current user in the database
		User currUser = getCurrentUser(listOfUser, username);
		int userAccountChoice;

		// Display next menu. Loop until user quits (choice 4)
		do {
			displayAccountOptions();
			System.out.print("\nEnter your choice: ");
			userAccountChoice = sc.nextInt();

			switch (userAccountChoice) {
			case 1:
				checkBalance(currUser);
				break;
			case 2:
				depositAmount(currUser);
				break;
			case 3:
				withdrawAmount(currUser);
				break;
			case 4:
				System.out.println("\nThank you for banking with us!");
				break;
			default:
				System.out.println("Invalid choice!");
				break;
			}
		} while (userAccountChoice != 4);

	}

	static void forgotPassword(ArrayList<User> listOfUser) {

		// Get username
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter User ID: ");
		String username = sc.next();

		// Check if username exists. If not, loop
		while (!isEmailExisting(listOfUser, username)) {
			System.out.println("\nUser does not exist!");
			System.out.print("\nEnter User ID: ");
			username = sc.next();
		}

		// Get security key
		System.out.print("Enter security key: ");
		String securityKey = sc.next();

		// Check if security key is valid
		while (!isSecurityKeyValid(listOfUser, username, securityKey)) {
			System.out.println("Wrong security key!");

			System.out.print("\nEnter security key: ");
			securityKey = sc.next();
		}

		// Get new password
		System.out.print("Enter new password: ");
		String password = sc.next();

		// Retype password
		System.out.print("Retype password: ");
		String retypePassword = sc.next();

		// Check that both passwords are the same
		while (!password.equals(retypePassword)) {
			// Display error message
			System.out.println("\nPassword does not match!");

			// Get new password
			System.out.print("\nEnter new password: ");
			password = sc.next();

			// Retype password
			System.out.print("Retype password: ");
			retypePassword = sc.next();
		}

		// Get favourite color
		System.out.print("What is your favourite color? ");
		String favouriteColor = sc.next();
		System.out.println(favouriteColor + " is your security key, if you forget your password.");

		// Store new password and new color
		User user = getCurrentUser(listOfUser, username);
		user.getCredential().setFavouriteColor(favouriteColor);
		user.getCredential().setPassword(password);

		// Display success message
		System.out.println("\nYour password has been reset succesfully!");
	}

	static void logout() {
		System.out.println("\nLogged out successfully!");
	}

	/*
	 * Return reference to the User in database being searched for
	 */
	static User getCurrentUser(ArrayList<User> listOfUser, String username) {

		for (User user : listOfUser) {
			if (user.getCredential().getEmail().equals(username)) {
				return user;
			}
		}

		// Return nothing if user is not found
		return null;
	}

	static void checkBalance(User user) {

		System.out.println("Available balance: $" + user.getAccountInfo().getBalance());

	}

	static void depositAmount(User user) {

		// Get amount to deposit
		System.out.print("\nEnter Amount: $");
		Scanner sc = new Scanner(System.in);
		int depositAmount = sc.nextInt();

		// Loop until a positive amount is entered
		while (depositAmount < 0) {
			System.out.println("Amount can't be negative!");
			System.out.print("\nEnter Amount: $");
			depositAmount = sc.nextInt();
		}

		// Deposit amount in user account
		user.getAccountInfo().depositAmount(depositAmount);

		System.out.println("$" + depositAmount + " deposited successfully!");
	}

	static void withdrawAmount(User user) {

		// Get amount to withdraw
		System.out.print("\nEnter Amount: $");
		Scanner sc = new Scanner(System.in);
		int withdrawAmount = sc.nextInt();

		// If the amount entered is negative or is more than the available balance,
		// then ask the user to enter a new amount
		while (withdrawAmount < 0 || !user.getAccountInfo().isWithdrawOk(withdrawAmount)) {
			// Display error message
			if (withdrawAmount < 0) {
				System.out.println("Amount can't be negative!");
			} else if (!user.getAccountInfo().isWithdrawOk(withdrawAmount)) {
				System.out.println("Sorry! Insufficient balance...");
			}
			System.out.print("\nEnter Amount: $");
			withdrawAmount = sc.nextInt();
		}

		// Withdraw amount from user account
		user.getAccountInfo().withdrawAmount(withdrawAmount);

		System.out.println("$" + withdrawAmount + " withdrawn successfully!");

	}

	/*
	 * Checks if email exists within a list of users
	 */
	static boolean isEmailExisting(ArrayList<User> listOfUser, String email) {

		for (User user : listOfUser) {
			if (user.getCredential().getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Takes a username and password and checks against database. If username
	 * exists, check if password matches
	 */
	static boolean isUserDataValid(ArrayList<User> listOfUser, String username, String password) {

		// Check if the username exists in user records
		for (User user : listOfUser) {
			if (user.getCredential().getEmail().equals(username)) {
				// Check if corresponding user entered correct password
				if (user.getCredential().getPassword().equals(password)) {
					return true;
				}
			}
		}

		return false;
	}

	static boolean isSecurityKeyValid(ArrayList<User> listOfUser, String username, String securityKey) {

		for (User user : listOfUser) {
			// Find the user
			if (user.getCredential().getEmail().equals(username)) {
				// Check if the security key is correct
				if (user.getCredential().getFavouriteColor().equals(securityKey)) {
					return true;
				}
			}
		}

		return false;
	}

	static void displayAllUserInfo(ArrayList<User> listOfUser) {

		for (User user : listOfUser) {
			System.out.println("\nUser email: " + user.getCredential().getEmail());
			System.out.println("User password: " + user.getCredential().getPassword());
			System.out.println("User security question: " + user.getCredential().getFavouriteColor());
			System.out.println("Account balance: $ " + user.getAccountInfo().getBalance());
			System.out.println();
		}

	}

	static void displayMenu() {
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("------------------- ATM Options ---------------------");
		System.out.println("-----------------------------------------------------");
		System.out.print(
				"User Home Page: " + "\n1. Register" + "\n2. Login" + "\n3. Forgot Password" + "\n4. Logout (exit)");
		// System.out.print("\n\nEnter your choice: ");
	}

	static void displayAccountOptions() {
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println("------------------- Account Options --------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println(
				"Type 1: Check Available Bank Balance\nType 2: Deposit Amount\nType 3: Withdraw Amount\nType 4: Quit");
	}

}
