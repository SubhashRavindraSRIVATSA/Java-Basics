/**
 * 
 */
package com.subhash.javabasics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Subhash
 *
 */
public class JavaDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Represents a date (year, month, day (yyyy-MM-dd))
		LocalDate myDate = LocalDate.now();
		System.out.println("Today's Date is : "+myDate);
		
		//Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
		LocalTime myTime = LocalTime.now();
		System.out.println("Today's Date is : "+myTime);
		
		//Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time is "+myDateTime);

	}

}
