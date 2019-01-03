package com.jpm.hr.daos;

import java.io.Serializable;

import com.jpm.hr.entities.Employee;
import com.jpm.hr.exceptions.HrException;

public interface IHrDao extends Serializable {

		public Employee getEmpDetails(int empNo) throws HrException;
}
