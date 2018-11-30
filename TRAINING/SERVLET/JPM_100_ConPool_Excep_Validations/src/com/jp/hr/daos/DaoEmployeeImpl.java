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

import com.jp.hr.utilities.ConnectionFactoryTomcat;

/* The ClassNotException, SQLException must not come of DAO Class
 *	The database specific entities must not come out of the class(Like Exception and classes)
 *	Each and every resource (Connection, Statement , Resultset) must be closed properly
 *  Always prefer statement over PreparedStatement for non-interactive queries. [eg .select * from employees is the non -interactive query]
 *  Fetch the data page wise.
 *  Prefer mentioning column names instead of column position in getXXX() methods. note: position may change.
*/
public class DaoEmployeeImpl implements DaoEmployee {

	private DataSource dataSource; // In My i will Dao i will not go to Oracle
									// data source i will go for Datasource,
									// becuase this is the super interface of
									// the classes.In future Oracle datasource
									// may be change then you have to change in
									// Conectionfactory

	// We have create a factory class so here we can used
	public DaoEmployeeImpl() throws HrException {
		try {
			// factory = new ConnectionFactory();
			//ConnectionFactory factory = ConnectionFactory.getConnectionFactory();
			ConnectionFactoryTomcat factory =  ConnectionFactoryTomcat.getConnectionFactory();
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
			rs = stmt.executeQuery("SELECT * FROM EMP_DETAIL");

			while (rs.next()) {
				int empId = rs.getInt("employee_id");
				String firstNm = rs.getString("first_name");
				String lastNm = rs.getString("last_name");
				empList.add(new Employee(empId, firstNm, lastNm));

			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new HrException("Problem in Fetching.", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}

				if (connect != null) {
					connect.close();
				}

				// factory.closeConnection();
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}

		return empList;
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		Connection connect = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String qry = "Select employee_id,first_name,last_name FROM EMP_DETAIL where employee_id =?";

		try {
			connect = dataSource.getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setInt(1, empId);

			rs = stmt.executeQuery();

			if (rs.next()) {
				String firstNm = rs.getString("first_name");
				String lastNm = rs.getString("last_name");
				return new Employee(empId, firstNm, lastNm);

			} else {

				return null;
			}

		} catch (SQLException e) {
			throw new HrException("Problem in Fetching.", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

				if (stmt != null) {
					stmt.close();
				}

				if (connect != null) {
					connect.close();
				}

				// factory.closeConnection();
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}

	}

	@Override
	public boolean insertNewRecord(Employee emp) throws HrException {

		String qry = "INSERT INTO EMP_DETAIL (employee_id,first_name,last_name) VALUES(?,?,?)";

		Connection connect = null;
		PreparedStatement stmt = null;

		try {
			connect = dataSource.getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setInt(1, emp.getEmpId());
			stmt.setString(2, emp.getFirstName());
			stmt.setString(3, emp.getLastName());

			int recInserted = stmt.executeUpdate();
			return recInserted == 1 ? true : false;

		} catch (SQLException e) {
			throw new HrException("Problem in Fetching.", e);
		} finally {
			try {

				if (stmt != null) {
					stmt.close();
				}

				if (connect != null) {
					connect.close();
				}

				// factory.closeConnection();
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}

	}

}