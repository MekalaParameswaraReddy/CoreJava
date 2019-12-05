package com.paru.oops.abstraction;

/*
 * abstract is key word in java, we can use infront of class and method.
 *
 * An abstract class can have all concrete methods.
 * An abstract class can have all abstract methods.
 * An abstract class can have all combination of abstract and concrete methods.
 *
 * If any method is abstract class must be abstract.
 *
 * abstract class should be extended to it's base class.
 *
 * In sub class all super class abstract methods must be implemented other wise leave them as abstract.
 *
 * abstract class can not be instantiated.
 *
 * abstract class & method can not be a final in java
 */
public abstract class TwoWheeler {

	/*
	 * abstract class constructor
	 */
	public TwoWheeler() {
		System.out.println("abstract class constructor");
	}

	/*
	 * Concrete method
	 */
	public void wheels() {
		System.out.println("Every two wheeler must have" + 2 + "wheels");
	}

	/*
	 * Concrete method: final method.
	 */
	public final void fuelTank() {
		System.out.println("Every two wheeler must have" + 1 + " fuel tank");
	}

	/*
	 * Abstract method
	 */
	public abstract void gares();

	/*
	 * Abstract method
	 */
	public abstract void breaks();

	public static void main(String[] args) {
		System.out.println("main method");
		// TwoWheeler twoWheeler = new TwoWheeler(); //C.error
	}

	/*
	 * static methods can not overridden in java. Syntactically static method
	 * allows in abstract class. there no much use this method.
	 */
	public static void dummyStatic() {
		System.out.println("dummy Static method");
	}
}