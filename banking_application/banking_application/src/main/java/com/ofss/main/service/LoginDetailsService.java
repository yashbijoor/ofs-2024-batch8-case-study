package com.ofss.main.service;

import org.springframework.stereotype.Service;

import com.ofss.main.domain.LoginDetails;


@Service
public interface LoginDetailsService {
	public LoginDetails findByCustomerId(int customerId);
	
	public LoginDetails findByUsername(String username);
	
	public LoginDetails addLoginDetails(LoginDetails loginDetails);
}
