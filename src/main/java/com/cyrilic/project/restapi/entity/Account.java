package com.cyrilic.project.restapi.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "accounts")
public class Account implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int account_id;
	
	@NotNull
	private String account_name;
		
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore 
	private User user;

	public int getId() {
		return account_id;
	}

	public User getUser() {
		return user;
	}

	public void setId(int account_id) {
		this.account_id = account_id;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAccountName() {
		return account_name;
	}

	public void setAccountName(String accountName) {
		this.account_name = accountName;
	}

	public Account() {
		super();
	}
	
	public Account(@NotNull String account_name) {
		super();
		this.account_name = account_name;
	}

	public Account(@NotNull String name, User user) {
		this(name);
		this.user = user;
	}
}
