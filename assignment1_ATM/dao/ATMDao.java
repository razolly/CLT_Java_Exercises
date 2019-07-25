package dao;

import java.util.ArrayList;

import pojo.User;

public interface ATMDao {
	
	ArrayList<User> getAll();
	User getSingleUser(String email);
	void addSingleUser(User user);
	boolean isUserExisting(String username);
}
