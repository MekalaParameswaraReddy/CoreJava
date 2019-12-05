package com.paru.oops.interfacee;

import java.io.IOException;

/**
 * The interface keyword is used to declare an interface.
 * 
 * Illegal modifier private for interface declaration; only public & abstract
 * are permitted
 */
public interface Developer {

	/**
	 * implicitly all members are : public static final.
	 */
	int devCode = 100;

	/**
	 * implicitly all method are : public abstract.
	 */
	void task();

	/**
	 * interface can not have constructor.
	 * 
	 * In interface all methods are abstract methods. constructor is not allowed
	 * inside the interface, because constructor is concrete method.
	 * 
	 * Constructor is used to assign some default values to member variables, but in
	 * interface all variables are constant by default.
	 */
	// Developer() { }

	// only public, static & final are permitted
	// protected int projCode = 100;

	/**
	 * 
	 * It's implementation all possibilities are handled.
	 */
	Object wish() throws IOException;

}