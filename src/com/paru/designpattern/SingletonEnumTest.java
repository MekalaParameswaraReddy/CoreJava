package com.paru.designpattern;

public class SingletonEnumTest extends Thread {

	public void run() {
		SingletonEnum.Instance.printME();
	}

	/**
	 * Only one object will created, even though two threads are started at a
	 * time.
	 * 
	 */
	public static void main(String[] args) {
		SingletonEnumTest T1 = new SingletonEnumTest();
		SingletonEnumTest T2 = new SingletonEnumTest();
		T1.start();
		T2.start();
		SingletonEnum singletonEnum = SingletonEnum.Instance;
		singletonEnum.printME();
		singletonEnum.releaseME();
		SingletonEnum singletonEnum1 = SingletonEnum.Instance;
		singletonEnum1.printME();
		singletonEnum.releaseME();
		SingletonEnum singletonEnum2 = SingletonEnum.Instance;
		singletonEnum2.printME();
		singletonEnum.releaseME();
		System.out.println(singletonEnum.hashCode());
		System.out.println(singletonEnum1.hashCode());
		System.out.println(singletonEnum2.hashCode());
	}
}