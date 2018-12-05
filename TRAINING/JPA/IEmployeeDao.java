/**
 * 
 */
package com.jpm.jpacrud.dao;

import java.util.List;

import com.jpm.jpacrud.entities.Employee;
import com.jpm.jpacrud.exception.EmployeeException;

/**
 * @author brije
 *
 */
public interface IEmployeeDao {
	public Long addEmployee(Employee employee)throws EmployeeException;//C-create
	public List<Employee> getEmployeeList()throws EmployeeException;//R All Employee -retrieve
	public Employee getEmployeeById(Long custId)throws EmployeeException;//S-search

	public Employee updateEmployee(Employee employee)throws EmployeeException;//U-update
	public int deleteEmployeeById(Long custId)throws EmployeeException;//D-delete

}
