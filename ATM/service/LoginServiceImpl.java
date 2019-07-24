package service;

import dao.LoginDao;
import dao.LoginDaoImpl;
import pojo.User;

public class LoginServiceImpl implements LoginService {

	LoginDao refLoginDao;
	
	@Override
	public void checkStatus(User user) {
		refLoginDao = new LoginDaoImpl();
		if(refLoginDao.loginValidate(user) == true) {
			System.out.println("Welcome");
		} else {
			System.out.println("Not valid..");
		}
	}

}
