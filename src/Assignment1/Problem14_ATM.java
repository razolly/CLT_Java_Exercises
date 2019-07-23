package Assignment1;

import java.util.Scanner;

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
		System.out.print("\nEnter Password: ");
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

	}

	static void login() {

	}

	static void forgotPassword() {

	}

	static void logout() {
		System.out.println("System shut down!");
	}

	static boolean isEmailValid(String email) {
		if (email.equals("xyz@gmail.com")) {
			System.out.println("Email already exists!");
			return false;
		} else {
			return true;
		}
	}

	static void displayMenu() {
		System.out.print(
				"\nUser Home Page: " + "\n1. Register" + "\n2. Login" + "\n3. Forgot Password" + "\n4. Logout (exit)");
		// System.out.print("\n\nEnter your choice: ");
	}

}
