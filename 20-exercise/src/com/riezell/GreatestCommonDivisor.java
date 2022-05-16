package com.riezell;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		int num;
		num = getGreatestCommonDivisor(25, 15);
		System.out.println(num);
		num = getGreatestCommonDivisor(12,30);
		System.out.println(num);
		num = getGreatestCommonDivisor(8, 18);
		System.out.println(num);
		num = getGreatestCommonDivisor(81, 153);
		System.out.println(num);
	}
	public static int getGreatestCommonDivisor(int firstnum,int secondnum) {
		int greatest = 0;
		
		if (firstnum >= 10 && secondnum >= 10) {
			for(int i= 1; i<= firstnum && i <= secondnum; i++) {
				if (firstnum % i == 0 && secondnum % i == 0) {
					greatest = i;
				}
			}
			
		}else {
		return -1;
	}
	return greatest;
	}
}
