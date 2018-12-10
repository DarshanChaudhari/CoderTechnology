package com.jp.otm.client;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jp.otm.entity.Department;
import com.jp.otm.entity.Employee;
import com.jp.otm.util.JPAUtil;

public class OTMClient {

	
	
	public static void main(String[] args) {
		// Step 1 Obtain EntityManager object
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		/// create the object to be persisted
		//-dept obj
		
		Department department = new Department();
		department.setDeptId(20L);
		department.setDeptName("IT");
		
		// Emp object e1
		Employee e1 = new Employee();
		e1.setEmpId(102L);
		e1.setEmpName("Zara");
		e1.setEmpSal(99.99);
		// set the department of the emmployess
		e1.setDepartment(department);
		
		
		// Emp object e2
				Employee e2 = new Employee();
				e2.setEmpId(105L);
				e2.setEmpName("Tara");
				e2.setEmpSal(88.88);
				// set the department of the emmployess
				e2.setDepartment(department);

		// Create the set of employees and the set to the department
		Set<Employee> employees = new HashSet<>(); 
		
		//adding the employee obje to the Hashset
		employees.add(e1); 
		employees.add(e2);
		
		// set the employees set in Department object
		department.setEmployees(employees);
		
		// begin the transactions
		entityManager.getTransaction().begin();
		
		// pers
		
		//persist the department object
		entityManager.persist(department);
		
		// commit transactions
		entityManager.getTransaction().commit();
		
		// close em
		entityManager.close();
			
	}

}