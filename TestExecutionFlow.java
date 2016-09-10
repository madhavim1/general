/* Write a program that contains a constructor, a static block 
 * and a static method. Execute the program in order to verify 
 * the order to execution of methods and block.
 */

package com.training.general;

import java.util.Date;

public class TestExecutionFlow {
	//First static block is executed and next constructor 
	// or static method will be executed depending on the call
	
	public TestExecutionFlow() {
		System.out.println("Calling from constructor...");
	}
	
	public static void getDate() {
		System.out.println("Calling Date from Static method : "+new Date());
	}
	
	static {
		System.out.println("Calling from Static block...");
	}
	
	public static void main(String[] args) {
		TestExecutionFlow tef = new TestExecutionFlow();
		getDate();
	}
}
