package com.cyrilic.project.restapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cyrilic.project.restapi.entity.Customer;
import com.cyrilic.project.restapi.entity.User;
import com.cyrilic.project.restapi.repository.CustomerRepository;
import com.cyrilic.project.restapi.service.CustomerService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@ApiOperation(value = "Lists all customers")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Customer> getAll() {
		return customerService.getAll();
	}
}
