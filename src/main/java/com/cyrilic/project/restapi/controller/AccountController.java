package com.cyrilic.project.restapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyrilic.project.restapi.entity.Account;
import com.cyrilic.project.restapi.repository.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@PostMapping("/create")
	public Account createAccount( @RequestBody Account account) {
		return accountService.saveAccount(account);
	}
	
	
	@GetMapping("/list/{userId}")
	public List<Account>getByUser(@PathVariable String userId) {
		return accountService.getAccountsByUser(userId);
	}
}
