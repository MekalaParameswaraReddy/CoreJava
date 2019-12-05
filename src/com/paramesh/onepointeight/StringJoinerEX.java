package com.paramesh.onepointeight;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class StringJoinerEX {
	
	public void joinWithOperator(){
		
		StringJoiner withComma = new StringJoiner(", ");
		withComma.add("one");
		withComma.add("two");
		withComma.add("three");
		withComma.add("four");
		System.out.println(withComma.toString());
		
		StringJoiner withHipen = new StringJoiner("-");
		withHipen.add("28");
		withHipen.add("Aug");
		withHipen.add("2019");		
		System.out.println(withHipen.toString());
		
		StringJoiner withSlash= new StringJoiner("/");
		withSlash.add("28");
		withSlash.add("Aug");
		withSlash.add("2019");		
		System.out.println(withSlash.toString());
		
		StringJoiner withPrefixSuffix = new StringJoiner("/", "prefix- ", " -suffix");
		withPrefixSuffix.add("28");
		withPrefixSuffix.add("Aug");
		withPrefixSuffix.add("2019");		
		System.out.println(withPrefixSuffix.toString());		
	}
	
	public void stringDotJoin() {
		String dateHipen = String.join("-", "28", "Aug", "2019");
		String dateSlash = String.join("/", "28", "Aug", "2019");
		System.out.println(dateHipen);
		System.out.println(dateSlash.toString());

		List<String> list = Arrays.asList("java", "Spring", "Ruby", "python");
		System.out.println(list);
		String orList = String.join("|", list);
		System.out.println(orList);
		String standingList = list.stream().map(x -> x).collect(Collectors.joining("|"));
		System.out.println(standingList);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringJoinerEX stringJoinerEX = new StringJoinerEX();
		//stringJoinerEX.joinWithOperator();
		stringJoinerEX.stringDotJoin();
	}

}
