package com.jp.otm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name="EMP_OTM")
	public class Employee implements Comparable<Employee> {
		
	@Id
	@Column(name="EMP_ID")
	private Long empId;
	
	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name="EMP_SAL")
	private Double empSal;
	
	
	@ManyToOne
	@JoinColumn(name="DEPT_ID") // Name of the column name which wil be created in Employe	
	private Department department; 
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Long getEmpId() {
		return empId;
	}


	public void setEmpId(Long empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}


	
	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", department Id=" + department.getDeptId()
				+ "]";
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return obj.hashCode() == this.hashCode() ;
	}


	@Override
	public int hashCode() {		
		return empId.intValue(); // Hascode will return int so we have to Typecaste it to int as empId is long
	}


	@Override
	public int compareTo(Employee o) {
		// Comparing the my obj with empID
		return (int) (this.empId-o.empId);
		//1 if first object is greater
		// -1 if first object is smaller
		// 0 if both are equal
	}
	
}