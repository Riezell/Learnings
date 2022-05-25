package com.bankAccount;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount fannyAccount = new BankAccount();
		
		fannyAccount.withdrawal(100.0);
		
		fannyAccount.deposit(50.0);
		fannyAccount.withdrawal(100.0);
		
		fannyAccount.deposit(51.0);
		fannyAccount.withdrawal(100.0);

	}

}
