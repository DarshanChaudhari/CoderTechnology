package com.jp.inheritance.st.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="SMGR")
public class SalesManager extends Manager {
	
	private Double comm;

	public SalesManager(String empName, Double empSal, Double bonus, Double comm) {
		super(empName, empSal, bonus);
		this.comm = comm;
	}

	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getComm() {
		return comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	@Override
	public String toString() {
		return "SalesManager [comm=" + comm + ", getComm()=" + getComm() + ", getBonus()=" + getBonus()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public Double getBonus() {
		// TODO Auto-generated method stub
		return super.getBonus();
	}

	@Override
	public Double getEmpSal() {
		// TODO Auto-generated method stub
		return super.getEmpSal() + comm;
	}


	
		

}
