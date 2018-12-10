package com.jp.Factory;

import com.jp.dao.MyApplDao;
import com.jp.services.MyApplServices;

// Factory Class
public class ObjectFactory {
	private MyApplDao dao;
	private MyApplServices service;
	
	// Constructor
	public ObjectFactory() {
		dao = new MyApplDao();
		service = new MyApplServices(dao);
	}
	
	// Factory Method for Dao
	public MyApplDao getDao() {
		return dao;
	}

	// Factory Method for service
	public MyApplServices getService() {
		return service;
	}
	
	/* I want one method return as a object the above two method can be return by using this
	 *  Instead of remembering n number of method we can call getBean and inside that switch case no used of break here because we are using return
*/	
	public Object getBean(String beanName) {
		switch (beanName) {
			case "dao" : {
				return dao;				
			}
		
			case "service" : {
				return service;
			}
			
			default : {
				return null;
			}
		}
		
	}

}