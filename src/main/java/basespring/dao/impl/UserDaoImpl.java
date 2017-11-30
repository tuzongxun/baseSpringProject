package basespring.dao.impl;

import org.springframework.stereotype.Component;

import basespring.dao.UserDao;
import basespring.model.UserModel;

@Component
public class UserDaoImpl implements UserDao {

	@Override
	public UserModel findUserByName(String name) {
		// 由于实际没有操作数据库，这里模拟从数据库中查询数据
		System.out.println("查询参数：" + name);
		UserModel user = new UserModel();
		user.setAge(22);
		user.setName(name);
		return user;
	}

}
