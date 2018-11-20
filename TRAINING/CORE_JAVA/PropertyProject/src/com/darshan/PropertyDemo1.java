package com.darshan;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo1 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.name"));

        Properties ps = new Properties();

        try{
            ps.load(PropertyDemo1.class.getResourceAsStream("app.properties"));
            System.out.println("DB Name : "+ ps.getProperty("db.name"));
            System.out.println("app name : "+ ps.getProperty("app.name"));
            System.out.println("app name :" + ps.setProperty("app.name","My Difficult App"));

            ps.setProperty("db.port","1257");
            ps.store(new FileOutputStream("app.properties"),"Added new properties");



        } catch (IOException e) {
            System.out.println("Unable to load the properties" + e.getMessage());
            e.printStackTrace();
        }


    }
}
