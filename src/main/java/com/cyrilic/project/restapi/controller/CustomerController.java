package com.cyrilic.project.restapi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyrilic.project.restapi.Customer;
import com.cyrilic.project.restapi.repository.CustomerRepository;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping("/create")
	public Customer createNote(@Valid @RequestBody Customer customer) {
	    return customerRepository.save(customer);
	}
}
