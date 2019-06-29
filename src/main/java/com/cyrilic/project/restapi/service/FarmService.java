package com.cyrilic.project.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyrilic.project.restapi.entity.Farm;
import com.cyrilic.project.restapi.repository.FarmRepository;

@Service
public class FarmService {
	
	@Autowired
	private FarmRepository farmRepository;
	
	public List<Farm>findByUserAndAccount(int userId, int accountId) {
		return farmRepository.findByUserAndAccount(userId, accountId);
	}
}
