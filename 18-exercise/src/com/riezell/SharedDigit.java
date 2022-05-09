package com.riezell;

public class SharedDigit {

	public static void main(String[] args) {
		boolean sharedNum;
		sharedNum=hasSharedDigit(12, 23);
		System.out.println(sharedNum);
		sharedNum= hasSharedDigit(9, 19);
		System.out.println(sharedNum);
		sharedNum= hasSharedDigit(15, 55);
		System.out.println(sharedNum);
	
	}
	
	public static boolean hasSharedDigit (int num1, int num2) {
		
		int lastdigit1 =0;
		int lastdigit2 = 0;
		int originalValue = num2;
		
		if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)){
		 
	    while(num1 > 0) {
	    	lastdigit1 = num1 % 10;
	    	System.out.println("Num1 last digit: " + lastdigit1);
	    
	    do {
	    	lastdigit2 = num2 % 10;
	    	System.out.println("Num2 last digit: " + lastdigit2);
	    	
	    	if( lastdigit1== lastdigit2) {
	    		return true;
	    	}else {
	    		num2/=10;
	    	}	
	    }while(num2 >0);
	    num2 = originalValue;
	    num1 /=10;
	      }
	    }
		return false;
		}
	}	
	


