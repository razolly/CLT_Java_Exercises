package day01;

import java.util.Scanner;

class User {
	String userId;
	String userPassword;
}


class AuthenticationLogic {
	
	String userId, userPassword;
	boolean status;
	
	public void userInput(String userId, String userPassword) {
		this.userId = userId;
		this.userPassword = userPassword;
	}
	
	public void displayResult() {
		if(isUserValid()) {
			System.out.println("Welcome");
		} else {
			System.out.println("Not valid");
		}
	}
	
	public boolean isUserValid() {
		if(userId.equals("admin") && userPassword.equals("admin123")) {
			status = true;
		} else {
			status = false;
		}
		return status;
	}
}


public class UserLoginAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Username: ");
		String userId = sc.next();
		System.out.print("Enter Password: ");
		String userPassword = sc.next();
		
		AuthenticationLogic aut = new AuthenticationLogic();
		aut.userInput(userId, userPassword);
		aut.displayResult();
	}

}
