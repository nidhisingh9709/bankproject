package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Deposit;
import com.example.demo.repository.depositRepository;

@Service
public class DepositService {

	@Autowired
	private depositRepository depositRepository;
	
	public void addDeposit(Deposit deposit, Integer id) {
		depositRepository.save(deposit);
	}
	
}