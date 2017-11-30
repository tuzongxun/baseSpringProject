package basespring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import basespring.model.UserModel;
import basespring.service.UserService;

@RestController
@RequestMapping(value = "user")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "userInfo", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	public String index() {
		System.out.println("收到前端请求");
		UserModel user = userService.findUserByName("张三");
		System.out.println(user);
		return user.toString();
	}
}
