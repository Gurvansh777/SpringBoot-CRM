package com.gurvansh.crmdemo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gurvansh.crmdemo.model.Customer;
import com.gurvansh.crmdemo.repository.CustomerRepository;

@Controller
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Customer> customerList = customerRepository.getAllCustomers();
		model.addAttribute("customers", customerList);
		return "index";
	}
}
