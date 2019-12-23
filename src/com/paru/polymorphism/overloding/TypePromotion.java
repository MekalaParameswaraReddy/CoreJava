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
	
	public void intCall(int value){
		System.out.println("int call");
		System.out.println(value);
	}
	
	/**
	 * if this method is present no exception and O/P is : Obj call, null
	 * if this method is not present will get null pointer exception
	 *
	 */
	public void intCall(Object value){
		System.out.print("Obj call" +", ");
		System.out.println(value);
		//Following line will throw null pointer exception.
		//System.out.println(value.toString());
	}


	public static void main(String[] args) {
		TypePromotion typePromotion = new TypePromotion();
		// Type promotion : int is converted to float.
		//typePromotion.add(10, 20);
		//typePromotion.callTest("S");
		Integer val = null;
		typePromotion.intCall(val);
	}
}