package com.paru.sorting;

import java.util.Comparator;

public class AddressSort implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getAddress().compareTo(emp2.getAddress());
	}
}