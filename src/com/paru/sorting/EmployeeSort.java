package com.paru.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee(10, "glex", "sangalore");
		list.add(e1);
		list.add(new Employee(105, "joy rain", "bangalore"));
		list.add(new Employee(105, "glex", "bangalore"));
		list.add(new Employee(105, "bob", "sidny"));
		list.add(new Employee(105, "cot bed", "sidny"));
		list.add(new Employee(103, "camaroon", "hyd"));
		list.add(new Employee(101, "delta", "california"));
		list.add(new Employee(106, "bob", "sidny"));

		System.out.println("***** Before Sorting *********");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		System.out.println("***** IdAndNameSort Sorting *********");
		Collections.sort(list, new IdAndNameSort());		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		System.out.println("***** Sorting based on id *********");
		Collections.sort(list, new IdSort());
		for (Employee employee : list) {
			System.out.println(employee);
		}

		System.out.println("***** Sorting based on address *********");
		Collections.sort(list, new AddressSort());
		for (Employee employee : list) {
			System.out.println(employee);
		}

		System.out.println("***** Sorting based on Name *********");
		Collections.sort(list, new NameSort());
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
	}
}
