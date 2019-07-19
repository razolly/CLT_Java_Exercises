package dao;

import pojo.BankUser;

public class LoginAuthenticationDaoImpl implements LoginAuthenticationDao {

	// DBConnection should be accessed here to check for User existence

	// Checks if user exists in the "database"
	@Override
	public boolean authenticateUser(BankUser user) {

		if (user.getUserName().equals("admin") && user.getUserPassword().equals("abc123")) {
			return true;
		} else {
			return false;
		}
	}
}
