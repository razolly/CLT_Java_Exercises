package controller;

import service.ATMService;
import service.ATMServiceImpl;
import view.ATMMainView;
import view.ATMMainViewImpl;

public class ATMController {

	ATMMainView view;
	ATMService service;

	public void start() {

		// Create all necessary objects for controller to start
		initializeComponents();

		int userChoice;

		do {
			// Display start menu
			view.displayMainMenu();

			// Get users choice
			userChoice = view.requestUserChoice();

			// Run the respective service
			switch (userChoice) {
				case 1:
					service.register();
					break;
				case 2:
					service.login();
					break;
				case 3:
					service.forgotPassword();
					break;
				case 4:
					service.logout();
					break;
				case 5:
					service.displayAllUserInfo(); // Secret method
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
		} while (userChoice != 4);
	}

	void initializeComponents() {
		view = new ATMMainViewImpl();
		service = new ATMServiceImpl();
	}

}
