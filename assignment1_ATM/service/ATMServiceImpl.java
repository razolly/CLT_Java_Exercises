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
		view.displaySuccessMessage();

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
		isCredentialValid(username, password);
	}

	@Override
	public void forgotPassword() {
		// TODO Auto-generated method stub

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
	@Override
	public boolean isCredentialValid(String username, String password) {

		// Loop through database
		for (User user : dao.getAll()) {
			// Find by username
			if(user.getCredential().getEmail().equals(username)) {
				// Check if password matches
				if(user.getCredential().getPassword().equals(password)) {
					return true;
				}
			}
		}

		return false;
	}

}
