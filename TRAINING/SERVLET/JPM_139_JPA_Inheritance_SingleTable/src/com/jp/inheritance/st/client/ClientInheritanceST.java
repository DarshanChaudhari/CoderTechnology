package com.jp.inheritance.st.client;

import javax.persistence.EntityManager;

import com.jp.inheritance.st.entities.Employee;
import com.jp.inheritance.st.entities.Manager;
import com.jp.inheritance.st.entities.SalesManager;
import com.jp.inheritance.st.util.JPAUtil;

public class ClientInheritanceST {
	
	
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		// Create Employee Object
			Employee emp = new Employee("A",999.99);
		
		// Create Manager Object
			Manager mgr = new Manager("B",888.50,700.50);
			
			/*	Manager mgr = new Manager();
				Double sal = mgr.getEmpSal();
				System.out.println(sal);*/
				
		//Create Manager Object
			SalesManager salesmgr = new SalesManager("C",888.50,700.50,200.50);
		
		// persist them
			em.persist(emp);
			em.persist(mgr);
			em.persist(salesmgr);
		// commit transaction
		
			em.getTransaction().commit();
			em.close();
	}

}
