package com.paru.collections.hashtableVSmap;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableVSMapTest {

	Hashtable<String, String> hashtable = null;
	HashMap<String, String> hashMap = null;

	public void init() {
		hashtable = new Hashtable<String, String>();
		hashMap = new HashMap<String, String>();
	}

	/**
	 * Multi thread Synchronization.
	 * 
	 * Legacy class.
	 * 
	 * Does not allow null key or null values.
	 * 
	 * Traversing: Both Iterator and Enumerator
	 */
	public void testHashTable() {
		// hashtable.put("Printer", null); // Runtime exception
		// hashtable.put(null, null); // Runtime exception
		hashtable.put("No null key ", " No null Values");
		System.out.println(hashtable);
		Enumeration<String> keys = hashtable.keys();
		Iterator<String> it_keys = hashtable.keySet().iterator();
	}

	/**
	 * Not Synchronization.
	 * 
	 * Non legacy class
	 * 
	 * Allow one null key and many null values
	 * 
	 * Traversing: only Iterator, No Enumerator
	 * 
	 * we can make unsynchronized map to synchronized using
	 * Collections.synchronizedMap(Map<String, String> m)
	 */
	public void testHashMap() {
		hashMap.put("Cable", "ACE");
		hashMap.put(null, null);
		hashMap.put(null, null);// Overridden
		hashMap.put("Glass", null);
		hashMap.put("Cover", null);
		hashMap.put("Tamper", null);
		hashMap.put("Tamper", "Local comp.");
		System.out.println(hashMap);
		Iterator<String> it_keys = hashMap.keySet().iterator();
		Map<String, String> m = Collections.synchronizedMap(hashMap);
	}

	public static void main(String[] args) {
		HashTableVSMapTest hashTableVSMapTest = new HashTableVSMapTest();
		hashTableVSMapTest.init();
		hashTableVSMapTest.testHashMap();
		hashTableVSMapTest.testHashTable();
	}
}
