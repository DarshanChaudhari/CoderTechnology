package com.jp.stock.daos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.jp.stock.entities.Products;
import com.jp.stock.exceptions.StockException;
import com.jp.stock.utilities.ConnectionFactory;

public class DaoProductsImpl implements DaoProducts{
	
	private ConnectionFactory factory;	
	
	
	public DaoProductsImpl() throws StockException {
		try {
			factory = new ConnectionFactory();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			throw new StockException("Problem in procuring Connection.", e);
		}
	}


	
	@Override
	public ArrayList<Products> getProdList() throws StockException {
		
		ArrayList<Products> prodList = new ArrayList<>();
		
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			connect = factory.getConnection();
			stmt = connect.createStatement();
			rs = stmt.executeQuery("Select * from Products");
			
			while (rs.next()) {
				int prodId = rs.getInt("PRODUCT_ID");
				String prodNm = rs.getString("PRODUCT_NAME");
				String prodcategory = rs.getString("CATEGORY");
				float prodprice = rs.getFloat("PRICE");
				prodList.add(new Products(prodId,prodNm,prodcategory,prodprice));
			}
		} catch (SQLException e) {
			throw new StockException("Problem in fetching. ",e);
		} finally {			
			try {
				if (rs!=null) {
					rs.close();
				}
				
				if (stmt!=null) {
					stmt.close();
				}	
//				factory.closeConnection();
			} catch (SQLException e) {
				throw new StockException("Problem in closing connection.",e);				
			}
		}
		
		return prodList;
		
	}
	


	@Override
	public Products getProdDetails(int productId) throws StockException {
		System.out.println(productId);
		Connection connect =null;
		PreparedStatement stmt=null;
		ResultSet rs =null;
		String qry = "Select PRODUCT_ID,PRODUCT_NAME,CATEGORY,PRICE FROM PRODUCTS where PRODUCT_ID =?";
		
		try {
			connect = factory.getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setInt(1, productId);
			
			rs = stmt.executeQuery();
						
			if(rs.next()) {				
				String prodNm = rs.getString("PRODUCT_NAME");
				String category = rs.getString("CATEGORY");		
				float price = rs.getFloat("price");
				return new Products(productId,prodNm,category,price);
				
			} else {
				
				return null;
			}
			
		} catch (SQLException e) {
			throw new StockException("Problem in Fetching.", e);
		}  finally {
			try {
				if (rs!=null) {
					rs.close();
				}
				
				if (stmt!=null) {
					stmt.close();
				}			
				
//				factory.closeConnection();
			} catch (SQLException e) {
				throw new StockException("Problem in closing resources.", e);
			}
		}	
	}
	

	@Override
	public boolean insertNewRecord(Products product) throws StockException {
			String qry = "INSERT INTO PRODUCTS (PRODUCT_ID,PRODUCT_NAME,CATEGORY,PRICE) VALUES(?,?,?,?)";
		
		Connection connect =null;
		PreparedStatement stmt=null;
		
		try {
			connect = factory.getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setInt(1, product.getProductId());
			stmt.setString(2, product.getProductName());
			stmt.setString(3, product.getCategory());
			stmt.setFloat(4, product.getPrice());
			
			int recInserted = stmt.executeUpdate();
			return recInserted==1? true :false;			
			
		} catch (SQLException e) {
			throw new StockException("Problem in Fetching.", e);
		}  finally {
			try {
				
				if (stmt!=null) {
					stmt.close();
				}			
				
//				factory.closeConnection();
			} catch (SQLException e) {
				throw new StockException("Problem in closing resources.", e);
			}
		}	
		
	}



	@Override
	protected void finalize() throws Throwable {
		factory.closeConnection();
		super.finalize();
	}
	
	
	

} 
	
	
	
	/*public static void main (String[] args) throws StockException {
	DaoProductsImpl abc = new DaoProductsImpl();
	System.out.println(abc.getProdList()); 	
	
}*/

