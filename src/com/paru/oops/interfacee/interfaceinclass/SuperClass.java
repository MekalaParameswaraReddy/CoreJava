package com.paru.oops.interfacee.interfaceinclass;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class SuperClass {
	
	interface myInterface {
		public void test();
	}

	class Inner implements myInterface {

		@Override
		public void test() {
			System.out.println("interface inside the class");
		}
	}

	public static void main(String[] args) {
		Inner obj = new SuperClass().new Inner();
		obj.test();
	}
}
