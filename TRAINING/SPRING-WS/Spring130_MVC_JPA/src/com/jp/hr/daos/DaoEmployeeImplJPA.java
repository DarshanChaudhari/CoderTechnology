package com.jp.hr.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.jp.hr.entities.Dept;
import com.jp.hr.entities.Emp;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.interfaces.DaoEmployee;


@Repository("daoEmployeeDS")  
public class DaoEmployeeImplJPA implements DaoEmployee {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Emp> getEmpList() throws HrException {
		String sql = "SELECT e FROM empRecord e";
		Query qry = entityManager.createQuery(sql);
		
		List<Emp> empList = qry.getResultList();
		return empList;
	}

	@Override
	public Emp getEmpDetails(int empId) throws HrException {
		
		return entityManager.find(Emp.class, empId);
	}

	@Override
	public boolean insertNewRecord(Emp emp) throws HrException {
		entityManager.persist(emp);
		Emp empNew = entityManager.find(Emp.class, emp.getEmpNo());
		System.out.println(empNew);
		if(empNew != null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<Dept> getDeptList() throws HrException {
		String sql = "SELECT d FROM deptRecord d";
		Query qry = entityManager.createQuery(sql);
		
		List<Dept> deptList = qry.getResultList();
		return deptList;
		
	}
	
	@Override
	public Dept getDeptDetails(int deptId) throws HrException {
		
		return entityManager.find(Dept.class, deptId);
	}

}