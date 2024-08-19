package com.ofss.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofss.main.domain.LoginDetails;
import com.ofss.main.repository.LoginDetailsRepository;

@Service
public class LoginDetailsServiceImpl implements LoginDetailsService {
	@Autowired
	LoginDetailsRepository loginDetailsRepository;

	@Override
	public LoginDetails findByCustomerId(int customerId) {
		return loginDetailsRepository.findByCustomerId(customerId);
	}

	@Override
	public LoginDetails findByUsername(String username) {
		return loginDetailsRepository.findByUsername(username);
	}

	@Override
	public LoginDetails addLoginDetails(LoginDetails loginDetails) {
		return loginDetailsRepository.save(loginDetails);
	}
}
