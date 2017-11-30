package basespring.service;

import basespring.model.UserModel;

public interface UserService {
	public UserModel findUserByName(String name);
}
