package com.paru.polymorphism.overridding;

public class SubStatic extends SupStatic {
	
	/**
	 * This is static over ridding : this feature is method hiding.
	 */
	public static void m1() {
		System.out.println("SubStatic");
	}

	public static void main(String args[]) {
		SupStatic sup = new SubStatic();
		sup.m1();
	}
}
