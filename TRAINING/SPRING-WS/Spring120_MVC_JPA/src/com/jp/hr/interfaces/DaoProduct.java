package com.jp.hr.interfaces;
import java.util.List;

import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;

public interface DaoProduct {
	
	public List<Product> getProdList() throws HrException;

	public Product getProdDetails(int prodId) throws HrException;

	public boolean insertNewRecord(Product prod) throws HrException;

}