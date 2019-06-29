package com.cyrilic.project.restapi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "users")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
		
    @Column(unique = true)
    @NotNull
	private String email;
	
    @NotNull
	private String password;

	public int getId() {
		return user_id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.user_id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param name
	 * @param email
	 * @param password
	 */
	public User( String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public User () {
		super();
	}

}
