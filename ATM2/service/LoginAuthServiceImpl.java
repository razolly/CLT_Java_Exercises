package service;

import dao.LoginAuthenticationDao;
import dao.LoginAuthenticationDaoImpl;
import pojo.BankUser;

public class LoginAuthServiceImpl implements LoginAuthService {

	LoginAuthenticationDao dao;
	
	@Override
	public void authenticateLogin(BankUser user) {

		dao = new LoginAuthenticationDaoImpl();
		
		/*
		 * DAO is used to check if User credentials are valid If valid, display welcome
		 * message else, display invalid message
		 */
		if(dao.authenticateUser(user) == true) {
			System.out.println("Welcome! User credential is valid");
		} else {
			System.out.println("Invalid user credentials");
		}
	}

}
