package com.paru.polymorphism.overridding;

import java.util.List;
import java.util.Map;

public class OverRiddingTest {

	public static void main(String[] args) {
		Sony sony = new Sony();
		sony.getBrand();
		Brand brand = new Brand();
		brand.getBrand();
		Brand brand1 = new Sony();
		brand1.getBrand();
		System.out.println();
		//brand1.subclassOwnmethod();  //The method subclassOwnmethod() is undefined for the type Brand
		((Sony)brand1).getBrand();
		// Sony sony1 = new Brand(); //Type mismatch: cannot convert from Brand to Sony
		//Sony sony1 = (Sony)new Brand(); //ClassCastException:
		//System.out.println(sony1);
		Brand brand2 = new Sony();
		brand2.getBrandName("Sony");
		Brand brand3 = new Sony();
		List<String> al = brand3.getBrandList("Sony");
		System.out.println(al);
		Brand expEx = new Sony();
		Map<Integer, String> map;
		try {
			map = expEx.getBrandId("Sony");
			System.out.println(map);
		} catch (Exception e) {		
			e.printStackTrace();
		}		
		Brand accessSpecfires = new Sony();
		accessSpecfires.getBrandLocaionAndCode("inida", 91);		
	}
}