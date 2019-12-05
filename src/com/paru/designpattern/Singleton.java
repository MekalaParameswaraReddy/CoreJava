package com.paru.designpattern;

import java.io.Serializable;

/**
 * Singleton class: we can created only one object for that class.
 * 
 * Private Constructor: which stops us creating object from out side class.
 * 
 * Have a static method (getInstance()) which will return same class object.
 * 
 * if object is already created just return the object. if not, create the
 * object and return that.
 * 
 * in case, if two or more thread are accessing getInstance() method at same
 * time more than one object will be created.
 * 
 * in order to stop that: getInstance() method should be synchronized or keep
 * the logic in synchronized block.
 * 
 * we have to stop cloning also by overriding the clone().
 */
public class Singleton implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	static Singleton singleton;
	public static int count = 0;

	/**
	 * Based on objects creation count will gets increased.
	 */
	private Singleton() {
		System.out.println("object is created");
		count++;
	}

	public static Singleton getInstance() {
		synchronized (Singleton.class) {
			if (singleton == null) {
				singleton = new Singleton();
				return singleton;
			} else {
				return singleton;
			}
		}
	}

	/**
	 * Static variable will use to count, how many objects are created.
	 */
	public void getObjectCount() {
		if (count == 1) {
			System.out.println("only one object is created");
		} else {
			System.out.println(count + " Objects are created");
		}
	}

	/**
	 * Two ways we can implement the clone(), one is throwing new
	 * CloneNotSupportedException("Stoping the clone.")
	 * 
	 * another is return the same object (singleton)
	 */
	protected Object clone() throws CloneNotSupportedException {
		// throw new CloneNotSupportedException("Stoping the clone.");
		return singleton;
	}

	/**
	 * To Overcome serialization issue, we have to implement method readResolve()
	 * method.
	 */
	protected Object readResolve() {
		System.out.println("handling singleton Serialization Issue");
		return singleton;
	}
}
