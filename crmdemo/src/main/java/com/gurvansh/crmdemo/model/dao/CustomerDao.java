package com.gurvansh.crmdemo.model.dao;

import java.util.List;

import com.gurvansh.crmdemo.model.Customer;

public interface CustomerDao {
	int saveCustomer(Customer customer);
	List<Customer> getAllCustomers();
}
