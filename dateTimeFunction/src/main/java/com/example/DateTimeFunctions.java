package com.example;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFunctions {

	/*
	 * Update the class and existing methods as necessary to perform the required calculations
	 * and return the expected results.
	 *
	 * - All code should be inside the placeholders provided.
	 * - Do not add code outside of the placeholders.
	 * - Do not change code except as required inside the placeholders.
	 *	    //YOUR CODE STARTS HERE
	 *
	 *		//YOUR CODE ENDS HERE
	 */


	/*
	 * Implement the method so that it returns today's date.
	 */
	public static LocalDate getTodaysDate() {
		//YOUR CODE STARTS HERE

        //The today's date
        LocalDate todayDate = LocalDate.now();

		return todayDate;

		//YOUR CODE ENDS HERE

	}

	/*
	 * Implement the method so that it returns the date x days after
	 * the input date.
	 */
	public static LocalDate getLaterDatebyDays(LocalDate date, int x) {
		//YOUR CODE STARTS HERE

        //We add x days to today's date
        LocalDate todayDate = LocalDate.now();
        LocalDate future = todayDate.plusDays(x);

		return future;

		//YOUR CODE ENDS HERE

	}

	/*
	 * Implement the method so that it returns the date x weeks prior to
	 * the input date.
	 */
	public static LocalDate getPreviousDatebyWeeks(LocalDate date, int x) {
		//YOUR CODE STARTS HERE

        //We subtract x weeks to today's date
        LocalDate todayDate = LocalDate.now();
        LocalDate past = todayDate.minusWeeks(x);

		return past;

		//YOUR CODE ENDS HERE

	}

	/*
	 * Implement the method so that it returns the time difference between two input dates
	 * in terms of years, months, and days.
	 * Return the String in the format: "Year-20:Months-5:Days-1"
	 */
	public static String getTimeDifference(LocalDate date1, LocalDate date2) {
		//YOUR CODE STARTS HERE

        /*
        Human interpretation instead of machine interpretation.
        The Period class focuses on years, months, and days
         */
        Period diff = date1.until(date2);

        /*
        A Method from Period that retrieves the number of days, then converted
        into String. Do exactly the same with months and years.
         */

        int days = diff.getDays();
        String daysString = Integer.toString(days);

        int months = diff.getMonths();
        String monthsString = Integer.toString(months);

        int years = diff.getYears();
        String yearsString = Integer.toString(years);

        //String format given in the question
        String formatted = "Years-" + yearsString + ":Months-" + monthsString + ":Days-" + days;

        return formatted;

		//YOUR CODE ENDS HERE

	}

	public static void main(String[] args) {
		System.out.println("Today's date is: " + getTodaysDate());
		System.out.println("14 days from today is: " + getLaterDatebyDays(getTodaysDate(), 14));
		System.out.println("5 weeks prior to today was: " + getPreviousDatebyWeeks(getTodaysDate(), 5));
		System.out.println("The difference between today " +
				"and June 30, 2031 is: " +
				getTimeDifference(getTodaysDate(), LocalDate.of(2031,06,30)));
	}
}
