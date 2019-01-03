package com.jpm.hr.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.jpm.hr.entities.Employee;
import com.jpm.hr.exceptions.HrException;

@Repository("hrDao")
public class HrDaoImpl implements IHrDao {


	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Employee getEmpDetails(int empNo) throws HrException{
		Employee emp = manager.find(Employee.class, empNo);
		return emp;
	}

}
