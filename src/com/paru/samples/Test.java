package com.paru.samples;

public class Test {

	public static void main(String[] args) {
		System.out.println(Samples.x);
		Samples obj1 = new Samples(2);
		Samples obj2 = new Samples(2);
		Samples check = new Samples();
		check.check(obj1, obj2);
		check.devideByZeroCheck();
		check.incrementTest();
		Samples.method1();		
	}
}
