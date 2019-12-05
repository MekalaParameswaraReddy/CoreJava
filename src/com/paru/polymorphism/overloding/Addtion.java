package com.paru.polymorphism.overloding;

/**
 * 
 * Method overloading will increase the understanding and clear role of the
 * method.
 * 
 */
public class Addtion {
	/**
	 * If two methods are having same method signature:: Compile time error i.e
	 * duplicate method name.
	 */
	public int add(int num1, int num2) {
		return (num1 + num2);
	}

	/**
	 * Only return change : Compile time error i.e duplicate method name.
	 */
	/*
	 * public double add(int num1, int num2) { return (num1 + num2); }
	 */

	/**
	 * No.of parameters are different.
	 */
	public int add(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}

	/**
	 * Type of parameters are different.
	 */
	public double add(double num1, int num2) {
		return (num1 + num2);
	}

	public String add(String num1, int num2) {
		return (num1 + num2);
	}

	/**
	 * Order of parameters are different.
	 */
	public String add(int num1, String num2) {
		return (num1 + num2);
	}

	public static void main(String[] args) {
		Addtion addtion = new Addtion();
		System.out.println(addtion.add(10, 20));
		System.out.println(addtion.add(10, 20, 30));
		System.out.println(addtion.add(10.20, 20));
		System.out.println(addtion.add("a", 2));
		System.out.println(addtion.add(2, "a"));
	}

}
