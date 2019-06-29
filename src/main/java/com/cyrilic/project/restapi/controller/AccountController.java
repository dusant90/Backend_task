package com.cyrilic.project.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cyrilic.project.restapi.entity.Account;
import com.cyrilic.project.restapi.service.AccountService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@ApiOperation(value = "Find all accounts by user")
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
	public List<Account>getByUser(@PathVariable int userId) {
		return accountService.getAccountsByUser(userId);
	}

	@ApiOperation(value = "Lists all accounts")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Account>getAll() {
		return accountService.getAllAccounts();
	};
	
	@ApiOperation(value = "Find all accounts by id")
	@RequestMapping(value = "/list/{accountId}", method = RequestMethod.GET)
	public Account getById(@PathVariable Integer accountId) {
		return accountService.getById(accountId);
	};
};
