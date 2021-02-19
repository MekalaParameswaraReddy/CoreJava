package com.paru.polymorphism.overridding;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Brand {
	public void getBrand() {
		System.out.println("generic brands");
	}

	public void getBrandName(String name) {
		System.out.println(" All brands");
	}

	public List<String> getBrandList(String name) {
		List<String> l = new LinkedList<String>();
		l.add("many");
		l.add("Brands");
		return l;
	}

	public Map<Integer, String> getBrandId(String name) throws Exception {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "sony");
		map.put(2, "sony");
		map.put(3, "sony");
		map.put(4, "sony");
		map.put(5, "sony");
		map.put(6, "LG");
		map.put(7, "LG");
		map.put(8, "LG");
		map.put(9, "LG");
		map.put(10, "LG");
		return map;
	}

	void getBrandLocaionAndCode(String name, int code) {
		System.out.println("all over the world" + "1111111");
	}
	
	public float getCount() {
		return 5;
	}	
}
