package com.cybage.genworth.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.genworth.insurance.model.User;
import com.cybage.genworth.insurance.service.UserService;

@RestController
@RequestMapping("/insurance")
public class LoginController {
@Autowired
private UserService userService;
@PostMapping("/login")
public User loginUser(@RequestBody User user) {
	String username = user.getUsername();
	String pasword = user.getUserpwd();
	User loginUser = userService.loginUser(username, pasword);
	return loginUser
			;
	
}
}
