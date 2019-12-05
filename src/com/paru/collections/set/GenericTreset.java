package com.paru.collections.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * If we want store any class <Employee> object in TreeSet we need to implement
 * that class from Comparable<Employee> interface and override 'public int
 * compareTo(Employee emp)' method. otherwise we will get class
 * ClassCastException: even for single object.
 * 
 * Do observe while adding Company class object we got ClassCastException: even
 * for one object.
 * 
 * String and other generic class are implemented from Comparable<Employee>
 * interface and overridden 'public int compareTo(Employee emp)' method. so that
 * we are able to store String or numbers in TreeSet.
 * 
 * Company class have not implemented Comparable<Company> so we got the
 * java.lang.ClassCastException
 */
public class GenericTreset {

	public static void main(String[] args) {
		Employee e1 = new Employee("raja", 1);
		Employee e2 = new Employee("Rani", 2);
		Employee e3 = new Employee("Ramu", 3);
		Set<Employee> set = new TreeSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		for (Employee emp : set) {
			System.out.println(emp.getId() + " ==  " + emp.getName());
		}

		Company company1 = new Company("CTS");
		Set<Company> comSet = new TreeSet<Company>();
		comSet.add(company1);

	}

}
