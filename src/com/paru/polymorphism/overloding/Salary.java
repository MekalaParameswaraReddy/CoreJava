package com.paru.polymorphism.overloding;

/**
 * How user know which method from Salary class will give 'Manager salary'. why
 * can't we create method like 'getManagerSalary(-,-,-)' will it be more
 * convenient from overloaded method 'getSalary(-,-,-)' ?
 *
 */
public class Salary {
	public int getSalary(String dep) {
		System.out.println("Developer Salary");
		return 10;
	}

	public int getSalary(String dep, String des) {
		System.out.println("TL Salary");
		return 100;
	}

	public int getSalary(String dep, String des, String proj) {
		System.out.println("Manager Salary");
		return 1000;
	}

	public int getSalary(String dep, String des, String proj, String delivary) {
		System.out.println("BU head Salary");
		return 10000;
	}
}
