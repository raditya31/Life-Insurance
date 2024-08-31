package com.cybage.genworth.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.genworth.insurance.model.User;
import com.cybage.genworth.insurance.service.UserService;
@RestController
@RequestMapping("/insurance/user")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/")
public User saveUser(@RequestBody User user) {
		User saveUser = userService.saveUser(user);
		return saveUser;
		
	}
	@GetMapping("/")
	public List<User> getListByCity(String city){
		List<User> listByCity = userService.getListByCity(city);
		return listByCity;
	}
}
