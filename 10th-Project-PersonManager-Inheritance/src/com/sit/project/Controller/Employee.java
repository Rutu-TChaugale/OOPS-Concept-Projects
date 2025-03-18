package com.sit.project.Controller;

public class Employee extends Person {

	int empID;

	public Employee(String n, int a, String g, int eid ) {
		super(n, a, g);
		this.empID = eid;
	}

	public int getEmpID() {
		return empID;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
