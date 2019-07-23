package Assignment1;

import java.util.Scanner;

class User {
	
}

public class Problem14_ATM {

	/*
	 * Create a console based Java Application (ATM)
	 */
	public static void main(String[] args) {

		int userChoice;

		Scanner sc = new Scanner(System.in);

		do {
			displayMenu();
			System.out.print("\n\nEnter your choice: ");
			userChoice = sc.nextInt();

			switch (userChoice) {
			case 1:
				register();
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

	static void register() {

		// Get email address
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter email address: ");
		String email = sc.next();

		// Check if email already exists
		while (!isEmailValid(email)) {
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

		// TODO Store details of user in a POJO class

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
		System.out.println("Wish to continue? (y/n): ");

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

		// while()
	}

	static void withdrawAmount() {

	}

	static boolean isEmailValid(String email) {
		if (email.equals("xyz@gmail.com")) {
			System.out.println("Email already exists!");
			return false;
		} else {
			return true;
		}
	}

	static boolean isUserDataValid(String username, String password) {
		return true;
	}

	static void displayMenu() {
		System.out.print(
				"\nUser Home Page: " + "\n1. Register" + "\n2. Login" + "\n3. Forgot Password" + "\n4. Logout (exit)");
		// System.out.print("\n\nEnter your choice: ");
	}

	static void displayAccountOptions() {
		System.out.println(
				"\nType 1: Check Available Bank Balance\nType 2: Deposit Amount\nType 3: Withdraw Amount\nType 4: Quit");
	}

}
