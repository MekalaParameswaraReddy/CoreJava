package com.paru.finall;

public class Circle {
	private final float pi = 3.141f;

	public final void draw() {
		System.out.println("shape is round");
	}

	public void size() {
		// Compile time error
		// pi = 15.23f;
		System.out.println("it is normal in size");
	}
}