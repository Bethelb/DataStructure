public class Year {
	public static void main(String[] args) {
		// this gets the year from command line argument and
		// converts string to int
		int year = Integer.parseInt(args[0]);

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap year");
        } else {
            System.out.println( year + " is not a leap year");
        }
	}
}
