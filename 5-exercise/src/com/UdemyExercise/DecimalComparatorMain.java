package com.UdemyExercise;

public class DecimalComparatorMain {

	public static void main(String[] args) {

      DecimalComparator compare = new DecimalComparator();
      
      
      System.out.println(compare.areEqualByThreeDecimalPlaces(-3.1756,-3.175));  //return true
      System.out.println(compare.areEqualByThreeDecimalPlaces(3.175, 3.176));    //return false
      System.out.println(compare.areEqualByThreeDecimalPlaces(3.0, 3.0));        //return true
      System.out.println(compare.areEqualByThreeDecimalPlaces(-3.123, 3.123));   //return false
     
     
	}

}
