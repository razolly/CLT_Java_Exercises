package controller;

import java.util.Scanner;

import pojo.User;
import service.LoginService;
import service.LoginServiceImpl;

public class LoginController {
	
	User refUser;
	LoginService refLoginService;
	
	public void userLoginController() {
		getUserInput();
	}
	
	void getUserInput () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User ID: ");
		String userId = sc.next();
		
		System.out.println("Enter User Password: ");
		String userPassword = sc.next();
		
		refUser = new User();
		refUser.setUserName(userId);
		refUser.setUserPassword(userPassword);
		
		refLoginService = new LoginServiceImpl();
		refLoginService.checkStatus(refUser);
		}

}
