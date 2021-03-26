package com.paru.oops.interfacee.interfaceinclass;

import com.paru.oops.interfacee.interfaceinclass.AnotherSuper.One;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class AnotherSuperTest implements AnotherSuper.One{
	
	@Override
	public void test() {
		System.out.println("interface inside the class + 1 ");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {		
	One obj = new AnotherSuperTest();
	obj.test();
	}
}
