package com.jp.hr.utilities;

import java.sql.Connection;

/*
 *  1. Self referencial static private field;
 *  2. To make the constructor private
 *  3. Public static method to create restricted number of instances.
 *  
 */
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class ConnectionFactoryOracle {
	
		private static ConnectionFactoryOracle factory;
		private OracleDataSource dataSource;
		
		private ConnectionFactoryOracle() throws ClassNotFoundException, SQLException {
			dataSource = new OracleDataSource();
			dataSource.setDriverType("thin");
			dataSource.setPortNumber(1521);
			dataSource.setUser("hr");
			dataSource.setPassword("hr");
			dataSource.setServerName("localhost");
			dataSource.setServiceName("orcl");
					
			
		}
	
		public static ConnectionFactoryOracle getConnectionFactory() throws ClassNotFoundException, SQLException {
			
			if (factory == null) {
				factory = new ConnectionFactoryOracle();
			}
			
			return factory;
		}

		public OracleDataSource getDataSource() {
			return dataSource;
			
		}
	
	}
	
	

