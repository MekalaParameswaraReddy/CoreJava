package com.paru.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set is an unordered collection, it doesn’t maintain any order.
 * 
 * Set doesn’t allow duplicate elements.
 * 
 * Set can have only a single null value at most in HashSet, LinkedHashSet .
 * 
 * Set doesn’t allow even single null in TreeSet.
 */
public class SetEx {
	Set<String> treeSet = null;
	Set<String> hashSet = null;
	Set<String> linkedHashSet = null;

	public void init() {
		treeSet = new TreeSet<String>();
		hashSet = new HashSet<String>();
		linkedHashSet = new LinkedHashSet<String>();
		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("three");
		treeSet.add("two");
		treeSet.add("null");
		treeSet.add("");
	}

	public void testHashSet() {
		hashSet.add("one");
		hashSet.add(null);
		hashSet.add("two");
		hashSet.add(null);
		hashSet.add("three");
		System.out.println(" hashSet :: " + hashSet);
	}

	public void testLinkedHashSet() {
		linkedHashSet.add("one");
		linkedHashSet.add(null);
		linkedHashSet.add("two");
		linkedHashSet.add(null);
		linkedHashSet.add("three");
		System.out.println(" linkedHashSet :: " + linkedHashSet);
	}

	/**
	 * No Compile time error. Runtime exception... java.lang.ClassCastException:
	 * java.lang.String cannot be cast to java.lang.Integer
	 * 
	 * tset object is created, String values is stored in it. then we have added
	 * integer value. while adding it self we will get exception, because
	 * Incompatible objects are never sort so we got exception.
	 * 
	 * tset object won't add integer objects.
	 */
	public void testTreeSet1() {
		TreeSet tset = new TreeSet();
		tset.add("one");
		tset.add(1);
		tset.add(2);
		System.out.println("TreeSet size " + tset.size());
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("TreeSet" + tset);
	}

	/**
	 * No Compile time error. Runtime exception... java.lang.ClassCastException:
	 * java.lang.String cannot be cast to java.lang.Integer
	 * 
	 * tset object is created, Integer values is stored in it. then we have added
	 * String value. it is trying to sort. Incompatible objects are never sort so we
	 * got exception, while adding 'tset.add(1)'
	 */
	public void testTreeSet2() {
		TreeSet tset = new TreeSet();
		tset.add("one");
		tset.add(1);
		tset.add(2);
		System.out.println("TreeSet" + tset);
	}

	public void display() {
		System.out.println(treeSet);
		treeSet.add("three");
		System.out.println(treeSet);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String a = null;
		treeSet.add(a);
		// System.out.println(treeSet);
	}

	/**
	 * TreeSet as first element null is allowed but this rule is applicable till
	 * 1.6v only. 1.7v onwards null is not allowed even as the first element.
	 * 
	 * we will get java.lang.NullPointerException.
	 */
	public void firstElement() {
		TreeSet nullSet = new TreeSet();
		nullSet.add(null);
		System.out.println(nullSet.size());
		System.out.println(nullSet);
	}

	public static void main(String[] args) {
		SetEx setEx = new SetEx();
		// setEx.init();
		setEx.testHashSet();
		setEx.testLinkedHashSet();
		setEx.display();
		//setEx.testTreeSet1(); // Run time exception
		//setEx.firstElement(); // Run time exception
	}
}
