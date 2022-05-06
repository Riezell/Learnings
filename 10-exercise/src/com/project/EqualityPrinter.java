package com.project;

public class EqualityPrinter {
	
	public static void printEqual(int print1, int print2,int print3) {
		if ((print1 <0)|| (print2 <0)||(print3 <0)){
			System.out.println("Invalid Value");
		}else if ((print1 == print2)&& (print1 == print3) && (print2 == print3)){
			System.out.println("All numbers are equal");
		}else if ((print1 != print2) && (print1 != print3) && (print2 != print3)){
			System.out.println("All numbers are different");
		}else {
			System.out.println("Neither all are equal or different");
		
			
		}
			
		
	}

}
