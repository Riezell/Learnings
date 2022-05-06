package com.UdemyExercise7;

public class TeenNumberChecker {
	

	public static boolean hasTeen (int teenAge1, int teenAge2, int teenAge3) {
		
		if (teenAge1 >= 13 && teenAge1 <= 19 || teenAge2 >= 13 && teenAge2 <= 19
				|| teenAge3 >= 13 && teenAge3 <= 19 ) {
			return true;
		}else {
		return false;
		}
		
	}
		
	
	public static boolean isTeen(int teenAge4) {
		if (teenAge4 >= 13 && teenAge4 <= 19) {
			return true;
		}else {
		return false;
		}
	}

}
