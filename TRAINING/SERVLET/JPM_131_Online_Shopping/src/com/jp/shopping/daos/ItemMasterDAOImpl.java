package com.jp.shopping.daos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.jp.shopping.entities.ItemMaster;
import com.jp.shopping.exceptions.ShoppingException;
import com.jp.shopping.utilities.ConnectionFactoryOracle;

public class ItemMasterDAOImpl implements ItemMasterDAO { 
	
	private DataSource dataSource;
	
	
	public ItemMasterDAOImpl() throws ShoppingException {
	
		try {
			ConnectionFactoryOracle factory = ConnectionFactoryOracle.getConnectionFactory();
			dataSource = factory.getDataSource();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ShoppingException ("Problem in procuring Connection.", e);
		}
	}

	@Override
	public ArrayList<ItemMaster> getItemList() throws ShoppingException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		ArrayList<ItemMaster> itemList = new ArrayList<ItemMaster>();
		
			try {
				conn = dataSource.getConnection();				
				stmt = conn.createStatement();
				rs = stmt.executeQuery("SELECT ITEMID,NAME,CATEGORY,PRICE,ITEMINSTOCK FROM ITEMMASTER");
				
				while(rs.next()) {
					
					String itemId = rs.getString("ITEMID");
					String name = rs.getString("NAME");
					String category = rs.getString("CATEGORY");
					Float price = rs.getFloat("PRICE");
					int itemInStock = rs.getInt("ITEMINSTOCK");
					
					itemList.add(new ItemMaster(itemId, name, category, price, itemInStock));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new ShoppingException("Problem in fetching data",e);
			} finally {
				try {
					if(rs!=null) {
						rs.close();
					}
					
					if(stmt!=null) {
						stmt.close();
					}
					
					if(conn!=null) {
						conn.close();
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					throw new ShoppingException("Problem in Closing Resource.",e); 
					
				}
			}
			
		return itemList;
	}

	public ItemMaster getItemDetails(String itemId) throws ShoppingException {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		//String strQuery = "SELECT ITEMID, NAME,CATEGORY,PRICE,ITEMINSTOCK FROM ITEMMASTER WHERE ITEMID=?";
		String strQuery = "SELECT ITEMID, NAME,CATEGORY,PRICE,ITEMINSTOCK FROM ITEMMASTER WHERE ITEMID=?";
		try {
			conn = dataSource.getConnection();
			stmt = conn.prepareStatement(strQuery);
			stmt.setString(1,itemId);
			rs = stmt.executeQuery();
			if (rs.next()) {
				
				String name = rs.getString("NAME");
				String category = rs.getString("CATEGORY");
				Float price = rs.getFloat("PRICE");
				int itemInStock = rs.getInt("ITEMINSTOCK");
				return new ItemMaster(itemId.toUpperCase(),  name,category, price,itemInStock);
			} else {
				return null;
			}

		} catch (SQLException e) {
			throw new ShoppingException("Problem in fetching data.", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				throw new ShoppingException("Problem in closing resources.", e);
			}

		}

	}
	
	public static void main(String [] args) throws ShoppingException {
		
		ItemMasterDAOImpl  abc = new ItemMasterDAOImpl();
		ItemMaster item = abc.getItemDetails("E1001");
		System.out.println(item);
		
	}
		

}
