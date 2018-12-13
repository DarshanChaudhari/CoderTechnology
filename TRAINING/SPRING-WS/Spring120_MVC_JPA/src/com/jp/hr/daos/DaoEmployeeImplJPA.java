package com.jp.hr.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.interfaces.DaoEmployee;


@Repository("daoEmployeeDS")
public class DaoEmployeeImplJPA implements DaoEmployee {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Employee> getEmpList() throws HrException {
		String sql = "SELECT e FROM empRec e";
		Query qry = entityManager.createQuery(sql);
		
		List<Employee> empList = qry.getResultList();
		return empList;
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		return entityManager.find(Employee.class, empId);
	}

	@Override	
	public boolean insertNewRecord(Employee emp) throws HrException {
		entityManager.persist(emp);
		Employee empNew = entityManager.find(Employee.class, emp.getEmpId());
		System.out.println(empNew);
		if(empNew != null) {
			return true;
		}else {
			return false;
		}
	}

}
