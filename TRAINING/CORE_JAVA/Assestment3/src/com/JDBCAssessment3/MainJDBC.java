package com.JDBCAssessment3;
import com.JDBCAssessment3.Department;

import java.sql.*;

public class MainJDBC extends Department {


    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        //Step 1: Load JDBC Driver
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("JDBC Driver found and Loaded!");
        }catch(ClassNotFoundException ce){
            System.out.println("Cannot load driver "+ce.getMessage());
            return; //Close main method
        }

        //Step 2: Create a connection
        try{
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/orcl","hr","hr");
            System.out.println("Connected to DB");
        }catch(SQLException ex){
            System.out.println("Unable to connect: "+ex.getMessage());
            return;
        }

        //Step 3: Create Statement
        try {
            st = con.createStatement();
            System.out.println("Statement created!");
        }catch(SQLException ex){
            System.out.println("Unable to create a statement! "+ex.getMessage());
        }
        //Step 4: Execute the statement
        try{
            rs = st.executeQuery("SELECT * FROM DEPARTMENTS where department_id = '30'");
            System.out.println("Fetched some data!");
        }catch(SQLException ex){
            System.out.println("Unable to fetch the data ! "+ex.getMessage());
        }

        //Step 5: OPTIONAL Process the result
        try{
            while(rs.next()){   //till there's no record left
                String depart_id = rs.getString(1);
                int department_id =Integer.parseInt(depart_id);
                String department_name = rs.getString(2);
                String manag_id = rs.getString(3);
                int manager_id = Integer.parseInt(manag_id);
                String loc_id = rs.getString(4);
                int location_id = Integer.parseInt(loc_id);
                Department dt = new Department(department_id,department_name,manager_id,location_id);
            }
        }catch(SQLException ex){
            System.out.println("Unable to travers the result set "+ex.getMessage());
        }


        //Step 6: Close Connection
        try{
            //close everything
            rs.close();
            st.close();
            con.close();
            System.out.println("Closed everything!");
        }catch(SQLException ex){
            System.out.println("Error while closing the connection "+ex.getMessage());
        }
    }
}
