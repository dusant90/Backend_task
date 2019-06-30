package com.cyrilic.project.restapi.entity;

import com.cyrilic.project.restapi.security.Constants;

public class AuthToken {
	private final String prefix = Constants.TOKEN_PREFIX;
	private String token;
	
	public AuthToken() {
		super();
	}

	public AuthToken(String token) {
		this.token = prefix + " " + token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = prefix + " " + token;
	}

}