package com.challenge12;

public class VipCustomerMain {

	public static void main(String[] args) {
		VipCustomer customer1 = new VipCustomer();
		System.out.println(customer1.getName());
		
		VipCustomer customer2 = new VipCustomer("Fanny", 1000.00);
		System.out.println(customer2.getName());
		
		VipCustomer customer3 = new  VipCustomer("Riezell", 500.00, "riezell.com");
		System.out.println(customer3.getName());
		System.out.println(customer3.getCreditLimit());
		System.out.println(customer3.getEmailAddress());

	}

}
