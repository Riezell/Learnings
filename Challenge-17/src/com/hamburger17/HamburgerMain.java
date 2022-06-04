package com.hamburger17;

public class HamburgerMain {

	public static void main(String[] args) {
		Hambunger hamburger = new Hambunger("Basic", "Sausage", 3.56, "White");
		double price = hamburger.itemizeHamburger();
		hamburger.addHambugerAddition1("Tomato", 0.27);
		hamburger.addHambugerAddition2("Letuce", 0.75);
		hamburger.addHambugerAddition3("Cheese", 1.12);
		System.out.println("Total price is " + hamburger.itemizeHamburger());
        
		HealthyHamburger healthyburger =  new HealthyHamburger("Bacon", 5.57);
		healthyburger.addHambugerAddition1("Egg", 5.43);
		healthyburger.addHambugerAddition1("Lentils", 3.41);
		System.out.println("Total Healthy Burger Price is " +healthyburger.itemizeHamburger());
		
		DeluxeBurger db = new DeluxeBurger();
		db.itemizeHamburger();
				
	}

}
