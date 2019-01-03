package com.jpm.hr.daos;

import org.springframework.stereotype.Repository;

import com.jpm.hr.entities.Employee;
import com.jpm.hr.exceptions.HrException;

@Repository("hrDao")
public class HrDaoImpl implements IHrDao {


	private static final long serialVersionUID = 1L;

	@Override
	public Employee getEmpDetails(int empNo) throws HrException{
		Employee emp = new Employee(1,"aaaa",80000.0f);
		return emp;
	}

}
