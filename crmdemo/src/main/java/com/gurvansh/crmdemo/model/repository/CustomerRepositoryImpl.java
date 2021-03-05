package com.gurvansh.crmdemo.model.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gurvansh.crmdemo.model.Customer;
import com.gurvansh.crmdemo.model.dao.CustomerDao;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	@Autowired
	CustomerDao customerDao;
	
	@Override
	public int saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

}
