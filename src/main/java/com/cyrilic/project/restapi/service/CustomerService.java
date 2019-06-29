package com.cyrilic.project.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyrilic.project.restapi.entity.Customer;
import com.cyrilic.project.restapi.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAll() {
		return customerRepository.findAll();
	}
	
	
}
