package service;

import view.ATMServiceView;
import view.ATMServiceViewImpl;

public class ATMServiceImpl implements ATMService {
	
	ATMServiceView view;
	// TODO put DAO here

	public ATMServiceImpl() {
		view = new ATMServiceViewImpl();
	}
	
	@Override
	public void register() {
		// Request for new user email address
		String newEmail = view.requestEmailAddress();
		
		// Request for new user password
		String newPassword = view.requestPassword();
		
		// Request for security key ie. favorite color
		String newFavouriteColor = view.requestFavoriteColor();
		
		// Display success message
		view.displaySuccessMessage();

		// Store new user details in a POJO using the DAO
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}

	@Override
	public void forgotPassword() {
		// TODO Auto-generated method stub

	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayAllUserInfo() {
		// TODO Auto-generated method stub

	}

}
