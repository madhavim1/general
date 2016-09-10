/*  Write a program implementing explicit garbage collection. */


package com.training.general;

public class GarbageCollection {

	public static void main(String[] args) {
		for (int i=0;i<= 1000;i++) {
			Long l = new Long(100); 
		}
		System.out.println(Runtime.getRuntime().freeMemory());
		System.gc();
		System.out.println(Runtime.getRuntime().freeMemory());
	}

}
