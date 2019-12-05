package com.paru.exception;

public class MajorOrMinorExp extends Exception {

	/**
	 * 
	 * @param name
	 *            : Used to pass the user understandable message.
	 */
	MajorOrMinorExp(String name) {
		super(name);
	}

	/**
	 * 
	 * @param message
	 *            : Used to pass the user understandable message.
	 * @param cause
	 *            : Used to find the root cause of the message
	 */
	MajorOrMinorExp(String message, Throwable cause) {
		super(message, cause);
	}
}
