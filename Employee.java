package com.prasanna.employee.tracker;

public class Employee {
	
	private int empId;
	private String name;
	
	//private int salary;
	
	public Employee(int empId,String name) {
		super();
		this.empId = empId;
		this.name=name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
	
	
	
}
