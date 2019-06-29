package com.cyrilic.project.restapi.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "farms")
public class Farm implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int farm_id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore 
	private User user;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
	@JsonIgnore 
	private Account account;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public Account getAccount() {
		return account;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Farm(@NotNull String name, @NotNull String description) {
		super();
		this.name = name;
		this.description = description;
	}


	public Farm(@NotNull String name, @NotNull String description, User user) {
		this(name,description);
		this.user = user;
	}

	public Farm(@NotNull String name, @NotNull String description, Account account) {
		this(name,description);
		this.account = account;
	}
	
	public Farm() {
		super();
	}
	
}


