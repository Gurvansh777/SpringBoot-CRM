package com.gurvansh.crmdemo.repository;

import java.util.List;

import com.gurvansh.crmdemo.model.Customer;

public interface CustomerRepository {
	int saveCustomer(Customer customer);
	List<Customer> getAllCustomers();
}
