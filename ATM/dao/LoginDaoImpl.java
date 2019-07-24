package dao;

import pojo.User;

public class LoginDaoImpl implements LoginDao {

	boolean status;
	
	// connect to DB here..
	
	@Override
	public boolean loginValidate(User user) {

		if (user.getUserName() == "1234" && user.getUserPassword().equals("test")) {
			status = true;
		} else {
			status = false;
		}
		
		return status;
	}

}
