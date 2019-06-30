package com.cyrilic.project.restapi.controller;


import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cyrilic.project.restapi.entity.AuthToken;
import com.cyrilic.project.restapi.entity.User;
import com.cyrilic.project.restapi.security.AuthenticationFacade;
//import ch.uzh.marugoto.backend.resource.AuthUser;
import com.cyrilic.project.restapi.security.JwtTokenProvider;

//import ch.uzh.marugoto.core.data.entity.application.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtTokenProvider jwtTokenProvider;
	@Autowired
    private AuthenticationFacade authenticationFacade;

	@ApiOperation(value = "Generates an access token regarding the login credentials")
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public AuthToken authenticate(@RequestParam String mail,@RequestParam String password)
			throws org.springframework.security.core.AuthenticationException, AuthenticationException {
		

		var authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(mail, password));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		var token = jwtTokenProvider.generateToken(authentication);

		return new AuthToken(token);
	}

	@ApiOperation(value = "Returns authenticated user", authorizations = { @Authorization(value = "apiKey") })
	@RequestMapping(value = "auth/validate", method = RequestMethod.GET)
	public User validate() throws javax.naming.AuthenticationException {
		return authenticationFacade.getAuthenticatedUser();
	}

}