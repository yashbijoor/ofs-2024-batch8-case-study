package com.ofss.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ofss.main.domain.Customer;

@Service
public interface CustomerService {
	public Customer getCustomerByCustomerId(int customerId);
	
	public Customer addNewCustomer(Customer customer);
	
	public List<Customer> getAllCustomers();
}
