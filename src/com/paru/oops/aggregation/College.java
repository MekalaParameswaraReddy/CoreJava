package com.paru.oops.aggregation;

import java.util.List;

public class College {

	private String name;
	private List<Department> department;

	public College(String name, List<Department> department) {
		super();
		this.name = name;
		this.department = department;
	}

	public int getTotalStudentsInCollege() {
		int number = 0;
		List<Student> students;
		for (Department dept : department) {
			students = dept.getStudents();
			for (Student stu : students) {
				number++;
			}
		}
		return number;
	}

	public String getName() {
		return name;
	}

}
