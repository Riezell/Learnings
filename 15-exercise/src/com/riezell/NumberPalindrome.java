package com.riezell;

public class NumberPalindrome {
	

	public static void main(String[] args) {
		
		
				boolean num;
				num= isPalindrome(-1222);
				System.out.println(num);
				num= isPalindrome(707);
				System.out.println(num);
				num=isPalindrome(11212);
				System.out.println(num);
				
	}
	public static boolean isPalindrome (int number) {
		int lastDigit = 0;
		int reverse = 0;
		int value = number;
		while(number !=0 ||number > 0) {
			lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number/=10;	
		}
		if( value == reverse) {
			return true;
		}else {
			return false;
		}
	}

}
