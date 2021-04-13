package com.interview.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.entity.Customer;
import com.interview.repository.CustomerRepository;
import com.interview.request.CustomerRequest;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	
	public List<Customer> listAllCustomers() {
		return customerRepository.findAll();
	}

	public Optional<Customer> listCustomersById(Long id) {
		return customerRepository.findById(id);
	}

	public Customer saveCustomer(CustomerRequest newCustomer) {
		Customer customer = new Customer();
		customer.setAddress(newCustomer.getAddress());
		customer.setCountry(newCustomer.getCountry());
		customer.setEmailAddress(newCustomer.getEmailAddress());
		customer.setFirstName(newCustomer.getFirstName());
		customer.setLastName(newCustomer.getLastName());
		customer.setPhoneNumber(newCustomer.getPhoneNumber());
		customer.setState(newCustomer.getState());
		return customerRepository.save(customer);
	}
	
}
