package com.cyrilic.project.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cyrilic.project.restapi.entity.Account;
import com.cyrilic.project.restapi.entity.Customer;
import com.cyrilic.project.restapi.entity.User;
import com.cyrilic.project.restapi.repository.AccountRepository;
import com.cyrilic.project.restapi.repository.CustomerRepository;
import com.cyrilic.project.restapi.service.AccountService;
import com.cyrilic.project.restapi.service.UserService;

@Component
public class ApplicationRunner implements CommandLineRunner {

    @Autowired
    private UserService userService;
    
    @Autowired
    private AccountRepository accountRepository;
    
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String...args) throws Exception {
//	      User user = new User();
//	      user.setEmail("test@test.com");
//	      user.setPassword("dada123");
//	      userService.createUser(user);
//	      
//	      
//    	 User user = userService.getUserByMail("dev@mail.com");
//	      Account acc = new Account();
//	      acc.setAccountName("insta account");
//	      acc.setUser(user);
//	      accountRepository.save(acc);
////	      
//	      List<Account> accounts = accountService.getAccountsByUser(user.getId());
//	      for (Account account : accounts) {
//	    	  System.out.println(account.getAccountName());
//	      }
	      
//	      Customer customer = new Customer();
//	      customer.setFirst_name("Dusan");
//	      customer.setLast_name("tomic");
//	      customer.setAccount(acc);
//	      customerRepository.save(customer);

	      
    }
}