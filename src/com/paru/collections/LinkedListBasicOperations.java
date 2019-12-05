package com.paru.collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * LinkedList requires more memory because it will maintains the nodes, maintain
 * insertion order.
 * 
 * Good for more insertion and deletion (no swapping are required).
 * 
 * Not good for search operations.
 *
 */
public class LinkedListBasicOperations {
	LinkedList<String> basic = null;

	public void init() {
		basic = new LinkedList<String>();
		basic.add("one");
		basic.add("two");
		basic.add("three");
		basic.add("four");
	}

	public void adding() {
		basic.addFirst("zero");
		basic.addLast("five");
		basic.add(2, "two.five");
	}

	/**
	 * remove() -- Retrieves and removes the head (first element) of this list
	 */
	public void delete() {
		basic.removeFirst();
		basic.removeLast();
		basic.remove(1);
		basic.remove();
	}

	public void disply() {
		Iterator<String> it = basic.iterator();
		while (it.hasNext()) {
			String num = it.next();
			System.out.print(num + " ");
		}
		System.out.println();
	}

	/**
	 * pop() retrieve & removes first element where as, peek retrieve the first
	 * element
	 */
	public void Push_Pop() {
		basic.push("Push number");
		System.out.println("After push :: - " + basic);
		basic.pop();
		System.out.println("After pop :: - " + basic);
	}

	public static void main(String[] args) {
		LinkedListBasicOperations op = new LinkedListBasicOperations();
		op.init();
		op.disply();
		op.adding();
		op.disply();
		op.delete();
		op.disply();
		op.Push_Pop();
	}
}
