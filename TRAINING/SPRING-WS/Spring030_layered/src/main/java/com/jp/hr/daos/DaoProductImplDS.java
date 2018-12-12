package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jp.hr.entities.Employee;
import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.interfaces.DaoEmployee;
import com.jp.hr.interfaces.DaoProduct;

/*
 * This is used to Inject DataSource class using Autowired in Field 
 * 
 */
public class DaoProductImplDS implements DaoProduct {
	
	
	private DataSource dataSource;

	@Override
	public ArrayList<Product> getProdList() throws HrException {
	ArrayList<Product> prodList = new ArrayList<>();
		
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			connect = dataSource.getConnection();
			stmt = connect.createStatement();
			rs = stmt.executeQuery("Select * from Products");
			
			while (rs.next()) {
				int prodId = rs.getInt("PRODUCT_ID");
				String prodNm = rs.getString("PRODUCT_NAME");
				String prodcategory = rs.getString("CATEGORY");
				float prodprice = rs.getFloat("PRICE");
				prodList.add(new Product(prodId,prodNm,prodcategory,prodprice));
			}
		} catch (SQLException e) {
			throw new HrException("Problem in fetching. ",e);
		} finally {			
			try {
				if (rs!=null) {
					rs.close();
				}
				
				if (stmt!=null) {
					stmt.close();
				}	
				if (connect!=null) {
					connect.close();
				}	

			} catch (SQLException e) {
				throw new HrException("Problem in closing connection.",e);				
			}
		}
		
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
