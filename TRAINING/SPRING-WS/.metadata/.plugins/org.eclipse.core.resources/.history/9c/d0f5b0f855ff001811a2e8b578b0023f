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
		Product prod = entityManager.find(Product.class, prodId);
		return prod;
	}

	@Override
	public boolean insertNewRecord(Product prod) throws HrException {
		entityManager.persist(prod);
		Product newProd = entityManager.find(Product.class, prod.getProductId());
		
		if(newProd !=null) {
			return true;
		} else {
			return false;
		}
		
	}

}
