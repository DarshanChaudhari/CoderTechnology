package com.jp.hr.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.util.JPAUtil;

/* The ClassNotException, SQLException must not come of DAO Class
 *	The database specific entities must not come out of the class(Like Exception and classes)
 *	Each and every resource (Connection, Statement , Resultset) must be closed properly
 *  Always prefer statement over PreparedStatement for non-interactive queries. [eg .select * from employees is the non -interactive query]
 *  Fetch the data page wise.
 *  Prefer mentioning column names instead of column position in getXXX() methods. note: position may change.
*/
public class DaoEmployeeImpl implements DaoEmployee {
	
	//prep work in Dao-> EntityManager Object
		private EntityManager entityManager;
	
		public DaoEmployeeImpl() {
			
			entityManager= JPAUtil.getEntityManager();
		}
	
	
	private static final int E1001 = 0;


	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		Query query = entityManager.createQuery("from Employee");
		return (ArrayList<Employee>) query.getResultList();
	}


	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		return entityManager.find(Employee.class, empId);
		
		
	}


	@Override
	public int insertNewRecord(Employee emp) throws HrException {
		entityManager.persist(emp);
		return emp.getEmpId();
		
	}
	
	
		
	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		
	}

}
