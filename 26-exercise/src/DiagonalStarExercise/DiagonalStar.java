package DiagonalStarExercise;

public class DiagonalStar {

	public static void main(String[] args) {
		printSquareStar(5);
		System.out.println();
		printSquareStar(8);
		
	}
	public static void printSquareStar(int number) {
		if(number < 5) {
			System.out.println("Invalid Value");
			
		}else {
		
		for (int star = 0; star < number; star++) {
			for (int s = 0; s  < number; s++) {
				if(star == 0 || s == 0 || star == number -1 || s == number -1 
						|| star == s || s == number - (star + 1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	 }
  }
}
