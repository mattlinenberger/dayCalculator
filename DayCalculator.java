package whatDayIsIt;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DayCalculator {

	public static void calculateDate() {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println("how many days would you like to add to todays date?");
		Scanner in = new Scanner(System.in);
		int numberOfDays = in.nextInt();
		LocalDate yourDate = LocalDate.now().plusDays(numberOfDays);
		System.out.println("Your date will be " + yourDate + ".  This added " + numberOfDays + " days.");

		//
		// System.out.println(numberOfDays);
		// Calendar cal = Calendar.getInstance();
		// System.out.println("Todays date is : " + cal.getTime());
		// cal.add(Calendar.DATE, numberOfDays);
		// System.out.println("With the added " + numberOfDays + ", it is " +
		// cal.getTime());

	}

}
