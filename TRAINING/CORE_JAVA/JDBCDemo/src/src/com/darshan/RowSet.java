package src.com.darshan;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RowSet {

    public static <jdbcRowSet> void main(String[] args) throws SQLException {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        //Step 1: Load JDBC Driver
        try {
           Class.forName("oracle.jdbc.OracleDriver");
           System.out.println("JDBC Driver found and Loaded!");
            // Remove 2,3,4,5,6 from the Main java program and insert the below statement
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            ((JdbcRowSet) rowSet).setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
            ((JdbcRowSet) rowSet).setUsername("hr");
            ((JdbcRowSet) rowSet).setPassword("hr");
            ((JdbcRowSet) rowSet).setCommand("select first_name, last_name from employees");
            ((JdbcRowSet) rowSet).execute();

            while(rowSet.next()){
                System.out.println("Name: "+ ((JdbcRowSet) rowSet).getString(1)+" "+((JdbcRowSet) rowSet).getString(2));
            }
        } catch (ClassNotFoundException ce) {
            System.out.println("Cannot load driver " + ce.getMessage());
            return; //Close main method
        }

    }
}
