package com.paru.sorting;

import java.util.Comparator;

public class NameSort implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getName().compareTo(emp2.getName());
	}
}
