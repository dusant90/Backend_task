package com.cyrilic.project.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cyrilic.project.restapi.entity.User;
import com.cyrilic.project.restapi.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@ApiOperation(value = "Lists all users")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<User> getAll() {
		return userService.getAllUsers();
	};
}
