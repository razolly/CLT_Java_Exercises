package view;

import java.util.Scanner;

public class ATMMainViewImpl implements ATMMainView {

	Scanner sc;
	boolean choiceIsValid;

	public ATMMainViewImpl() {
		sc = new Scanner(System.in);
	}

	@Override
	public void displayMainMenu() {
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("------------------- ATM Options ---------------------");
		System.out.println("-----------------------------------------------------");
		System.out.print(
				"User Home Page: " + "\n1. Register" + "\n2. Login" + "\n3. Forgot Password" + "\n4. Logout (exit)");
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

}
