package com.paru.oops.aggregation;

import java.util.List;

public class Department {
	private String name;
	private List<Student> student;

	public Department(String name, List<Student> student) {
		super();
		this.name = name;
		this.student = student;
	}

	public List<Student> getStudents() {
		return student;
	}
}
