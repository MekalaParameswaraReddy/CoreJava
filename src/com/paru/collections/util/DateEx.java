package com.paru.collections.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class DateEx {

	public void CovertLongToDate(long currentDateTime) {		
		System.out.println(currentDateTime);
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(currentDateTime);
		Date d = cal.getTime();
		//System.out.println(d);
		DateFormat df = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss:SSS");
		System.out.println("Milliseconds to Date: " + df.format(d));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long currentDateTime = System.currentTimeMillis();
		DateEx ex = new DateEx();
		//long l = 1573594492654291l;
		ex.CovertLongToDate(currentDateTime);
	}

}
