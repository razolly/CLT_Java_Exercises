package dao;

import pojo.BankUser;

public interface LoginAuthenticationDao {

	// Checks DB for existence of user
	boolean authenticateUser(BankUser user);
}
