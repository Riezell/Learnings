package com.exercise27;

import java.util.Scanner;

public class InputCalculator {
	public static void inputThenPrintSumAndAverage() {
		int sum=0;
		int average = 0;
		int count = 0;
		double avgSum = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Number: ");
			boolean hasInt = scan.hasNextInt();
			
			
			if(hasInt) {
				int num = scan.nextInt();
				count++;
				sum += num;
				
				if(num == 0) {
					count --;
				}
			
				avgSum += num;
				average = (int)Math.round(avgSum/count);
			}else {
				System.out.println("SUM = " + sum + " AVERAGE = " + average);
				scan.close();
				break;
			}
		
		}
		
	}

}
