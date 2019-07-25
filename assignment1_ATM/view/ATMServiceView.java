package view;

public interface ATMServiceView {

	// Option 1: Registration
	String requestEmailAddress();
	String requestPassword();
	String requestFavoriteColor();
	void displayExistingEmailError();
	void displayRetypedPasswordError();
	void displaySuccessMessage();
}
