package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.utilities.ConnectionFactory;
import com.jp.hr.utilities.ConnectionFactoryTomcat;

public class DaoEmployeeImpl implements DaoEmployee {
	private DataSource dataSource;
	
	public DaoEmployeeImpl() 
			throws HrException {
		try {
			//ConnectionFactory factory = ConnectionFactory.getConnectionFactory();
			ConnectionFactoryTomcat factory = ConnectionFactoryTomcat.getConnectionFactory();
			dataSource = factory.getDataSource();
		} catch (Exception e) {
			throw new HrException("Problem in procuring connection.", e);
		}
	}
	
	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		ArrayList<Employee> empList = new ArrayList<>();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connect = dataSource.getConnection();
			stmt = connect.createStatement();
			rs = stmt.executeQuery("SELECT empid,ename,address FROM employee_details111");
			
			while(rs.next()){
				int empId = rs.getInt("empid");
				String firstNm = rs.getString("ename");
				String lastNm = rs.getString("address");
				empList.add(new Employee(empId, firstNm, lastNm));
			}
			
		} catch (SQLException e) {
			throw new HrException("Problem in fetching.", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (connect != null){
					connect.close();
				}
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
		
		return empList;
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		String qry = "SELECT empid,ename,address FROM employee_details WHERE empid = ?";
		Connection connect = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			connect = dataSource.getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setInt(1, empId);
			
			rs = stmt.executeQuery();
			if(rs.next()){
				String firstNm = rs.getString("ename");
				String lastNm = rs.getString("address");
				return new Employee(empId, firstNm, lastNm);
			} else {
				// Id is wrong.
				return null;
			}
			
		} catch (SQLException e) {
			throw new HrException("Problem in fetching.", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (connect != null){
					connect.close();
				}
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	public boolean insertNewRecord(Employee emp) throws HrException {
		String qry = "INSERT INTO  employee_details "
				+ "(empid,ename,address) "
				+ "VALUES (seqEmpId.nextval, ?, ?)";
		Connection connect = null;
		PreparedStatement stmt = null;
		
		try {
			connect = dataSource.getConnection();
			stmt = connect.prepareStatement(qry);
			//stmt.setInt(1, emp.getEmpId());
			stmt.setString(1, emp.getFirstName());
			stmt.setString(2, emp.getLastName());
			
			int recInserted = stmt.executeUpdate();
			return recInserted==1? true : false;
			
		} catch (SQLException e) {
			throw new HrException("Problem in fetching.", e);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (connect != null){
					connect.close();
				}
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}
}
