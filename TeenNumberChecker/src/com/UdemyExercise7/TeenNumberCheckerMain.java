package com.UdemyExercise7;

public class TeenNumberCheckerMain {

	public static void main(String[] args) {
		
		TeenNumberChecker check = new TeenNumberChecker();
		TeenNumberChecker check2 = new TeenNumberChecker();
		
		System.out.println(check.hasTeen(9, 99, 19));
		System.out.println(check.hasTeen(23, 15, 42));
		System.out.println(check.hasTeen(22, 23, 34));
		System.out.println();
		System.out.println(check2.isTeen(9));
		System.out.println(check2.isTeen(13));
	}

}
