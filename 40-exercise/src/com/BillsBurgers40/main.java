package com.BillsBurgers40;

public class main {

	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger("Basic", "Sausage", "White", 3.56);
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("Lettuce", 0.75);
		hamburger.addHamburgerAddition3("Cheese", 1.13);
		System.out.println("Total burger price is " + hamburger.itemizehamburger());
		
		
		HealthyBurger healthyburger = new HealthyBurger("Bacon", 5.67);
		healthyburger.addHamburgerAddition1("Egg", 5.43);
		healthyburger.addHamburgerAddition2("Lentils", 3.41);
		System.out.println("Total Healthy Burger Price is " + healthyburger.itemizehamburger());
		
		
		DeluxeBurger db = new DeluxeBurger();
		db.addHamburgerAddition3("Should not do this", 50.53);
		System.out.println("Total Deluxe Burger Price is " + db.itemizehamburger());
		
	}
}
