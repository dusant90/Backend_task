package com.cyrilic.project.restapi.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customer_id;
	
	@NotBlank
	private String firstName;
	
	@NotBlank
	private String lastName;
	
//	@OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
//    @JoinColumn(name = "account_id", nullable = false)
	private Account account;

	public Long getId() {
		return customer_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setId(Long customer_id) {
		this.customer_id = customer_id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
