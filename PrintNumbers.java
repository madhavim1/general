/* Write a program to print 1 to 10 numbers without 
 * using loops and you should not have more than 1 
 * print statement.
 */
package com.training.general;

public class PrintNumbers {
	
	public static void printRecursive(int n) {
		if(n<=10) {
			System.out.print(n +" ");
			printRecursive(n+1);
		}
	}
	
	public static void main(String[] args) {
		printRecursive(1);
	}

}
