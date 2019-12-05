package com.paru.collections.hashcodeandequals;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * If two objects are same then they must return same value in hashcode() and
 * equals() method whenever invoked.
 * 
 * If two objects are having same values, we are trying to put them in HashMap
 * or HashSet or Hashtable the old object is replaced with new object, if we
 * override the hashcode() and equals() method.
 * 
 * the above point is not true, if we have not overridden the 1) both hashcode()
 * and equals() 2) either equals() or hashcode() method in pojo class. In this
 * case both objects will store in Hash classes (HashMap, HashSet, Hashtable).
 * 
 */
public class HashCodeEqualsTest {
	// HashMap, HashSet, and Hashtable
	public void hashcodeEqualsOverriddenForHashclasses() {
		HashMap<Item, String> hm = new HashMap<Item, String>();
		hm.put(new Item(101, "Pen"), "one");
		hm.put(new Item(101, "Pen"), "two");
		for (Item item : hm.keySet()) {
			System.out.println(hm.get(item).toString() + " ");
		}
	}

	public void hashcodeEqualsOverriddenForList() {
		ArrayList<Item> al = new ArrayList<Item>();
		Item one = new Item(101, "Pen");
		Item two = new Item(101, "Pen");
		al.add(one);
		al.add(two);
		for (Item item : al) {
			System.out.print(item.id + " ");
			System.out.println(item.name);
		}
	}

	public void hashcodeEqualsNotOverriddenForHashclasses() {
		HashMap<Product, String> hm = new HashMap<Product, String>();
		hm.put(new Product(101, "Pen"), "one");
		hm.put(new Product(101, "Pen"), "two");
		for (Product product : hm.keySet()) {
			System.out.println(hm.get(product).toString() + " ");
		}
	}

	public void hashcodeEqualsNotOverriddenForList() {
		ArrayList<Product> al = new ArrayList<Product>();
		Product one = new Product(101, "Pen");
		Product two = new Product(101, "Pen");
		al.add(one);
		al.add(two);
		for (Product product : al) {
			System.out.print(product.id + " ");
			System.out.println(product.name);
		}
	}

	public static void main(String[] args) {
		HashCodeEqualsTest listTest = new HashCodeEqualsTest();
		System.out.println("List testing......");
		listTest.hashcodeEqualsOverriddenForList();
		System.out.println("HashMap testing......");
		listTest.hashcodeEqualsOverriddenForHashclasses();

		System.out.println("******************************");

		System.out.println("List testing......");
		listTest.hashcodeEqualsNotOverriddenForList();
		System.out.println("HashMap testing......");
		listTest.hashcodeEqualsNotOverriddenForHashclasses();
	}
}
