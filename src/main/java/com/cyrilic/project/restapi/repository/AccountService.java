package com.cyrilic.project.restapi.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyrilic.project.restapi.entity.Account;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public List<Account> getAccountsByUser(String userId) {
		return accountRepository.findByUser(userId);
	}
	
	public Account saveAccount (Account account) {
		return accountRepository.save(account);
	}
}