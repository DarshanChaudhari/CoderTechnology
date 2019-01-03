package com.jpm.hr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jpm.hr.daos.IHrDao;
import com.jpm.hr.entities.Employee;
import com.jpm.hr.exceptions.HrException;

@Service("hrServices")
public class HrServiceImpl implements IHrService {

	private static final long serialVersionUID = 1L;

	@Autowired(required=true)
	@Qualifier("hrDao")
	private IHrDao hrDao;
	
	@Override
	public Employee getEmpDetails(int empNo) throws HrException {		
		return hrDao.getEmpDetails(empNo);
	}

}
