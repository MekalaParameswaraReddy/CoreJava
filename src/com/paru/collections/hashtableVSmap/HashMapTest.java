package com.paru.collections.hashtableVSmap;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class HashMapTest {
	
	public int hashCode() {
        return 11 ^ 21;
    }
	
	public void insertDuplicates() {		
		final HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "one");
		hm.put(2, "Two");
		hm.put(3, "one");
		String temp = hm.put(1, "Four");
		System.out.println(hm);
		System.out.println(temp);
	}
	public static void main(String[] args) {
		
		/*Company company = new Company("Reliance", "Refinaries", "Nifty 50");
		HashMap<Company, String> hm = new HashMap<Company, String>();
		hm.put(company, "Large Cap");
		System.out.println(hm.get(company));
		hm.put(company, "Mid Cap");
		System.out.println(hm.get(company));*/
		
		HashMapTest hashMapTest = new HashMapTest();
		//System.out.println(hashMapTest.hashCode());
		hashMapTest.insertDuplicates();		
	}	
}
