package PerfectNumber;

public class PerfectNumber {
  public static void main(String[] args) {
	  boolean check;
	  check = isPerfectNumber(6);
	  System.out.println(check);
	  check = isPerfectNumber(28);
	  System.out.println(check);
	  check = isPerfectNumber(5);
	  System.out.println(check);
	  check = isPerfectNumber(-1);
	  System.out.println(check);
	  
	}
  public static boolean isPerfectNumber (int number) {
	  int count =0;
	  if (number < 1) {
		  return false;
	  }
	  for(int i=1; i < number; i++) {
		  if( number % i == 0) {
			  count+=i;
		  }
	  }
		if(count == number) {
			return true;
		}
		return false;
  }
}
