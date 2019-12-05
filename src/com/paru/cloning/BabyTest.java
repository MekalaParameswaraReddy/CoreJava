package com.paru.cloning;

/**
 * While cloning the object constructor won't be executed. but hascode is
 * different for both original object and cloned object.
 */
public class BabyTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Baby originalBaby = new Baby();
		System.out.println(originalBaby.hashCode());
		Baby cloneBaby = (Baby) originalBaby.clone();
		System.out.println(cloneBaby.hashCode());
	}

}
