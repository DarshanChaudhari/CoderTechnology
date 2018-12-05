package com.jp.cart.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.sql.DataSource;
import com.jp.cart.entities.ShoppingItem;
import com.jp.cart.exceptions.CartException;
import com.jp.cart.utilities.ConnectionFactoryTomcat;


/* The ClassNotException, SQLException must not come of DAO Class
 *	The database specific entities must not come out of the class(Like Exception and classes)
 *	Each and every resource (Connection, Statement , Resultset) must be closed properly
 *  Always prefer statement over PreparedStatement for non-interactive queries. [eg .select * from employees is the non -interactive query]
 *  Fetch the data page wise.
 *  Prefer mentioning column names instead of column position in getXXX() methods. note: position may change.
*/
public class DaoShoppingItemImpl implements DaoShoppingItem {

	private DataSource dataSource; // In My i will Dao i will not go to Oracle
									// data source i will go for Datasource,
									// becuase this is the super interface of
									// the classes.In future Oracle datasource
									// may be change then you have to change in
									// Conectionfactory

	// We have create a factory class so here we can used
	public DaoShoppingItemImpl() throws CartException {
		try {
			// factory = new ConnectionFactory();
			//ConnectionFactory factory = ConnectionFactory.getConnectionFactory();
			ConnectionFactoryTomcat factory =  ConnectionFactoryTomcat.getConnectionFactory();
			dataSource = factory.getDataSource();
		} catch (Exception e) {
			throw new CartException("Problem in procuring connection.", e);
		}
	}

	



	@Override
	public ArrayList<ShoppingItem> getItemList() throws CartException {
		// TODO Auto-generated method stub
		ArrayList<ShoppingItem> itemList = new ArrayList<>();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			connect = dataSource.getConnection();
			stmt = connect.createStatement();
			rs = stmt.executeQuery("SELECT * FROM ItemMaster");

			while (rs.next()) {
				String ItemId = rs.getString("ItemId");				
				String itemName = rs.getString("Name");
				String category = rs.getString("Category");
				Double price = rs.getDouble("price");
				itemList.add(new ShoppingItem(ItemId, itemName, category,price));

			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new CartException("Problem in Fetching.", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}

				if (connect != null) {
					connect.close();
				}

				// factory.closeConnection();
			} catch (SQLException e) {
				throw new CartException("Problem in closing resources.", e);
			}
		}

		return itemList;
	}


	@Override
	public ShoppingItem getItemDetails(String itemId) throws CartException {
		Connection connect = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String qry = "Select ItemId,name,Category,Price FROM ItemMaster where ItemId =?";

		try {
			connect = dataSource.getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setString(1, itemId);

			rs = stmt.executeQuery();

			if (rs.next()) {				
				String itemName = rs.getString("Name");
				String category = rs.getString("Category");
				Double price = rs.getDouble("price");
				return new ShoppingItem(itemId, itemName, category,price);

			} else {

				return null;
			}

		} catch (SQLException e) {
			throw new CartException("Problem in Fetching.", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

				if (stmt != null) {
					stmt.close();
				}

				if (connect != null) {
					connect.close();
				}

				// factory.closeConnection();
			} catch (SQLException e) {
				throw new CartException("Problem in closing resources.", e);
			}
		}

	}















	
}