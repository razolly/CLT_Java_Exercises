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
	void displaySuccessMessage();
	
	// Option 2: Login
	void displayLoginSuccessfulMessage();
	void displayAccountMenu();
	int requestUserChoice();
	
	// Option 4: Logout
	void displayLogoutMessage();
	
	// Option 5 (Secret): Display all users
	void displayAllUsers(ArrayList<User> users);
}
