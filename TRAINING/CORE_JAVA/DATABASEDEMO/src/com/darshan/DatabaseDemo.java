package com.darshan;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.sql.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class DatabaseDemo {
    public static void main(String[] args) {

        Properties ps = new Properties();

        try{
            ps.load(DatabaseDemo.class.getResourceAsStream("Dbase.properties"));
            System.out.println("DB Driver : "+ ps.getProperty("db.driver"));
            System.out.println("DB name : "+ ps.getProperty("db.name"));
            System.out.println("DB User : "+ ps.getProperty("db.user"));
            System.out.println("DB Password : "+ ps.getProperty("db.password"));
            System.out.println("DB URL: "+ ps.getProperty("db.url"));


        } catch (IOException e) {
            System.out.println("Unable to load the properties" + e.getMessage());
            e.printStackTrace();
        }


    }
}

