package cn.zhh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cn.zhh.annotation.RpcReference;
import cn.zhh.entity.User;
import cn.zhh.service.UserService;

@RestController
public class TestController {
	
	@RpcReference
	private UserService userService;
	
	@GetMapping("/test/users/{id:[\\d]+}")
	public User getUserById(@PathVariable("id") Long userId) {
		return userService.getUserById(userId);
	}

}
