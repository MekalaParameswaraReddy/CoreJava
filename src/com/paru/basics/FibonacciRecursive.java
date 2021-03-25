package com.paru.basics;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class FibonacciRecursive {
	
	static int n1 = 0, n2 = 1, n3 = 0;

	public static void fibonacci(int size) {
		if (size > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3 + " ");
			fibonacci(size - 1);
		}
	}

	public static void main(String[] args) {
		System.out.print(n1 + " " + n2 + " ");
		int size = 10;
		FibonacciRecursive.fibonacci(size - 2);
	}
}
