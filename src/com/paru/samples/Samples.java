package com.paru.samples;

public class Samples {
	int i;
	static int x = 30;
	static {
		System.out.println("static block");
	}

	Samples() {
		System.out.println("default");
	}

	Samples(int i) {
		this.i = i;
	}

	public void check(Samples obj1, Samples obj2) {
		if (obj1 == obj2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		if (obj1.equals(obj2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	/**
	 * float and double will give infinity as output.
	 * 
	 * long and int will give exception.
	 */
	public void devideByZeroCheck() {
		float i = 10.00f / 0.00f;
		System.out.println(i);

		double d = 10.00d / 0.00d;
		System.out.println(d);

		double d1 = 10.00d / 0;
		System.out.println(d1);

		// long l = 12l / 0l;
		// System.out.println(l);

		// int j = 1 / 0;
		// System.out.println(j);
	}

	public void incrementTest() {
		int a = 0;
		int b = 0;
		System.out.println("a = " + (a++));
		System.out.println("b = " + (++b));
	}

	public static int method1() {
		try {
			throw new ClassNotFoundException();
			//return 1; // Unreachable code
		} catch (Exception e) {
			throw new NullPointerException();
		}
	}
}
