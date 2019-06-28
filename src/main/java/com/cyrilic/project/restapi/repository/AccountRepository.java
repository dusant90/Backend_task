package com.cyrilic.project.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyrilic.project.restapi.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	public List<Account>findByUser(String userId);
}
