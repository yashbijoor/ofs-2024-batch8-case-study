package com.ofss.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofss.main.domain.Customer;
import com.ofss.main.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		Optional<Customer> custOptional = customerRepository.findById(customerId);
		if (custOptional.isPresent()) {
			return custOptional.get();
		}
		return null;
	}

	@Override
	public Customer addNewCustomer(Customer customer) {
		Customer addedCustomer = customerRepository.save(customer);
		return addedCustomer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return (List<Customer>) customerRepository.findAll();
	}
	
}
