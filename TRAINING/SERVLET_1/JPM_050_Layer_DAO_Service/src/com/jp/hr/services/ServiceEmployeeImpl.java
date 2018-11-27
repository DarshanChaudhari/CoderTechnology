package com.jp.hr.services;

import java.util.ArrayList;

import com.jp.hr.daos.DaoEmployee;
import com.jp.hr.daos.DaoEmployeeImpl;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

// One layer refers to another layer through interface only.
// Implementation of the business rule should be done here in absence of BL layer.
// This layer will also ensures only custom exception to come out


public class ServiceEmployeeImpl implements ServiceEmployee {	
	
	private DaoEmployee daoEmp; // Here you have to create the reference of DAO Class and create a object of Implemented class.
	
	// Resolving Dependency.
	public ServiceEmployeeImpl() {		
		daoEmp = new DaoEmployeeImpl(); // As you have to create the reference of DAO Class and create a object of Implemented class.
	
	}

	@Override
	public ArrayList<Employee> getEmpList() throws HrException {

		return daoEmp.getEmpList();
	}

}
