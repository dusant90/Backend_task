package com.cyrilic.project.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cyrilic.project.restapi.entity.Customer;
import com.cyrilic.project.restapi.service.CustomerService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@ApiOperation(value = "Lists all customers",authorizations = { @Authorization(value = "apiKey") })
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Customer> getAll() {
		return customerService.getAll();
	}
}
