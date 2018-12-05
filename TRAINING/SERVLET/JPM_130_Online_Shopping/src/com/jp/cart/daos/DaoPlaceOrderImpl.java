package com.jp.cart.daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.jp.cart.entities.PlaceOrder;
import com.jp.cart.exceptions.CartException;
import com.jp.cart.utilities.ConnectionFactoryTomcat;
import com.jp.cart.utilities.ConnectionFactoryOracle;



public class DaoPlaceOrderImpl implements DaoPlaceOrder {
	
	private DataSource dataSource; 
	
	public DaoPlaceOrderImpl() throws CartException {
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
	public boolean AddNewOrder(PlaceOrder pOrder) throws CartException {

//		String qry = "INSERT INTO EMP_DETAIL (employee_id,first_name,last_name) VALUES(?,?,?)";

			// This is for Auto-increment unique id
		String qry = "INSERT INTO OrderMaster (CustomerId,OrderId,ItemId) VALUES (seqOrderId.nextval,?,?)";
		Connection connect = null;
		PreparedStatement stmt = null;
		
		try {
			connect = dataSource.getConnection();
			stmt = connect.prepareStatement(qry);//			
			stmt.setInt(1, pOrder.getCustomerId());
			stmt.setString(2, pOrder.getItemId());
			

			int recInserted = stmt.executeUpdate();
			return recInserted == 1 ? true : false;

		} catch (SQLException e) {
			throw new CartException("Problem in Fetching.", e);
		} finally {
			try {

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

	

	

