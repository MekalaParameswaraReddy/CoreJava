package com.paru.collections.generic.employee;

import java.util.ArrayList;

/**
 * EmployeeType is allowing only Employee object & it's sub class.
 * 
 * Same time EmployeeType not allowing other than Employee object & it's sub
 * class. per & dr object are not allowed, Compile time error.
 */
public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp);
		TeamLead tl = new TeamLead();
		Developer dev = new Developer();
		Employee emp1 = new TeamLead();
		emp1.getStatus();
		Person per = new Person();
		Doctor dr = new Doctor();
		EmployeeType<Employee> empType1 = new EmployeeType<Employee>();
		empType1.setEmployee(emp);
		EmployeeType<Employee> empType2 = new EmployeeType<Employee>();
		empType2.setEmployee(dev);
		EmployeeType<Employee> empType3 = new EmployeeType<Employee>();
		empType3.setEmployee(tl);
		EmployeeType empType4 = new EmployeeType();
		//empType4.setEmployee(per);
		EmployeeType empType5 = new EmployeeType();
		// empType5.setEmployee(dr);
		ArrayList<EmployeeType<? extends Employee>> al = new ArrayList<EmployeeType<? extends Employee>>();
		al.add(empType1);
		al.add(empType2);
		al.add(empType3);
	}
}
