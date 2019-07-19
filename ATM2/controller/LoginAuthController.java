package controller;

import java.util.Scanner;

import pojo.BankUser;
import service.LoginAuthService;
import service.LoginAuthServiceImpl;

public class LoginAuthController {
	
	BankUser user;
	LoginAuthService service;
	
	public void startLoginController() {
		getUserInput();
	}
	
	private void getUserInput() {
		Scanner sc = new Scanner(System.in);
		user = new BankUser();
		
		// Get Username and store in BankUser POJO
		System.out.print("Enter your Username: ");
		String userName = sc.next();
		user.setUserName(userName);
		
		// Get Password and store in BankUser POJO
		System.out.print("Enter your password: ");
		String userPassword = sc.next();
		user.setUserPassword(userPassword);
		
		// Pass User to Service for validation
		service = new LoginAuthServiceImpl();
		service.authenticateLogin(user);
	}


}
