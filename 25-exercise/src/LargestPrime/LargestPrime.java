package LargestPrime;

public class LargestPrime {

	public static void main(String[] args) {
		System.out.println(getLargestPrime(21));
		System.out.println(getLargestPrime(217));
		System.out.println(getLargestPrime(0));
		System.out.println(getLargestPrime(45));
		System.out.println(getLargestPrime(-1));

	}
	public static int getLargestPrime ( int number) {
	
	int prime = 2;
	
	if (number <= 1) {
		return -1;
	}else {
		while(prime < number) {
			if(number % prime !=0) {
				prime++;
			}else {
				number = number/ prime;
				prime = 2;
			}
		}
		return prime;
	}
	}
}
