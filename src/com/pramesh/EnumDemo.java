package com.pramesh;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class EnumDemo {
	public static void main(String[] args) {
		SingletonEnum singleton = SingletonEnum.INSTANCE;
		System.out.println(singleton.getValue());
		singleton.setValue(2);
		System.out.println(singleton.getValue());
		singleton.setValue(3);
		System.out.println(singleton.getValue());
		singleton.setValue(4);
		System.out.println(singleton.getValue());
	}
}
