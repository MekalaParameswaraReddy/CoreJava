package com.paru.collections.set;

public class Employee implements Comparable<Employee> {
	private String name;
	private int id;

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Employee emp) {
		if (this.id == emp.getId()) {
			return 0;
		} else if (this.id < emp.getId()) {
			return -1;
		}
		return 1;
	}
}
