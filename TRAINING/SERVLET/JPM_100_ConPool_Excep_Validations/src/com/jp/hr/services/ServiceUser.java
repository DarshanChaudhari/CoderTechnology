package com.jp.hr.services;

import com.jp.hr.entities.User;
import com.jp.hr.exceptions.UserException;

public interface ServiceUser {

	public User getUserDetails(int empId) throws UserException;
}
