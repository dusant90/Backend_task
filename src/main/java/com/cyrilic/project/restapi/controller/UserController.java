package com.cyrilic.project.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cyrilic.project.restapi.entity.User;
import com.cyrilic.project.restapi.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@ApiOperation(value = "Creates new user")
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<String> createUser(@RequestParam String email, @RequestParam String password) throws Exception {
		
		User user = userService.getUserByMail(email);
		if (user != null) {
			throw new Exception("User with this email address alreday exist");
		}
		
		user = userService.createUser(email,password);
		return new ResponseEntity<String>("User with the mail "+ user.getEmail() + "has been successfully created",HttpStatus.OK);
	}
	
	@ApiOperation(value = "Lists all users")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<User> getAll() {
		return userService.getAllUsers();
	};
}
