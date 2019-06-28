package com.cyrilic.project.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyrilic.project.restapi.entity.Farm;
import com.cyrilic.project.restapi.repository.FarmRepository;

@Service
public class FarmService {
	
	@Autowired
	private FarmRepository farmRepository;
	
	public Farm createFarm(Farm farm) {
		return farmRepository.save(farm);
	}

}
