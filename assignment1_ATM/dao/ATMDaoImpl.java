package dao;

import java.util.ArrayList;

import pojo.User;

public class ATMDaoImpl implements ATMDao {

	// Acts as database
	ArrayList<User> userDatabase;

	public ATMDaoImpl() {
		userDatabase = new ArrayList<User>();
		
		// Uncomment this for testing
		addMockUsers();
	}

	/*
	 * Returns all users
	 */
	@Override
	public ArrayList<User> getAll() {
		return userDatabase;
	}

	/*
	 * Returns a single user by searching for specific email If not found, return
	 * null
	 */
	@Override
	public User getSingleUser(String email) {

		// Search in database
		for (User user : userDatabase) {
			// Find corresponding user with the given email
			if (user.getCredential().getEmail().equals(email)) {
				return user;
			}
		}

		return null;
	}

	/* 
	 * Adds a user 
	 */
	@Override
	public void addSingleUser(User user) {
		userDatabase.add(user);
	}

	/* 
	 * Checks if a single user exists 
	 */
	@Override
	public boolean isUserExisting(String username) {
		
		// Search in database
		for (User user : userDatabase) {
			// Find corresponding user with the given email
			if (user.getCredential().getEmail().equals(username)) {
				return true;
			}
		}
		
		return false;
	}
	
	/* 
	 * Adds some mock users for testing 
	 */
	private void addMockUsers() {
		
		User u1 = new User();
		u1.getCredential().setEmail("raz@g");
		u1.getCredential().setPassword("123");
		u1.getCredential().setFavouriteColor("red");
		
		userDatabase.add(u1);
		
		User u2 = new User();
		u2.getCredential().setEmail("alex@g");
		u2.getCredential().setPassword("678");
		u2.getCredential().setFavouriteColor("black");
		
		userDatabase.add(u2);
		
		User u3 = new User();
		u3.getCredential().setEmail("bird@g");
		u3.getCredential().setPassword("999");
		u3.getCredential().setFavouriteColor("green");
		
		userDatabase.add(u3);
	}

}
