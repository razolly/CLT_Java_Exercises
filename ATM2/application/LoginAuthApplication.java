package application;

import controller.LoginAuthController;

public class LoginAuthApplication {

	public static void main(String[] args) {

		// Create Controller and start 
		LoginAuthController controller = new LoginAuthController();
		controller.startLoginController();
	}
}
