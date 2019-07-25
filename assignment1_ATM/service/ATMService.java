package service;

public interface ATMService {

	void register();
	void login();
	void forgotPassword();
	void logout();
	void displayAllUserInfo(); 
	
	// Might have to move this
	boolean isCredentialValid(String username, String password);
}
