package com.paru.sorting;

import java.util.Comparator;

public class IdSort implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp2.getId() - emp1.getId();
	}
}
