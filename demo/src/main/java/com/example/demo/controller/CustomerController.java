package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer requestBody) {
		
		Customer response = customerService.saveCustomer(requestBody);
		
		return new ResponseEntity<Customer>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Customer>> getCustomers() {
		
		List<Customer> customers = customerService.getCustomers();
		
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}
	
}
