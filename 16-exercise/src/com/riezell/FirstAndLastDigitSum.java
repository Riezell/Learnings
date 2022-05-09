package com.riezell;

public class FirstAndLastDigitSum {

	public static void main(String[] args) {
		int sum;
		sum= sumFirstAndLastDigit(252);
		System.out.println("The sum: " + sum);
		sum=sumFirstAndLastDigit(257);
		System.out.println("The sum: " + sum);
		sum = sumFirstAndLastDigit(0);
		System.out.println("The sum: "+ sum);
		sum= sumFirstAndLastDigit(5);
		System.out.println("The sum: " +sum);
		sum= sumFirstAndLastDigit(-10);
		System.out.println("The sum: " + sum);

	}
	public static int sumFirstAndLastDigit ( int number) {
	int lastDigit = 0;
	int firstDigit =number;
 if (number < 0) {
	 return -1;
    }
 
 lastDigit = number % 10;
 while(number > 10) {
	 number /=10;
 }
 firstDigit = number;
 return firstDigit + lastDigit;
  }
}
