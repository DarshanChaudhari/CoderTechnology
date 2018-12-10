package com.jp.oto.client;

import javax.persistence.EntityManager;

import com.jp.oto.entities.Address;
import com.jp.oto.entities.Employee;
import com.jp.oto.util.JPAUtil;

public class OTOClient {

	public static void main(String[] args) {
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		
// address object
		
		Address homeAddress = new Address();
		homeAddress.setAddressId(121L);
		homeAddress.setStreet("MG Road");
		homeAddress.setCity("Pune");
		homeAddress.setState("Maharashtra");
		homeAddress.setZipCode("411017");
		
		
// Employee Object
		
		Employee empObj = new Employee();
		empObj.setEmpId(111L);
		empObj.setEmpName("Zara");
		empObj.setEmpSal(99.99);
		

// set address to the Emplooyee object
		empObj.setAddress(homeAddress);
		

// now persist the empobj
		entityManager.persist(empObj);
// now commit and close
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}
