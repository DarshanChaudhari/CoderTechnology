package com.jp.hr.entities;

public class Employee {
	private int empId;
	private String firstName;
	private String LastName;
	
	
	public Employee(int empId, String firstName, String lastName) {		
		this.empId = empId;
		this.firstName = firstName;
		this.LastName = lastName;
	}

	public Employee() {
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", LastName=" + LastName + "]";
	}

	
	
	
}