package FlourPacker;

public class FlourPackProblem {

	public static void main(String[] args) {
		boolean total;
		total = canPack(1, 0, 4);
		System.out.println(total);
		System.out.println();
		total = canPack(1, 0, 5);
		System.out.println(total);
		System.out.println();
		total = canPack(0, 5, 4);
		System.out.println(total);
		System.out.println();
		total = canPack(2, 2, 11);
		System.out.println(total);
		System.out.println();
		total = canPack(-3, 2, 12);
		System.out.println(total);

	}
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if ( bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		int bigCountTotal = 0;
		bigCountTotal = bigCount * 5;
		System.out.println("Big Count Total = " + bigCountTotal);
		System.out.println("Small Count Tolal= " + smallCount);
		System.out.println("Goal= " + goal);
		
		int total = bigCountTotal + smallCount;
		if (total == goal) {
			System.out.println("goal met");
			return true;
		}else if (bigCountTotal % goal !=0) {
			while (bigCountTotal > goal) {
				bigCountTotal -= 5;
			}
		}
			
		int smallValue = (goal- bigCountTotal);
		return smallCount >= smallValue ? true : false;
	}

}
