package com.jp.inheritance.tpc.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MGR_TPC")
@AttributeOverrides({
	@AttributeOverride(name="empId", column=@Column(name="EMP_ID")),
	@AttributeOverride(column=@Column(name="EMP_NAME"),name="empName"),
	@AttributeOverride(column=@Column(name="EMP_SALARY"),name="empSal")
})
public class Manager extends Employee {
	
	private Double bonus;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Manager(Long empId, String empName, Double empSal) {
//		super(empId, empName, empSal);
//		// TODO Auto-generated constructor stub
//	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public Manager(String empName, Double empSal, Double bonus) {
		super(empName, empSal);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}

	@Override
	public Double getEmpSal() {
		// TODO Auto-generated method stub
		return super.getEmpSal() + bonus;
	}
	
		
}
