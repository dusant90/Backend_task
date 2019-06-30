package com.cyrilic.project.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cyrilic.project.restapi.entity.Account;
import com.cyrilic.project.restapi.entity.Customer;
import com.cyrilic.project.restapi.entity.Farm;
import com.cyrilic.project.restapi.entity.User;
import com.cyrilic.project.restapi.repository.AccountRepository;
import com.cyrilic.project.restapi.repository.CustomerRepository;
import com.cyrilic.project.restapi.repository.FarmRepository;
import com.cyrilic.project.restapi.service.UserService;

@Component
@SuppressWarnings("unused")

public class DataInitializer implements CommandLineRunner {

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
//	      userService.createUser("dev@test.com", "test");
//	      userService.createUser("dev@mail.com", "test1");
//	      
//		User user = userService.getUserByMail("dev@test.com");
//		User user1 = userService.getUserByMail("dev@mail.com");
//
////		 // CREATE ACCOUNT
//		Account acc = new Account();
//		acc.setAccountName("First account");
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
//		account.setAccountName("Second acount");
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
//		f.setName("Farm Eastwood");
//		f.setDescription("this is farm mostly for pigs");
//		f.setAccount(acc);
//		f.setUser(user);
//		farmRepository.save(f);


	}
}