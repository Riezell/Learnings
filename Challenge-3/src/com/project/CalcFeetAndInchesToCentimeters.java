package com.project;


public class CalcFeetAndInchesToCentimeters {

	public static void main(String[] args) {
		double centimeters = calcFeetAndInchesToCentometer(16, 0);
		if(centimeters <0.0) {
            System.out.println("Invalid parameters");
        }
		calcFeetAndInchesToCentometer(157);


	}
	
	public static double calcFeetAndInchesToCentometer(double feet, double inches) {
		if ((feet <= 0 )|| (( inches <=0) || (inches >=12 ))) {
			System.out.println("invalid feet or inches parameters");
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		centimeters  += inches * 2.54;
		System.out.println("Feet " + feet + " Inches = " + inches + centimeters + " cm");
		return centimeters;
			
	}
	public static double calcFeetAndInchesToCentometer( double inches) {
		if (inches < 0) {
			return -1;
		}
		double feet = (int) inches / 12;
		double remainingInches = (int)inches % 12;
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentometer(feet, remainingInches);

		
	}
}
