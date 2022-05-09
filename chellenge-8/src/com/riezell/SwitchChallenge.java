package com.riezell;

public class SwitchChallenge {

	public static void main(String[] args) {
		char charValue = 'C';
		switch(charValue) {
		case 'A':
			System.out.println("Char valueA was found");
		break;
		case 'B':
			System.out.println("Char value B was found");
		break;
		case 'C': case 'D': case 'E':
			System.out.println(charValue + " was found");
		break;
		default:
		System.out.println("Char value A,B,C, D and E could not found");
		}
		
		String month = "January";
		switch(month.toLowerCase()) {
		case "january":
			System.out.println("Jan");
		break;
		case "february":
			System.out.println("Feb");
		break;
		case "march": case "april": case "may": case "june":
			System.out.println(month);
		break;
		default:
			System.out.println("Not sure");
		break;
		
		}
	}

}
