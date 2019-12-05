package com.paru.polymorphism.overridding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

public class Sony extends Brand {
	/**
	 * Plain overriding.
	 */
	public void getBrand() {
		System.out.println("All are sony products.");
	}

	/**
	 * No. of parameters and order of parameters must be same.
	 */
	public void getBrandName(String name) {
		System.out.println(name + " brands");
	}

	/**
	 * Co-variant return type. (Overridden method return type can be changed.
	 * 
	 * Sub class method return type can be 'ArrayList' even super class method
	 * return type have 'List'
	 */
	public ArrayList<String> getBrandList(String name) {
		ArrayList<String> al = new ArrayList<String>();
		al.add(name);
		al.add("have");
		al.add("many");
		al.add("items");
		return al;
	}
	/**
     * Sup ==> NoExp ==> Exception ==> Exception
     *         ||          ||            ||
     * Sub ==> NoExp ==> Exception ==> IOException (sub class of Exception)
     *
     * 'IOException' in super class method and 'Exception' in sub class == compile
     * time error.
     */
	
	public Hashtable<Integer, String> getBrandId(String name)
			throws IOException {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(1, "sony");
		table.put(2, "sony");
		table.put(3, "sony");
		table.put(4, "sony");
		return table;
	}
	 /**
     * Sup ==> public ==> protected         ==> default
     *          ||            ||                  ||
     * Sub ==> public ==> public, protected ==> public, protected, default
     *
     * Sup ==> private, These method can not be access to out side..
     */
	protected void getBrandLocaionAndCode(String name, int code) {
		System.out.println(name + " is the headquarter for sony"
				+ ":: it's code is + " + code);
	}
	public float getCount() {
		return 5;
	}	
}
