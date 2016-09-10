/*  Write a program that implements various functions 
 *  of different type of access modifiers(private,protected,
 *  default,public) and then access these methods with in 
 *  or outside the class based on the identifier scope.
 */

package com.training.general;

import java.util.Calendar;
public class TestAccessModifiers {
	
	public static void getTimeInMillis() {
		System.out.println("Time in Milliseconds: "+Calendar.getInstance().getTimeInMillis());
	}
	
	static void getCalendarType() {
		System.out.println("Calendar type: "+Calendar.getInstance().getCalendarType());
	}
	
	protected static void getTimeZone() {
		System.out.println("Time Zone: "+Calendar.getInstance().getTimeZone());
	}
	
	private static void getDate() {
		System.out.println("Today's date: "+Calendar.getInstance().getTime());
	}
	
	public static void main(String[] args) {
		getTimeInMillis();
		getCalendarType();
		getTimeZone();
		getDate();
	}
}

