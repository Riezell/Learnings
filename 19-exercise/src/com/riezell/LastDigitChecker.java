package com.riezell;

public class LastDigitChecker {

	public static void main(String[] args) {
		boolean check;
		check = hasSameLastDigit(41, 22, 71);
		System.out.println(check);
		check = hasSameLastDigit(23, 32, 42);
		System.out.println(check);
		check = hasSameLastDigit(9,99,999);
		System.out.println(check);
		
		boolean check2;
		check2 = isValid(10);
		System.out.println(check2);
		check2 = isValid(468);
		System.out.println(check2);
		check2 = isValid(1051);
		System.out.println(check2);
	
	}
	public static boolean hasSameLastDigit(int num1, int num2, int num3 ) {
		int lastDidit1, lastDigit2, lastDigit3 = 0;
		
		if((isValid(num1)) && (isValid(num2))
				&& (isValid(num3))){
			lastDidit1 = num1 % 10;
			lastDigit2 = num2 % 10;
			lastDigit3 = num3 % 10;
			
			if ((lastDidit1 == lastDigit2) || (lastDidit1 == lastDigit3) 
					|| (lastDigit2 == lastDigit3)) {
			return true;
			}
		}
		return false;
	}
    public static boolean isValid (int num) {
	if( num >= 10 && num <= 1000) {
		return true;
	}
	return false;
 }
}
