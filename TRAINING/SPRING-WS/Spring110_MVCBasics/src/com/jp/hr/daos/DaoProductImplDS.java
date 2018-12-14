package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.interfaces.DaoProduct;

/*
 * This is used to Inject DataSource class using Autowired in Field 
 * 
 */
@Repository("daoProductDS")
public class DaoProductImplDS implements DaoProduct {
	
	@Autowired
	@Qualifier("ds")
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
	public Product getProdDetails(int productId) throws HrException {
		Connection connect =null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		String qry = "Select PRODUCT_ID,PRODUCT_NAME,CATEGORY,PRICE FROM PRODUCTS where PRODUCT_ID =?";
		
		try {
			connect = dataSource.getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setInt(1, productId);
			
			rs = stmt.executeQuery();
						
			if(rs.next()) {				
				String prodNm = rs.getString("PRODUCT_NAME");
				String category = rs.getString("CATEGORY");		
				float price = rs.getFloat("price");
				return new Product(productId,prodNm,category,price);
				
			} else {
				
				return null;
			}
			
		} catch (SQLException e) {
			throw new HrException("Problem in Fetching.", e);
		}  finally {
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
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	public boolean insertNewRecord(Product prod) throws HrException {
		String qry = "INSERT INTO PRODUCTS (PRODUCT_ID,PRODUCT_NAME,CATEGORY,PRICE) VALUES(?,?,?,?)";
		
		Connection connect =null;
		PreparedStatement stmt=null;
		
		try {
			connect = dataSource.getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setInt(1, prod.getProductId());
			stmt.setString(2, prod.getProductName());
			stmt.setString(3, prod.getCategory());
			stmt.setFloat(4, prod.getPrice());
			
			int recInserted = stmt.executeUpdate();
			return recInserted==1? true :false;			
			
		} catch (SQLException e) {
			throw new HrException("Problem in Fetching.", e);
		}  finally {
			try {
				
				if (stmt!=null) {
					stmt.close();
				}			
				if (connect!=null) {
					connect.close();
				}
				
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}	
		
	}
	

	

}