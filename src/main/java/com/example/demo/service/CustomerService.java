package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public void addUser(Customer customer) {
		customerRepository.save(customer);
	}

	public Optional<Customer> getCustomers(Integer id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}

	public Iterable<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	public void deleteDeposit(Integer id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}
	
}

