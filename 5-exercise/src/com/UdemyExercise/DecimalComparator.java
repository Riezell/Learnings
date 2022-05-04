package com.UdemyExercise;

public class DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces(double myFirstNumber, double mySecNumber) {
		int num1 = (int) (myFirstNumber * 1000 );
		int num2 = (int) (mySecNumber * 1000);
		
		if (num1 == num2) {
			return true;
		}else {
			return false;
		}
		
	}

}
