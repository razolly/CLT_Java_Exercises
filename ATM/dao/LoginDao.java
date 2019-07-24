package dao;

import pojo.User;

public interface LoginDao {

	boolean loginValidate(User user);
}
