package com.bankAccount;

public class BankAccount {
	
	private String accountNumber;
	private double balance;
	private String customerName;
	private String emailAddress;
	private String phoneNumber;
	
	public void deposit (double depositAmmount) {
		this.balance += depositAmmount;
	System.out.println("Deposit of " + depositAmmount + " made. New balance is " + this.balance);
	}
	public void withdrawal(double withdrawalAmmount) {
		if (this.balance - withdrawalAmmount <=0) {
			System.out.println("Only " + this.balance + " available. Withdrawal not Processed");
		}else {
			this.balance -= withdrawalAmmount;
			System.out.println("Withdrawal of " + withdrawalAmmount + " processed. Remaining balance = " +this.balance);
		} 
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
		
	}
	
	
	

