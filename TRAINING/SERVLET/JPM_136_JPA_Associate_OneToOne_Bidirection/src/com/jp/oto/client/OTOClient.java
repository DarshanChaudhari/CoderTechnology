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
		homeAddress.setAddressId(122L);
		homeAddress.setStreet("MG Road");
		homeAddress.setCity("Mumbai");
		homeAddress.setState("Maharashtra");
		homeAddress.setZipCode("411018");
		
		
// Employee Object
		
		Employee empObj = new Employee();
		empObj.setEmpId(112L);
		empObj.setEmpName("Tara");
		empObj.setEmpSal(88.88);
		

// set address to the Employee object
		empObj.setAddress(homeAddress);
		
		//homeAddress.setEmployee(empObj);

// now persist the empobj
		entityManager.persist(empObj);
		//entityManager.persist(homeAddress);
// now commit and close
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}
