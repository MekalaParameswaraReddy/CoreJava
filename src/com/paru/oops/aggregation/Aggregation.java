package com.paru.oops.aggregation;

import java.util.ArrayList;
import java.util.List;

/**
 * College have no. of departments like CSE, IT. Every department has no. of
 * students. So, we make a College class which has a reference to no. of Objects
 * (i.e. List of Objects) of the Department class. That means College class is
 * associated with Department class through its Object(s). And Department class
 * has also a reference to Objects (i.e. List of Objects) of Student class means
 * it is associated with Student class through its Object(s).
 *
 * It is a unidirectional association i.e. a one way relationship
 * 
 * College --> Department --> Student.
 */
public class Aggregation {

	public static void main(String[] args) {

		Student student1 = new Student("101", "Rani", "CSE");
		Student student2 = new Student("102", "Ravi", "CSE");

		Student student3 = new Student("103", "Raju", "IT");
		Student student4 = new Student("104", "Ranga", "IT");

		List<Student> cseList = new ArrayList<Student>();
		cseList.add(student1);
		cseList.add(student2);

		List<Student> itList = new ArrayList<Student>();
		itList.add(student3);
		itList.add(student4);

		Department cseDept = new Department("CSE", cseList);
		Department itDept = new Department("IT", itList);

		List<Department> department = new ArrayList<Department>();
		department.add(cseDept);
		department.add(itDept);
		College college = new College("G.V.R & S", department);
		int noOfStudents = college.getTotalStudentsInCollege();
		System.out.println(college.getName() + " college Contains " + noOfStudents + " students ");
	}

}
