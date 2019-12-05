package com.paru.exception;

import java.io.IOException;

public class ExceptionDemoTest {

	/**
	 * @throws MajorOrMinorExp
	 * @param args
	 * @throws IOException
	 * @throws
	 */
	public static void main(String[] args) throws IOException, MajorOrMinorExp {
		ExceptionDemo demo = new ExceptionDemo();
		/*demo.unChecketExptest(0);
		demo.checkedExpTest(0);*/
		demo.personTest(10);
	}
}
