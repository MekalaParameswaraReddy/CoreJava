package com.paru.collections.iteratorandenumarator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

/**
 * Samples on ArrayList.
 *
 */
public class ArrayListEx {
	ArrayList<String> al = null;
	ArrayList<String> duplicat = null;
	ArrayList<String> conEx = null;
	Set<String> linkedHashSet = null;

	public void init() {
		linkedHashSet = new LinkedHashSet<String>();
		al = new ArrayList<String>();
		duplicat = new ArrayList<String>();
		al.add("one");
		al.add("one");
		al.add("two");
		al.add("Three");
		al.add("four");
		conEx = new ArrayList<String>();
		conEx.add("A");
		conEx.add("B");
		conEx.add("C");
		conEx.add("D");
	}

	/**
	 * linkedHashSet will not maintain any order. TreeSet will maintain sorting
	 * order.
	 */
	public void removingDuplicatesInArrayList() {
		System.out.println("Before removing duplicates.." + al);
		linkedHashSet.addAll(al);
		al.clear();
		al.addAll(linkedHashSet);
		System.out.println("After removing duplicates.." + al);
	}

	/**
	 * Reverse using Collection.reverse()
	 */
	public void reversingArraylist_1() {
		Collections.reverse(al);
		System.out.println("Reversing the arrayList using collection.sort" + al);
	}

	/**
	 * Reverse using for loop
	 */
	public void reversingArraylist_2() {
		System.out.print("Reversing the arrayList using for loop [ ");
		int size = al.size();
		for (int i = size - 1; i >= 0; --i) {
			System.out.print(al.get(i) + " ");
		}
		System.out.print(" ]" + "\n");
	}

	/**
	 * Reverse using ListIterator.
	 */
	public void reversingArraylist_3() {
		System.out.print("Reversing the arrayList using ListIterator [ ");
		ListIterator<String> lit = al.listIterator();
		System.out.print(" :Forward direction --> ");
		while (lit.hasNext()) {
			System.out.print(lit.next() + " ");
		}
		System.out.print(":: Backward direction <-- ");
		while (lit.hasPrevious()) {
			System.out.print(lit.previous() + " ");
		}
		System.out.println("]");
	}

	/**
	 * it.remove() won’t throw ConcurrentModificationException.
	 * 
	 * adding or deleting an element in ArrayList requires swapping.
	 */
	public void iteratorRemove() {
		System.out.println("Before iterator remove" + al);
		al.add(2, "Two.five");
		System.out.println("Before iterator remove" + al);
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String num = it.next();
			System.out.println(num);
			it.remove();
		}
		System.out.println("After iterator remove" + al);
	}

	/**
	 * ArrayList.remove() will throw ConcurrentModificationException. Because here
	 * we are modifying ArrayList structurally after iteration creation.
	 */
	public void arrayListRemoveConEx() {
		System.out.println("Before iterator remove" + conEx);
		Iterator<String> it = conEx.iterator();
		while (it.hasNext()) {
			String num = it.next();
			System.out.println(num);
			conEx.remove("A");
		}
		System.out.println("After iterator remove" + conEx);
	}

	public void storingIntoAnotherArrayList() {
		duplicat.addAll(al);
		System.out.println("Stored Into Another rArrayList " + duplicat);
	}

	public static void main(String[] args) {
		ArrayListEx arrayListEx = new ArrayListEx();
		arrayListEx.init();
		arrayListEx.storingIntoAnotherArrayList();
		arrayListEx.removingDuplicatesInArrayList();
		arrayListEx.reversingArraylist_1();
		arrayListEx.reversingArraylist_2();
		arrayListEx.reversingArraylist_3();
		arrayListEx.iteratorRemove();
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		arrayListEx.arrayListRemoveConEx();
	}
}
