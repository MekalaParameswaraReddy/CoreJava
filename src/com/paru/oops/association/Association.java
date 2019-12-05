package com.paru.oops.association;

public class Association {

	/**
	 * Association between both (Bank & Emp) classes. Bank and Emp are associated
	 * through their Objects. Bank can have many employees, So it is a one-to-many
	 * relationship.
	 */
	public static void main(String[] args) {
		Emp emp = new Emp("soumesh");
		Bank bank = new Bank("Axis Bank");
		System.out.println(emp.getName() + " is an employee of " + bank.getName());
	}
}
