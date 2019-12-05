package com.paru.polymorphism.overloding;

public class TypePromotion {

	public void add(float num1, float num2) {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2 + " float");
	}

	public void add(double num1, double num2) {
		System.out.println(num1 + num2 + " double");
	}

	public <T> void callTest(T t) {
		call(t);
	}

	public void call(Object t) {
		System.out.println("object");
	}

	public void call(String t) {
		System.out.println("String");
	}

	public static void main(String[] args) {
		TypePromotion typePromotion = new TypePromotion();
		// Type promotion : int is converted to float.
		// typePromotion.add(10, 20);
		typePromotion.callTest("S");
	}
}