package com.jp.inheritance.tpc.client;

import javax.persistence.EntityManager;

import com.jp.inheritance.tpc.entities.Employee;
import com.jp.inheritance.tpc.entities.Manager;
import com.jp.inheritance.tpc.entities.SalesManager;
import com.jp.inheritance.tpc.util.JPAUtil;

public class ClientInheritanceTPC {
	
	
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
