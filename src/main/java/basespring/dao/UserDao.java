package basespring.dao;

import basespring.model.UserModel;

public interface UserDao {
	public UserModel findUserByName(String name);
}
