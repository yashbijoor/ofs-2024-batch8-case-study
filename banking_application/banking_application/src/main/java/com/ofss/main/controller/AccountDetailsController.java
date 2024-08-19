package com.ofss.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.main.domain.Account;
import com.ofss.main.domain.Customer;
import com.ofss.main.service.AccountService;

@CrossOrigin
@RequestMapping("account")
@RestController
public class AccountDetailsController {
	@Autowired
	AccountService accountService;
	
	@PostMapping("addaccount")
	public ResponseEntity<Account> addEmployeeToDB(@RequestBody Account account) {
		System.out.println(account);
		Account newAccount = accountService.addAccount(account);
		return new ResponseEntity<>(newAccount, HttpStatus.OK);
	}
	
	@GetMapping("accounts/{customerId}")
	public ResponseEntity<List<Account>> getCustomerByFromDB(@PathVariable("customerId") int customerId) {
		System.out.println("CustomerID is " + customerId);
		return new ResponseEntity<>(accountService.findAllByCustomerId(customerId), HttpStatus.OK);
	}
		
}
