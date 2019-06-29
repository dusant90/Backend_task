package com.cyrilic.project.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cyrilic.project.restapi.entity.User;
import com.cyrilic.project.restapi.repository.AccountRepository;
import com.cyrilic.project.restapi.repository.CustomerRepository;
import com.cyrilic.project.restapi.repository.FarmRepository;
import com.cyrilic.project.restapi.service.UserService;

@Component
public class DatabaseSeeders implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private FarmRepository farmRepository;

	@Override
	public void run(String... args) throws Exception {

		// CREATE USER
//	      User user = new User();
//	      user.setEmail("test@test.com");
//	      user.setPassword("dada123");
//	      userService.createUser(user);
//	      
		User user = userService.getUserByMail("dev@mail.com");
		User user1 = userService.getUserByMail("test@test.com");

//		 // CREATE ACCOUNT
//		Account acc = new Account();
//		acc.setAccountName("insta account");
//		acc.setUser(user);
//		accountRepository.save(acc);
//
//		Customer customer = new Customer();
//		customer.setFirst_name("Dusan");
//		customer.setLast_name("tomic");
//		customer.setAccount(acc);
//		customerRepository.save(customer);
//	      
//		Account account = new Account();
//		account.setAccountName("facebook account");
//		account.setUser(user1);
//		accountRepository.save(account);
//
//		Customer cust = new Customer();
//		cust.setFirst_name("ljubi");
//		cust.setLast_name("krstic");
//		cust.setAccount(account);
//		customerRepository.save(cust);
//
//		Farm farm = new Farm();
//		farm.setName("Black Hallow Farm");
//		farm.setDescription("this is farm mostly for chickens");
//		farm.setAccount(account);
//		farm.setUser(user1);
//		farmRepository.save(farm);
//		
//		Farm f = new Farm();
//		f.setName("Black Hallow Farm");
//		f.setDescription("this is farm mostly for pigs");
//		f.setAccount(acc);
//		f.setUser(user);
//		farmRepository.save(f);


	}
}