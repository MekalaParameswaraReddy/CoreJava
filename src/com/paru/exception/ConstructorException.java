package com.paru.exception;

public class ConstructorException {

	public ConstructorException() throws Exception {
		throw new Exception("Generating Exception");
	}

	public static void main(String[] args) {
		try {
			ConstructorException cE = new ConstructorException();
			System.out.println("Continue");
		} catch (Exception ex) {
			System.out.println("Generated Exception was catched..");
		}
	}
}
