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

import com.ofss.main.domain.Customer;
import com.ofss.main.service.CustomerService;

@CrossOrigin
@RequestMapping("banking")
@RestController
public class CustomerDetailsController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("customers")
	public ResponseEntity<List<Customer>> getAllCustomersFromDB() {
		return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
	}
	
	@GetMapping("customer/{customerId}")
	public ResponseEntity<Customer> getCustomerByFromDB(@PathVariable("customerId") int customerId) {
		System.out.println("CustomerID is " + customerId);
		return new ResponseEntity<>(customerService.getCustomerByCustomerId(customerId), HttpStatus.OK);
	}
	
	@PostMapping("addemployee")
	public ResponseEntity<Integer> addEmployeeToDB(@RequestBody Customer customer) {
		customerService.addNewCustomer(customer);
		return new ResponseEntity<>(customer.getCustomerId(), HttpStatus.OK);
	}
	
	
}
