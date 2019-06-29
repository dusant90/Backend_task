package com.cyrilic.project.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cyrilic.project.restapi.entity.Farm;

@Repository
public interface FarmRepository extends JpaRepository<Farm, Integer> {

	@Query(value="SELECT * FROM farms f WHERE f.user_id=?1 AND f.account_id=?2", nativeQuery = true)
	public List<Farm>findByUserAndAccount(int userId, int accountId);
}
