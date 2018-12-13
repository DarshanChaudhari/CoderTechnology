package com.jp.hr.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="deptRecord")
@Table(name="DEPT")
public class Dept implements Serializable {

	private static final long serialVersionUID = 1L;
	private int deptNo;
	private String deptNm;
	
	// Field for Association
	Set<Emp> empList;
	
	@Id
	@Column(name="DEPT_NO")
	public int getDeptNo() {
		return deptNo;
	}
	
	
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	
	@Column(name="DNAME")
	public String getDeptNm() {
		return deptNm;
	}
	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}
	
	/* As this is One to Many Relationship becuase one department have many Employee
	*  mappedBy ="dept" --> this is because the property dept is mapped with DEPT_NO
	*  which is foreign key. IT will go to dept method and in that dept method it will 
	*  check the column name and then select * from where deptno = 10 whatever
	*  You have to give method name where foreing key column is defined		*/
	@OneToMany(mappedBy="dept" , fetch=FetchType.EAGER) 
	public Set<Emp> getEmpList() {
		return empList;
	}


	public void setEmpList(Set<Emp> empList) {
		this.empList = empList;
	}


	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", deptNm=" + deptNm + "]";
	}
	
	

}
