package com.jp.stock.utilities;

import java.sql.Connection;

/*
 *  1. Self referencial static private field;
 *  2. To make the constructor private
 *  3. Public static method to create restricted number of instances.
 *  
 */
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static ConnectionFactory factory;
	private Connection connect;
	
	private ConnectionFactory() throws ClassNotFoundException, SQLException {
		String driverName = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/orcl";
		String userName = "hr";
		String password = "hr";
		
		Class.forName(driverName);
		connect = DriverManager.getConnection(url, userName, password);
		
	}
	
	public static ConnectionFactory getConnectionFactory() throws ClassNotFoundException, SQLException {
		
		if (factory == null) {
			factory = new ConnectionFactory();
		}
		
		return factory;
	}

	public Connection getConnection() {
		return connect;
		
	}

	public void closeConnection() throws SQLException {
		connect.close();		
	}
	
	
}