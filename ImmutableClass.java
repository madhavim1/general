/* Write an Immutable class */

package com.training.general;

public final class ImmutableClass {
	
	private final int empId;
	
	public ImmutableClass(int i) {
		empId = i;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public static void main(String[] args) {
		ImmutableClass im = new ImmutableClass(10);
		System.out.println("empId is : "+im.getEmpId());
	}
}
