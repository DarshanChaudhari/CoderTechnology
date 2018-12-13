package com.jp.hr.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.interfaces.DaoProduct;

@Repository("daoProductDS")
public class DaoProductImplJPA implements DaoProduct{
	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public List<Product> getProdList() throws HrException {
		String sql = "Select p from prodRec p";
		Query qry = entityManager.createQuery(sql);		
		List<Product> prodList = qry.getResultList();
		return prodList;
	}

	@Override
	public Product getProdDetails(int prodId) throws HrException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertNewRecord(Product prod) throws HrException {
		// TODO Auto-generated method stub
		return false;
	}

}
