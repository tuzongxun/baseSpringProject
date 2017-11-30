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

	@RequestMapping(value = "userInfo", method = RequestMethod.GET)
	public String index() {
		System.out.println(" ’µΩ«Î«Û");
		UserModel user = userService.findUserByName("zhangsan");
		System.out.println(user);
		return user.toString();
	}
}
