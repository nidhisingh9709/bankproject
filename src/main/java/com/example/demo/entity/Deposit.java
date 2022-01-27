package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "deposit")
public class Deposit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer depositid;

	// Account Number
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 10)
	@NotBlank
	private String accountnum;

	// Amount
	@NotBlank
	@DecimalMin(value="0.0")
	@Digits(integer=10,fraction=2)
	private String amount;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@OneToOne(mappedBy= "deposit")
	Customer customer;

	public Integer getDepositid() {
		return depositid;
	}

	public void setDepositid(Integer depositid) {
		this.depositid = depositid;
	}

	public String getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(String accountnum) {
		this.accountnum = accountnum;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
