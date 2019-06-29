package com.cyrilic.project.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cyrilic.project.restapi.entity.Farm;
import com.cyrilic.project.restapi.service.FarmService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/farm")
public class FarmController {

	@Autowired
	private FarmService farmService;
	
	@ApiOperation(value = "Find all accounts by user")
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
	public List<Farm>getByUserAndAccount(@PathVariable int userId, @RequestParam int accountId) {
		return farmService.findByUserAndAccount(userId, accountId);
	}
	
}
