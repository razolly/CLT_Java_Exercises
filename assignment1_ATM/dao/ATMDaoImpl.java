package dao;

import java.util.ArrayList;

import pojo.User;

public class ATMDaoImpl implements ATMDao {

	// Acts as database
	ArrayList<User> userDatabase;
	
	public ATMDaoImpl() {
		userDatabase = new ArrayList<User>();
	}
	
	/* 
	 * Returns all users 
	 */
	@Override
	public ArrayList<User> getAll() {
		return userDatabase;
	}

	/* 
	 * Returns a single user by searching for specific email 
	 * If not found, return null
	 */
	@Override
	public User getSingleUser(String email) {
		
		// Search in database
		for(User user: userDatabase) {
			// Find corresponding user with the given email
			if(user.getCredential().getEmail().equals(email)) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public void addSingleUser(User user) {
		userDatabase.add(user);
	}

}
