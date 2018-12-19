package com.jp.hr.daos;

import java.util.ArrayList;
import java.util.List;


import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

//@Repository("daoDS")
public class DaoEmployeeImplJPA implements DaoEmployee {

	//@PersistenceContext
	//private EntityManager entityManager;
	
	@Override
	public List<Employee> getEmpList() throws HrException {
		String sql = "SELECT e FROM empRec e";
		//Query qry = entityManager.createQuery(sql);
		
		//List<Employee> empList = qry.getResultList();
		//return empList;
		return null;
	}
	
	@Override
	public Employee getEmpDetails(int empId) throws HrException {
	
		//Employee emp =entityManager.find(Employee.class, empId);
		return null;
	}

	@Override
	//@Transactional(propagation=Propagation.REQUIRED)
	public boolean insertNewRecord(Employee emp) throws HrException {
		/*System.out.println(emp);
		entityManager.persist(emp);*/
		return true;
	}

}
