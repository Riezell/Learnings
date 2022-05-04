package com.riezell;

public class EqualSumCheckerMain {

	public static void main(String[] args) {
	 
		EqualSumChecker check = new EqualSumChecker();
		
		System.out.println(check.hasEqualSum(1, 1, 1));  //return false
		System.out.println(check.hasEqualSum(1, 1, 2));   //return true
		System.out.println(check.hasEqualSum(1, -1, 0));  //return true

	}

}
