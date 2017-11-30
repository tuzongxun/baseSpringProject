package basespring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import basespring.dao.UserDao;
import basespring.model.UserModel;
import basespring.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public UserModel findUserByName(String name) {

		return userDao.findUserByName(name);
	}

}
