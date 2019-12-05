package com.paru.collections.hashcodeandequals;

import java.util.Date;
import java.util.HashMap;

public class DateTest {

	/**
	 * getting null while fetching present date. Because of time gap
	 */
	public void dateTestEx() throws InterruptedException {
		HashMap<Date, String> hm = new HashMap<Date, String>();
		Date date = new Date();
		hm.put(date, "date test");
		hm.put(new Date(date.getMonth()), "month test");
		hm.put(new Date(), "present test");
		Thread.sleep(1);		
		System.out.println(hm.get(new Date()));
		System.out.println(hm.get(date));
	}

	public static void main(String[] args) throws Exception {
		DateTest dateTest = new DateTest();
		dateTest.dateTestEx();
	}
}