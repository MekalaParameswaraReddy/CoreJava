package com.paru.finall;

public class BigCircle extends Circle {

	public void size() {
		System.out.println("it is very big in size");
	}

	/**
	 * final method can not be overridden, Compile time error.
	 */
	// public final void draw() { }

	public static void main(String[] args) {
		Circle circle = new BigCircle();
		circle.size();

	}

}