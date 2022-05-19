package ReadingUSerInputChallenge;

import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		
		while(true) {
			int order =count +1;
			System.out.println("Enter number #" + order + ":");
			
			boolean isAnInt = scan.hasNextInt();
			
			if(isAnInt) {
				int number = scan.nextInt();
				count++;
				sum +=number;
				if(count==10) {
					break;
					
				}
			}else {
				System.out.println("Invalid number");
			}
			scan.nextLine();
		}
		System.out.println("sum = " + sum);
		scan.close();

	}

}
