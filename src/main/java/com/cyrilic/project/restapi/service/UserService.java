package com.cyrilic.project.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyrilic.project.restapi.entity.User;
import com.cyrilic.project.restapi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User createUser(String email, String password) {
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		return userRepository.save(user);
	}
	
	public User getUserByMail(String mail) {
		return userRepository.findByEmail(mail);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}
