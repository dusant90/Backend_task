package com.cyrilic.project.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyrilic.project.restapi.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}