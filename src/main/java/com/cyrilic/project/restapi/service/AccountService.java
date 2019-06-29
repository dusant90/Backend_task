package com.cyrilic.project.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyrilic.project.restapi.entity.Account;
import com.cyrilic.project.restapi.repository.AccountRepository;
@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public List<Account> getAccountsByUser(int userId) {
		return accountRepository.findByUser(userId);
	}
	
	public List<Account> getAllAccounts() {
		return accountRepository.findAll();
	}
	
	public Account getById(int accountId) {
		return accountRepository.findById(accountId);
	}
}