package com.cyrilic.project.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cyrilic.project.restapi.entity.Account;
import com.cyrilic.project.restapi.entity.User;
import com.cyrilic.project.restapi.repository.AccountService;
import com.cyrilic.project.restapi.service.UserService;

@Component
public class ApplicationRunner implements CommandLineRunner{

    @Autowired
    private UserService userService;
    
    @Autowired
    private AccountService accountService;

    @Override
    public void run(String...args) throws Exception {
	      User user = new User();
	      user.setEmail("pera@mail.com");
	      user.setPassword("pera");
	      userService.createUser(user);
	      
	      
	      Account acc = new Account();
	      accountService.saveAccount(acc);
	      acc.setAccountName("my account");
	      acc.setUser(user);
	      accountService.saveAccount(acc);
	      
    }
}