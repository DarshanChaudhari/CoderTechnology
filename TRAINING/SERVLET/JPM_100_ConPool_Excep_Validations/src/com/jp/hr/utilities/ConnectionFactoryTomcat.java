package com.jp.hr.utilities;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.jp.hr.exceptions.HrException;


public class ConnectionFactoryTomcat {
	
	private static ConnectionFactoryTomcat factory;
	private DataSource ds = null;
	
	
	private ConnectionFactoryTomcat() throws HrException {
		try {
			Context initContext = new InitialContext();     // Context is connect to jndi(Java Naming and Directory Interface (JNDI))
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			ds = (DataSource)envContext.lookup("jdbc/myoracle");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			throw new HrException("Problm in connecting to JNDI",e);
		}
	}
	
	
	public static ConnectionFactoryTomcat getConnectionFactory() throws HrException {
		
		if (factory == null) {
			factory = new ConnectionFactoryTomcat();
		}
		
		return factory;
	}

	public DataSource getDataSource() {
		return ds;
		
	}

}