package com.cyrilic.project.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyrilic.project.restapi.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String mail);

}
