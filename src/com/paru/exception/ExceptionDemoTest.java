package com.paru.exception;

import java.io.IOException;

public class ExceptionDemoTest {

	/**
	 * @throws MajorOrMinorExp
	 * @param args
	 * @throws IOException
	 * @throws
	 */
	public static void main(String[] args) throws IOException {
		ExceptionDemo demo = new ExceptionDemo();
		//demo.unCheckedExptest(0);
		//demo.checkedExpTest(0);		
		demo.exceptionChaniningTest();
		/*try {
			demo.personTest(0);
		} catch (MajorOrMinorExp e) {
			e.printStackTrace();
		}*/
	}
}
