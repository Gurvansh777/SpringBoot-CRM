package com.gurvansh.crmdemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gurvansh.crmdemo.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public int saveCustomer(Customer customer) {
		String qry = "INSERT INTO customers (id, name) VALUES (:id, :name)";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", customer.getCustomerId());
		map.put("name", customer.getName());
		
		return jdbcTemplate.update(qry, map);
	}

	@Override
	public List<Customer> getAllCustomers() {
		String qry = "SELECT * FROM customers";
		
		return jdbcTemplate.query(qry, new RowMapper<Customer>() {
			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer c = new Customer(rs.getInt("id"), rs.getString("name"));
				return c;
			}
		});
	}

}
