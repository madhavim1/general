package com.training.general;

public class TestModifiersOutSideClass {

	public static void main(String[] args) {
		TestAccessModifiers.getTimeInMillis(); //public
		TestAccessModifiers.getCalendarType(); //default
		TestAccessModifiers.getTimeZone(); //protected
	}
}
