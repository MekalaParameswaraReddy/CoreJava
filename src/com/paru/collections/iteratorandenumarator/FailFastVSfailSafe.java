package com.paru.collections.iteratorandenumarator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

/**
 * Enumeration is fail-safe in nature.
 * 
 * Iterator is fail-fast in nature.
 */
public class FailFastVSfailSafe {

	Vector<String> vector = new Vector<String>();
	ArrayList<String> al = new ArrayList<String>();
	Hashtable<String, String> ht = new Hashtable<String, String>();
	HashMap<String, String> hm = new HashMap<String, String>();

	public FailFastVSfailSafe() {
		setUpvector();
		setUpArrayList();
		setUpHashtable();
		setUpHashMap();
	}

	public void setUpvector() {
		vector.add("one");
		vector.add("two");
		vector.add("three");
		vector.add("four");
		vector.add("five");
	}

	public void setUpArrayList() {
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
	}

	public void setUpHashtable() {
		ht.put("A.P", "Amaravathi");
		ht.put("T.G", "Hyderabad");
		ht.put("karnataka", "Bengalore");
		ht.put("T.N", "Chennai");
	}

	public void setUpHashMap() {
		hm.put("A.P", "Amaravathi");
		hm.put("T.G", "Hyderabad");
		hm.put("karnataka", "Bengalore");
		hm.put("T.N", "Chennai");
	}

	/**
	 * Enumeration is a legacy interface used to traverse only the legacy
	 * classes like Vector, HashTable and Stack.
	 * 
	 * Where as Enumeration is fail-safe in nature. It doesn’t throw any
	 * exceptions if a collection is modified while iterating.
	 * 
	 */
	public void displayVector() throws InterruptedException {
		Enumeration<String> enu = vector.elements();
		while (enu.hasMoreElements()) {
			String number = enu.nextElement();
			System.out.println(number);
			vector.add("six");
			Thread.sleep(2000);
		}
	}

	/**
	 * Iterator is advanced interface, which is used to traverse most of the
	 * classes in the collection framework. For example, ArrayList, LinkedList,
	 * HashSet, LinkedHashSet, TreeSet, HashMap, LinkedHashMap, TreeMap etc.
	 * 
	 * Iterator is a fail-fast in nature. i.e it throws
	 * ConcurrentModificationException if a collection is modified while
	 * iterating other than it’s own remove() method.
	 * 
	 * As Iterator is fail-fast in nature and doesn’t allow modification of a
	 * collection by other threads while iterating, it is considered as safe and
	 * secure than Enumeration.
	 */
	public void displayArrayList() {
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String number = it.next();
			System.out.println(number);
			al.add("six");
		}
	}

	public void enumeratorHashTable() {
		Enumeration<String> enu = ht.elements();
		while (enu.hasMoreElements()) {
			String capital = enu.nextElement();
			System.out.println(capital);
			ht.put("Maharastra", "Mumbai");
		}
	}

	/**
	 * HashTable won't allow any manipulations while iterating, if does it will
	 * throw 'ConcurrentModificationException'
	 */
	public void iteratorHashTable() {
		Set<String> set = ht.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String state = iterator.next();
			String capital = ht.get(state);
			System.out.println(state + " = " + capital);
			ht.put("Maharastra", "Mumbai");
		}
	}

	/**
	 * Hashmap won't allow any manipulations while iterating, if does it will
	 * throw 'ConcurrentModificationException'
	 */
	public void iteratorHashMap() {
		Set<String> set = hm.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String state = iterator.next();
			String capital = hm.get(state);
			System.out.println(state + " = " + capital);
			hm.put("Maharastra", "Mumbai");
		}
	}

	/**
	 * Hashmap doesn't have elements() method
	 */
	public void enumeratorHashMap() {

	}

	public static void main(String[] args) throws InterruptedException {
		FailFastVSfailSafe failFast = new FailFastVSfailSafe();
		failFast.displayVector();
		// failFast.displayArrayList();
		failFast.enumeratorHashTable();
		// failFast.iteratorHashTable();
		// failFast.iteratorHashMap();
	}
}
