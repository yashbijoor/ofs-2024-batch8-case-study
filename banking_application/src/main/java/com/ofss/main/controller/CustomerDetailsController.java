package com.ofss.main.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.main.domain.Customer;
import com.ofss.main.domain.Employee;

@CrossOrigin("*")
@RequestMapping("banking")
@RestController
public class CustomerDetailsController {
	@GetMapping("employees/{employeeId}")
	public String getCustomerByFromDB(@PathVariable int customerId) {
		return "Working";
	}
}
