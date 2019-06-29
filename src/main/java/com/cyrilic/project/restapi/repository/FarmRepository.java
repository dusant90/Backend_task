package com.cyrilic.project.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyrilic.project.restapi.entity.Farm;

@Repository
public interface FarmRepository extends JpaRepository<Farm, Integer> {

	public Farm findByAccount(int accountId);
	public List<Farm>findByUser(int userId);
}
