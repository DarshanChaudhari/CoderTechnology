package com.jp.hr.daos;

import java.util.ArrayList;

import com.jp.hr.entities.Employee;
import com.jp.hr.entities.User;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.exceptions.UserException;

public interface DaoUserDetails {

	public ArrayList<User> getUserList () throws UserException;
}
