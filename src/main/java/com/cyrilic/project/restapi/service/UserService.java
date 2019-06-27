package com.cyrilic.project.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyrilic.project.restapi.entity.User;
import com.cyrilic.project.restapi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User getUserByMail(String mail) {
		return userRepository.findByEmail(mail);
	}
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
}
