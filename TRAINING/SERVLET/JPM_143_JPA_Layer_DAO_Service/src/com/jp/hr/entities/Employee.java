package com.jp.hr.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="emp_master")
public class Employee {
	
	@Id //Primary key
	//@GeneratedValue(strategy=GenerationType.TABLE)
	@SequenceGenerator(name="EMP_GEN" ,sequenceName="emp_master_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMP_GEN")
	private int empId;
	private String firstName;
	private String lastName;
	
	
	public Employee(int empId, String firstName, String lastName) {		
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee() {
		
	}

	

	public int getEmpId() {   // Property name :empId
		return empId;
	}

	public void setEmpId(int empId) {
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
