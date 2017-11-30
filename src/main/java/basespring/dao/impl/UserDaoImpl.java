package basespring.dao.impl;

import org.springframework.stereotype.Component;

import basespring.dao.UserDao;
import basespring.model.UserModel;

@Component
public class UserDaoImpl implements UserDao {

	@Override
	public UserModel findUserByName(String name) {
		System.out.println("²éÑ¯Ìõ¼þ£º" + name);
		UserModel user = new UserModel();
		user.setAge(22);
		user.setName(name);
		return user;
	}

}
