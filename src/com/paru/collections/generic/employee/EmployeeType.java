package com.paru.collections.generic.employee;

/**
 * This class will allow Employee and its child class objects.
 *
 * @param <T> indicates child's of Employee.
 */
public class EmployeeType<T extends Employee> {
	Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeType [employee=" + employee + "]";
	}
}
