package com.paru.collections.hashtableVSmap;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class HashMapTest {
	
	public int hashCode() {
        return 11 ^ 21;
    }
	
	public static void main(String[] args) {
		
		/*Company company = new Company("Reliance", "Refinaries", "Nifty 50");
		HashMap<Company, String> hm = new HashMap<Company, String>();
		hm.put(company, "Large Cap");
		//System.out.println(hm.get(company));
		hm.put(company, "Mid Cap");
		System.out.println(hm.get(company));*/
		
		HashMapTest hashMapTest = new HashMapTest();
		System.out.println(hashMapTest.hashCode());
		
		
	}
	
}
