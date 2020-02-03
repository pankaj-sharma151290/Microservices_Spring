package com.microservice.users.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.microservice.users.shared.UserDto;

public interface UsersService  extends UserDetailsService{

	UserDto createUser(UserDto userDetails);
	UserDto getUserDetailsByEmail(String email);
	UserDto getUserByUserId(String userId);
	
}
