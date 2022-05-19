package MinAndMaxInputChallenge;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 0;
		int max = 0;
		boolean first = true;
		
		while(true) {
			System.out.println("Enter Number:");
			boolean asAnInt = scan.hasNextInt();
			
			if(asAnInt) {
				int number = scan.nextInt();
			
				if(first) {
					first = false;
					min = number;
					max =number;
				}
				if (number > max) {
					max = number;
				}
				if (number < min) {
					min = number;
					
				}
			}else {
				break;
			}
		}
		scan.nextLine();
		System.out.println("minimum: " + min + ", maximum: " + max);
		scan.close();

	}

}
