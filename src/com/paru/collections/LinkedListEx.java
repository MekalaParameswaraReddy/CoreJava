package com.paru.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

/**
 * In this class main linked list having four linked lists each of them are
 * having different elements. we have sorted all of them.
 */
public class LinkedListEx {
	LinkedList<LinkedList<Integer>> ll;
	LinkedList<Integer> l1;
	LinkedList<Integer> l2;
	LinkedList<Integer> l3;
	LinkedList<Integer> l4;
	Set<Integer> set;

	public void setUp() {
		set = new TreeSet<Integer>();
		ll = new LinkedList<LinkedList<Integer>>();
		l1 = new LinkedList<Integer>();
		l1.add(5);
		l1.add(7);
		l1.add(8);
		l1.add(30);
		l2 = new LinkedList<Integer>();
		l2.add(10);
		l2.add(20);
		l3 = new LinkedList<Integer>();
		l3.add(19);
		l3.add(22);
		l3.add(50);
		l4 = new LinkedList<Integer>();
		l4.add(28);
		l4.add(35);
		l4.add(40);
		l4.add(45);
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);
		ll.add(l4);
	}

	/**
	 * Iterating linked list and iteration each inner linked list and storing in
	 * tree set for sorting order.
	 */
	public void sortingLinkedList() {
		Iterator<LinkedList<Integer>> it_out = ll.iterator();
		while (it_out.hasNext()) {
			LinkedList<Integer> next_list = it_out.next();
			Iterator<Integer> it_in = next_list.iterator();
			while (it_in.hasNext()) {
				Integer value = it_in.next();
				set.add(value);
			}
		}
	}

	/**
	 * Displaying elements which are already sorted in tree set.
	 */
	public void display() {
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer value = it.next();
			System.out.print(value + "->");
		}
	}

	public static void main(String[] args) {
		LinkedListEx llex = new LinkedListEx();
		llex.setUp();
		llex.sortingLinkedList();
		llex.display();
		System.out.println("done");
	}
}
