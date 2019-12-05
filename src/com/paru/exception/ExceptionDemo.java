package com.paru.exception;

import java.io.IOException;

/**
 * 
 * The process of converting system error messages into user friendly error
 * message is known as Exception handling.
 * 
 * An Exception is an event, which occurs during the execution of a program,
 * that disrupts the normal flow of the program's Instructions.
 * 
 */
public class ExceptionDemo {

	/**
	 * 
	 * try block always contains problematic statements.
	 * 
	 * If any Exception occurs in try block, Control comes out from try block &
	 * and executes the appropriate catch block. once it came out from the try
	 * block it never goes into try block again.
	 * 
	 * Each try must be followed by either catch (one or more) or finally block.
	 * 
	 * B/W try and catch/finally no statements are allowed not even SOP stmt.
	 * 
	 * Nested inner try block also possible.
	 * 
	 * catch block will execute only when exception occurs, That to only one
	 * time even though more catches are presents.
	 * 
	 * Sub class exp followed by super class exception, if more catches are
	 * present.
	 * 
	 * Try block inside catch is valid, mainly used if we want to perform some
	 * operation based on exception. Ex re-establish the connection, Re login.
	 * 
	 * finally block mainly use for nullifying the object. Ex closing
	 * connections.
	 * 
	 * finally block is optional, if it present it will execute irrespective of
	 * Exception.
	 * 
	 * finally block always will execute, even though if you put return
	 * statement in catch.
	 * 
	 * Following unChecketExptest() is an example for unchecked exception. if
	 * any problem in arithmetic operation like divide by zero
	 * ArithmeticException will occurs.
	 */
	public void unChecketExptest(int num) {
		try {
			int val = 10 / num;
			System.out.println(val);
		} catch (ArithmeticException exp) {
			// System.out.println(exp);
			// user friendly error message
			System.out.println("Denominator not be zero");
			return;
		} catch (Exception exp) {
			System.out.println("Please provide the valid number");
			try {

			} catch (Exception inExp) {

			}
		} finally {
			System.out.println("executed irrespective of Exception.");
		}
		System.out.println("normal flow of the program's Instructions");
	}

	/**
	 * 
	 * throws is used to throw an exception with in the method. throws is part
	 * of method body. throws followed by one or more class names (if more,
	 * separated by comma).
	 * 
	 * using throws we can handled checked and unchecked exceptions.
	 * ArithmeticException is unchecked, IOException is checked.
	 * 
	 * Inside method 'throw' with checked, 'throws' is mandatory along with
	 * method signature.
	 * 
	 * Inside method 'throw' with unchecked, 'throws' is purely optional along
	 * with method signature.
	 * 
	 * 'throw' is used to declare a exception inside the method, 'throw'
	 * followed by object, that to only one.
	 */
	public void checkedExpTest(int num) throws IOException {
		int value = 10;
		if (num == 0) {
			ArithmeticException ae = new ArithmeticException(
					"Plase do not provide Denominator as zero.");
			throw ae;

		} else {
			System.out.println(value / num);
			throw new IOException("May be In/Out error");
		}
	}

	public void personTest(int age) throws MajorOrMinorExp {
		try {
			if (age <= 0) {
				// exp is always occurs
			} else if (age > 18) {
				MajorOrMinorExp exp = new MajorOrMinorExp("Person is major");
				throw exp;
			} else {
				MajorOrMinorExp exp = new MajorOrMinorExp("Person is minor");
				throw exp;
			}
		} catch (Exception ex) {
			throw new MajorOrMinorExp("Number shold not be negative", ex);
		}
	}
	
	
	/**
	 * while catching the exception, handle the subclass exception, followed by
	 * super class exception.
	 * 
	 * if not it will 'Unreachable Catch Block', compile time exception occurs.
	 */
	public void UnreachableCatchBlock(int num) {
		try {
			int val = 10 / num;
			System.out.println(val);
		} catch (Exception exp) {
			System.out.println("Denominator not be zero");
		} /*catch (ArithmeticException exp) {
			System.out.println("Please provide the valid number");
		}*/
		System.out.println("normal flow of the program's Instructions");
	}

}
