package com.project;

public class MinutesToYearsDaysCalculator {
	
 public static void printYearsAndDays(long minutes) {
	 long year = 0;
	 long day = 0;
	 if (minutes <0) {
		 System.out.println("Invalid Value");
	 }
	  year = (minutes / 525600);
	  day = (minutes % 525600) / 1400;
	 System.out.println(minutes + " min = " + year + "y and " + day + "d");
 }
}
