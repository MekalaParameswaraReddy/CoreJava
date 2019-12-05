package com.paru.system;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import static java.lang.System.out;

/**
 * The "standard" output stream. This stream is already open and ready to accept
 * output data. Typically this stream corresponds to display output or another
 * output destination specified by the host environment or user.
 *
 * "System" is a class in the java.lang package.
 * 
 * "out" is a final static member of type PrintStream, declared in the System
 * class.
 * 
 * "println" is a method of java.io.PrintStream. This method is overloaded to
 * print message to output destination.
 */
public class SysoutChange {

	public static void main(String[] args) throws FileNotFoundException {
		out.println("I am using staic import");
		System.out.println("Output is in console");
		System.setOut(new PrintStream(new FileOutputStream("D:\\out.txt")));
		System.out.println("Output is changed from console to file.");
	}
}
