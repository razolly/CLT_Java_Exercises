package view;

import java.util.ArrayList;

import pojo.User;

public interface ATMServiceView {

	// Option 1: Registration
	String requestEmailAddress();
	String requestPassword();
	String requestNewPassword();
	String requestFavoriteColor();
	void displayExistingEmailError();
	void displayRetypedPasswordError();
	void displayRegistrationSuccessMessage();
	
	// Option 2: Login
	void displayLoginSuccessfulMessage();
	void displayAccountMenu();
	int requestUserChoice();
	void displayLoginFailMessage();
	void displayAccountBalance(int balance);
	int requestDepositAmount();
	void displayDepositSuccessMessage(int amount);
	int requestWithdrawAmount();
	void displayInsufficientBalanceMessage();
	void displayWithdrawSuccessMessage(int withdrawAmount);
	
	// Option 3: Forgot Password
	String requestSecurityKey();
	void displaySecurityKeyFailMessage();
	void displayPasswordResetSuccessMessage();
	
	// Option 4: Logout
	void displayLogoutMessage();
	
	// Option 5 (Secret): Display all users
	void displayAllUsers(ArrayList<User> users);
		
}
