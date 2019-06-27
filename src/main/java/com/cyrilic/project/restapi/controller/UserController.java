package com.cyrilic.project.restapi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyrilic.project.restapi.entity.User;
import com.cyrilic.project.restapi.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired 
	private UserService userService;
	
	@PostMapping("/create")
	public User createUser(@Valid @RequestBody User user) {
		return userService.createUser(user);
	} 

}
