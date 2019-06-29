package com.cyrilic.project.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cyrilic.project.restapi.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {


	@Query(value = "SELECT * FROM accounts acc WHERE acc.user_id = :userid",nativeQuery = true)
	public List<Account>findByUser(int userid);
	
	@Query(value = "SELECT * FROM accounts acc WHERE acc.account_id = :accountId",nativeQuery = true)
	public Account findById (int accountId);
//	
	public List<Account> findAll();
}
