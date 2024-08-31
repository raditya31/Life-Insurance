package com.cybage.genworth.insurance.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.genworth.insurance.Exception.LifeInsuranceException;
import com.cybage.genworth.insurance.model.User;
import com.cybage.genworth.insurance.repository.UserRepository;
import com.cybage.genworth.insurance.service.UserService;
@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserRepository userRepository;
	@Override
	public User loginUser(String username, String password) {
		User user = userRepository.findByUsername(username);
		if(user==null) {
			throw new LifeInsuranceException("User doesnt exits");
		}else {
			if(!user.getUserpwd().equals(password))
				throw new LifeInsuranceException("Incorrect password");
		}
		return user;
	}

	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getListByCity(String city) {
		List<User>users = userRepository.findByCity(city);
		if(users.isEmpty())
			throw new RuntimeException("No user Found in given city");
		return users;
		
		
	}

}
