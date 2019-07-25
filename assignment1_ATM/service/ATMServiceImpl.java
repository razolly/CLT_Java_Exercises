package service;

import java.util.ArrayList;

import dao.ATMDao;
import dao.ATMDaoImpl;
import pojo.User;
import view.ATMServiceView;
import view.ATMServiceViewImpl;

public class ATMServiceImpl implements ATMService {

	ATMServiceView view;
	ATMDao dao;

	public ATMServiceImpl() {
		view = new ATMServiceViewImpl();
		dao = new ATMDaoImpl();
	}

	@Override
	public void register() {

		// Request for new user email address
		String newEmail = view.requestEmailAddress();

		// Request for new user password
		String newPassword = view.requestNewPassword();

		// Request for security key ie. favorite color
		String newFavouriteColor = view.requestFavoriteColor();

		// Display success message
		view.displayRegistrationSuccessMessage();

		// Create POJO and store new user in database using the DAO
		User newUser = new User();
		newUser.getCredential().setEmail(newEmail);
		newUser.getCredential().setPassword(newPassword);
		newUser.getCredential().setFavouriteColor(newFavouriteColor);
		dao.addSingleUser(newUser);
	}

	@Override
	public void login() {

		// Request Username
		String username = view.requestEmailAddress();

		// Request Password
		String password = view.requestPassword();

		// Validate that username and password match
		// If not, then loop
		while (!isCredentialValid(username, password)) {
			// Display error
			view.displayLoginFailMessage();

			// Ask for username and password again
			username = view.requestEmailAddress();
			password = view.requestPassword();
		}

		// Display successful login message
		view.displayLoginSuccessfulMessage();

		int userChoice;

		do {
			// Display menu
			view.displayAccountMenu();

			// Request user menu choice
			userChoice = view.requestUserChoice();

			// Get object of user that logged in
			User currUser = dao.getSingleUser(username);

			switch (userChoice) {
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

		} while (userChoice != 4);
	}

	private void withdrawAmount(User currUser) {

		int withdrawAmount = view.requestWithdrawAmount();

		while (withdrawAmount < 0 || !isBalanceEnough(currUser, withdrawAmount)) {
			// Display error message
			view.displayInsufficientBalanceMessage();

			// Ask for amount again
			view.requestWithdrawAmount();
		}

		// Deduct amount from balance
		currUser.getAccountInfo().withdrawAmount(withdrawAmount);

		// Display success message
		view.displayWithdrawSuccessMessage(withdrawAmount);
	}

	private void depositAmount(User currUser) {

		// Get amount to deposit
		int depositAmount = view.requestDepositAmount();

		// Add amount to balance
		currUser.getAccountInfo().depositAmount(depositAmount);

		// Display success message
		view.displayDepositSuccessMessage(depositAmount);
	}

	/*
	 * Checks if user has enough balance to withdraw
	 */
	private boolean isBalanceEnough(User user, int withdrawAmount) {

		if (user.getAccountInfo().getBalance() < withdrawAmount) {
			return false;
		} else {
			return true;
		}
	}

	private void checkBalance(User currUser) {
		view.displayAccountBalance(currUser.getAccountInfo().getBalance());
	}

	@Override
	public void forgotPassword() {

		// Request username
		String username = view.requestEmailAddress();

		// Request security key
		String favoriteColor = view.requestSecurityKey();

		// Check if user exists and security key is correct
		while (!dao.isUserExisting(username) || !isSecurityKeyCorrect(username, favoriteColor)) {
			// Display error
			view.displaySecurityKeyFailMessage();

			// Request for details again
			username = view.requestEmailAddress();
			favoriteColor = view.requestSecurityKey();
		}

		// Request for new user password
		String newPassword = view.requestNewPassword();
		
		// Set the new password
		dao.getSingleUser(username).getCredential().setPassword(newPassword);

		// Display success message
		view.displayPasswordResetSuccessMessage();
	}

	/*
	 * Checks if security key of the respective user is correct
	 */
	private boolean isSecurityKeyCorrect(String username, String favoriteColor) {

		if (dao.getSingleUser(username).getCredential().getFavouriteColor().equals(favoriteColor)) {
			return true;
		}

		return false;
	}

	@Override
	public void logout() {
		view.displayLogoutMessage();
	}

	/*
	 * Secret method that displays all users
	 */
	@Override
	public void displayAllUserInfo() {
		// Pass database of users to view for it to display
		view.displayAllUsers(dao.getAll());
	}

	/*
	 * Checks if user login is valid
	 */
	public boolean isCredentialValid(String username, String password) {

		// Loop through database
		for (User user : dao.getAll()) {
			// Find by username
			if (user.getCredential().getEmail().equals(username)) {
				// Check if password matches
				if (user.getCredential().getPassword().equals(password)) {
					return true;
				}
			}
		}

		return false;
	}

}
