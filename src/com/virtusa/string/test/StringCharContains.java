package com.virtusa.string.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class StringCharContains {

	public void comparTest(String one, String two) {
		String match = "";
		String notMatch = "";
		for (int i = 0; i < two.length(); ++i) {
			char ch = two.charAt(i);
			String stringChar = Character.toString(ch);
			if (one.contains(stringChar)) {
				match = match + stringChar;
				one = charRemoveAt(one, ch);
			} else {
				notMatch = notMatch + stringChar;
			}
		}
		System.out.println("Out put 1 == " + one);
		if (notMatch.equals("")) {
			System.out.println("Out put 2 == " + "<null>");
		} else {
			System.out.println("Out put 2 == " + notMatch);
		}
	}

	/**
	 * 
	 * @param str
	 * @param stringChar
	 * @return
	 */
	public static String charRemoveAt(String str, char stringChar) {
		int index = str.indexOf(stringChar);
		return str.substring(0, index) + str.substring(index + 1);
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter String one: ");
		String stringOne = bufferedReader.readLine();
		System.out.println("Enter String two: ");
		String stringTwo = bufferedReader.readLine();

		StringCharContains stringCharContains = new StringCharContains();
		stringCharContains.comparTest(stringOne, stringTwo);
	}
}
