package com.paru.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class HandlingConcurentModifications {

	CopyOnWriteArrayList<String> cwal = new CopyOnWriteArrayList<String>();
	ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();

	HandlingConcurentModifications() {
		setUpArrayList();
		setUpConcurrentHashMap();
	}

	public void setUpArrayList() {
		cwal.add("one");
		cwal.add("two");
		cwal.add("three");
		cwal.add("four");
		cwal.add("five");
	}

	public void displayArrayList() {
		Iterator<String> it = cwal.iterator();
		while (it.hasNext()) {
			String number = it.next();
			System.out.println(number);
			cwal.add("six");
		}
	}

	public void setUpConcurrentHashMap() {
		map.put("A.P", "Amaravathi");
		map.put("T.G", "Hyderabad");
		map.put("karnataka", "Bengalore");
		map.put("T.N", "Chennai");
	}

	public void iteratorConcurrentHashMap() {
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String state = iterator.next();
			String capital = map.get(state);
			System.out.println(state + " = " + capital);
			map.put("Maharastra", "Mumbai");
		}
	}

	public static void main(String[] args) {
		HandlingConcurentModifications hcm = new HandlingConcurentModifications();
		hcm.displayArrayList();
		hcm.iteratorConcurrentHashMap();
	}
}
