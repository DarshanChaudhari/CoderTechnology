package com.jp.stock.daos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.jp.stock.entities.Products;
import com.jp.stock.exceptions.StockException;

public class DaoProductsImpl implements DaoProducts{
	
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		
		String driverName = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String userName = "hr";
		String password = "hr";
		
		Class.forName(driverName);
		return DriverManager.getConnection(url, userName, password);
	
	}
	
	
	private void closeConnection(Connection connect) throws SQLException {
		connect.close();
	} 
	
	@Override
	public ArrayList<Products> getProdList() throws StockException {
		
		ArrayList<Products> prodList = new ArrayList<>();
		Connection connect=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			connect = getConnection();
			stmt = connect.createStatement();
			rs = stmt.executeQuery("Select * from Products");
			
			while (rs.next()) {
				int prodId = rs.getInt("PRODUCT_ID");
				String prodNm = rs.getString("PRODUCT_NAME");
				String prodcategory = rs.getString("CATEGORY");
				float prodprice = rs.getFloat("PRICE");
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new StockException("Problem in fetching. ",e);
		} finally {
			
			try {
				rs.close();
				stmt.close();
				closeConnection(connect);
			} catch (SQLException e) {
				throw new StockException("Problem in closing connection.",e); 
			}
		}
		
		return prodList;
		
	}
	
//	public static void main (String[] args) throws StockException {
//		DaoProductsImpl abc = new DaoProductsImpl();
//		abc.getProdList();	
//		
//	}
	
}
