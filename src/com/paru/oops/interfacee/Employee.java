package com.paru.oops.interfacee;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * A class can implement one or more interfaces. This is called multiple
 * inheritance.
 * 
 */
public class Employee implements Developer, Manager {

	public void task() {
		System.out.println("every one have their own task");
	}

	/**
	 * return type of wish() changed to 'String' from 'Object'.
	 * 
	 * Access specifier changed to 'public' from 'default'.
	 * 
	 * Adding or removing synchronized keyword doesn't take part in overriding.
	 */
	public synchronized String wish() throws IOException,
			FileNotFoundException, EOFException, IndexOutOfBoundsException {
		return "Good morning";
	}

	public static void main(String[] args) throws IOException {
		// Interface can not be instantiated.
		// Developer d = new Developer();
		// Object is the super class for every class
		System.out.println(Employee.class.getSuperclass()); // object
		// No super class for interface
		System.out.println(Developer.class.getSuperclass()); // null
		Developer d1 = new Employee();
		Manager m1 = new Employee();
		System.out.println(d1.wish());
		m1.task();
	}

}