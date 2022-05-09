package com.riezell;

public class EvenDigitSum {

	public static void main(String[] args) {
		int sum;
		sum=getEvenDigitSum(123456789);
		System.out.println(sum);
		sum = getEvenDigitSum(252);
		System.out.println(sum);
		sum = getEvenDigitSum(-22);
		System.out.println(sum);
		
		

	}
	public static int getEvenDigitSum (int number) {
		
		int sum=0;
		int lastDigit = 0;
		if (number < 0) {
			return -1;
		}
		while(number > 0 ) {
			lastDigit= number % 10;
			if(number % 2 == 0) {
				sum+= lastDigit;
				number /=10;
			}else {
				number /=10;
				continue;
			}	
		
		}
		return sum;
	}

}
