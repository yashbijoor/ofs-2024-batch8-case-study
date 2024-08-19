package com.ofss.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ofss.main.domain.LoginDetails;

@Repository
public interface LoginDetailsRepository extends CrudRepository<LoginDetails, Integer> {
	public LoginDetails findByCustomerId(int customerId);
	
	public LoginDetails findByUsername(String username);
}
