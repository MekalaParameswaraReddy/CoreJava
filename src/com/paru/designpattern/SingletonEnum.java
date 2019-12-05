package com.paru.designpattern;

/**
 * 
 * Enum is thread safe and implementation of Singleton through Enum ensures that
 * your singleton will have only one instance even in a multithreaded
 * environment.
 * 
 */
public enum SingletonEnum {
	Instance;
	SingletonEnum() {
		System.out.println("object created");
	}

	public void printME() {
		System.out.println("print me");
	}

	public void releaseME() {
		System.out.println("Released!..");
	}
}
