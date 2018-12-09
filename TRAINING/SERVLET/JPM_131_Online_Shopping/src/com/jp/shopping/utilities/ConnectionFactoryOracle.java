package com.jp.shopping.utilities;

import java.sql.SQLException;


import oracle.jdbc.pool.OracleDataSource;

public class ConnectionFactoryOracle {
 	
	private static  ConnectionFactoryOracle factory;
 	private static OracleDataSource dataSource;
 

	public ConnectionFactoryOracle() throws SQLException {
		dataSource = new OracleDataSource();
		dataSource.setDriverType("thin");
		dataSource.setPortNumber(1521);
		dataSource.setUser("hr");
		dataSource.setPassword("hr");
		dataSource.setServerName("localhost");
		dataSource.setServiceName("XE");

	}

	public static ConnectionFactoryOracle getConnectionFactory() throws SQLException {
		
		if (factory == null) {
			factory = new ConnectionFactoryOracle();
		} 
		
		return factory;		
	}
	  
	public OracleDataSource getDataSource() {
		return dataSource;
	}
}



