package com.BillsBurgers40;

public class HealthyBurger extends Hamburger{
	private String healthyExtra1Name;
	private double healthyExtra1Price;
	private String healthyExtra2Name;
	private double healthyExtra2Price;
	
	public HealthyBurger(  String meat,double price) {
		super("Healthy", meat, "Brown rye", price);
		
	}
	public void addHealthyAddition1(String name, double price) {
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = price;
	}
	public void addHealthyAddition2(String name, double price) {
		this.healthyExtra2Name = name;
		this.healthyExtra2Price = price;
	}
	@Override
	public double itemizehamburger() {
		double burgerPrice = super.itemizehamburger();
		
		
		if(healthyExtra1Name != null) {
			burgerPrice += healthyExtra1Price;
			System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);		
		}
		if(healthyExtra2Name != null) {
			burgerPrice += this.healthyExtra2Price;
			System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);		
		}
		return burgerPrice;
		}
	}
		
	
	
	
	
	


