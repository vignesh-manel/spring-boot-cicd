package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);
	
	List<Customer> getCustomers();
	
	
}
