package com.jp.hr.entities;

public class Employee {
	private Long empId;
	private String firstName;
	private String lastName;
	
	
	public Employee(Long empId, String firstName, String lastName) {		
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee() {
		
	}

	public Long getEmpId() {   // Property name :empId
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstName() { // Property name : firstName
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {  // Property name : lastName
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", LastName=" + lastName + "]";
	}

	
	
	
}
