package com.paru.cloning;

public class Baby implements Cloneable {

	Baby() {
		System.out.println("Baby object is created");
	}

	/**
	 * clone() is having protected access specifier in object class, while
	 * overriding we can decrease the access specifier to public.
	 */
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
