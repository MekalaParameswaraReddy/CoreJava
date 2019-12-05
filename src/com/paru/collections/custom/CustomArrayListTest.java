package com.paru.collections.custom;

public class CustomArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomArrayList cal = new CustomArrayList();
		cal.add(new Integer(10));
		cal.add(new Integer(20));
		cal.add(new Integer(30));
		cal.add("I am paramesh");
		cal.add(new Integer(50));
		cal.add(new Integer(60));
		cal.add(new Integer(70));
		cal.add(new Integer(80));
		System.out.println("size " + cal.size());
		System.out.println("Length " + cal.length());
		cal.print();
		cal.remove(6);
		System.out.println("size " + cal.size());
		System.out.println("first element " + cal.get(0));
		System.out.println("second element " + cal.get(1));
		System.out.println("third element " + cal.get(2));
		System.out.println("fourth element " + cal.get(3));
		System.out.println("fifth element " + cal.get(4));
		System.out.println("sixth element " + cal.get(5));
		System.out.println("seventh element " + cal.get(6));
		// System.out.println("eightth element " + cal.get(7));
		cal.print();
	}
}
