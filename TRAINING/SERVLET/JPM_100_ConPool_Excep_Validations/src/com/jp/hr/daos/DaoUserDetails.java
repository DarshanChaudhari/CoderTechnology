package com.jp.hr.daos;

import com.jp.hr.entities.Employee;
import com.jp.hr.entities.User;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.exceptions.UserException;

public interface DaoUserDetails {

	public User getUserDetails(int empId) throws UserException;
}
