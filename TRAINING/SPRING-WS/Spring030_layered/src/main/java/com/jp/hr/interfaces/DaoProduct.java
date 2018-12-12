package com.jp.hr.interfaces;
import java.util.ArrayList;
import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;

public interface DaoProduct {
	
	public ArrayList<Product> getProdList() throws HrException;

	public Product getProdDetails(int prodId) throws HrException;

	public boolean insertNewRecord(Product prod) throws HrException;

}
