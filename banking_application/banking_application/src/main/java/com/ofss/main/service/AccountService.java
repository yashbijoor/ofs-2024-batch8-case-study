package com.ofss.main.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.ofss.main.domain.Account;

@Service
public interface AccountService {
	public Account addAccount(Account account);
	public List<Account> findAllByCustomerId(int customerId);
}
