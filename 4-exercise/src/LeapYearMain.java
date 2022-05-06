
public class LeapYearMain {

	public static void main(String[] args) {
		LeapYear lp = new LeapYear();
		
		boolean  maybe;
		
		maybe = LeapYear.isLeapYear(-1600);
		System.out.println(maybe);
		maybe = LeapYear.isLeapYear(1600);
		System.out.println(maybe);
		maybe = LeapYear.isLeapYear(2017);
		System.out.println(maybe);
		maybe = LeapYear.isLeapYear(2000);
		System.out.println(maybe);
		
	}

}
