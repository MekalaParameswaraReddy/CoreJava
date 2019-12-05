package com.paru.collections.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * In this class Arraylist can accept any data type as input. 
 */
public class AllNumberTest {

	public static void main(String[] args) {
		AllNumber<Integer> int_1 = new AllNumber<Integer>(10);
		AllNumber<Float> float_1 = new AllNumber<Float>(10.12f);
		AllNumber<Long> long_1 = new AllNumber<Long>(10000l);
		AllNumber<Double> double_1 = new AllNumber<Double>(10.1);
		AllNumber<String> string_1 = new AllNumber<String>("10 String");
		ArrayList<AllNumber<?>> al = new ArrayList<AllNumber<?>>();
		al.add(int_1);
		al.add(float_1);
		al.add(long_1);
		al.add(double_1);
		al.add(string_1);
		System.out.println(al);
		Iterator<AllNumber<?>> it = al.iterator();
		while (it.hasNext()) {
			AllNumber<?> number = it.next();
			number.getNumber();
			System.out.println(number.getNumber() + " ");
		}
	}
}
