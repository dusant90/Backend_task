package com.cyrilic.project.restapi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyrilic.project.restapi.entity.Farm;
import com.cyrilic.project.restapi.service.FarmService;

@RestController
@RequestMapping("/api/farm")
public class FarmController {

	@Autowired
	private FarmService farmService;
	
	@PostMapping("/create")
	public Farm createFarm (@Valid @RequestBody Farm farm) {
		return farmService.createFarm(farm);
	}
	
}
