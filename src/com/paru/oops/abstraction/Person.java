package com.paru.oops.abstraction;

public class Person {
	/*
	 * A Person have many properties.
	 */
	private int id;
	private String name;
	private String address;

	private float height;
	private float weight;
	private int age;
	private String bloodGroup;

	private String qualification;
	private int exp;

	private String faviourateFood;
	private String drink;

	/**
	 * A doctor sees (abstracts) the person as patient.
	 * 
	 * The doctor is interested in id, name, address, height, weight, age, blood
	 * group.
	 * 
	 * Doctor don't want employer details (here abstracting employer details)
	 */
	public void helthTest() {
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("address : " + address);

		System.out.println("height : " + height);
		System.out.println("weight : " + weight);
		System.out.println("age : " + age);
		System.out.println("bloodGroup : " + bloodGroup);
	}

	public void employerTest() {
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("address : " + address);

		System.out.println("age : " + age);
		System.out.println("bloodGroup : " + bloodGroup);

		System.out.println("qualification : " + qualification);
		System.out.println("exp : " + exp);
	}

	public void hotelServerTest() {
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("address : " + address);

		System.out.println("faviourateFood : " + faviourateFood);
		System.out.println("drink : " + drink);
	}
}
