package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.entity.Deposit;
import com.example.demo.service.DepositService;

public class DepositController {
	@Autowired
	private DepositService depositService;
	@PostMapping("/{id}/deposit")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addDeposit(@RequestBody @Valid Deposit deposit, Integer id) {
		depositService.addDeposit(deposit, id);
	}

}