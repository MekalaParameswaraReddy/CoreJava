package com.paru.collections;

import java.util.ArrayList;

public class CollectionEx {

	public void arrayListEx() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		System.out.println(al);
		// ConcurrentModificationException
		for (Integer in : al) {
			al.remove(0);
		}
	}

	public static void main(String[] args) {
		CollectionEx collectionEx = new CollectionEx();
		collectionEx.arrayListEx();
	}
}
