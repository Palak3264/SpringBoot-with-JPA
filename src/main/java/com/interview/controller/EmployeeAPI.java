package com.interview.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.entity.Customer;
import com.interview.request.CustomerRequest;
import com.interview.service.CustomerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/v1/api")
@Tag(name = "Employee API")
public class EmployeeAPI {

	@Autowired
	CustomerService customerService;

	@GetMapping("/employee")
	@Operation(summary = "Get List of Employees", description = "REST API to list Customer Entity content - Equivalent to List")
	public List<Customer> getEmployeeList() {
		return customerService.listAllCustomers();
	}

	@GetMapping("/employee/{id}")
	@Operation(summary = "Read Customer Data", description = "REST API to return employee information - Equivalent to read")
	public Optional<Customer> getEmployeeById(@PathVariable("id") Long customerId) {
		return customerService.listCustomersById(customerId);
	}

	@PostMapping("/employee")
	@Operation(summary = "Add a new Customer information", description = "REST API to put employee information in to system - Equivalent to read")
	Customer newEmployee(@RequestBody CustomerRequest newEmployee) {
		return customerService.saveCustomer(newEmployee);
	}
}
