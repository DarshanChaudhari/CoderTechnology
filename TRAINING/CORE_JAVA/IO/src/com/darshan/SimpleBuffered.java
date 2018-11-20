package com.darshan;
import java.io.*;

public class SimpleBuffered {
    public static void main(String[] args) {
        String name = null;

        try{
            System.out.println("Enter your name");

            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(reader);
            name = br.readLine();
            System.out.println("Hello " +name);
            //System.err.println("Hello " +name); Use for error message
            br.close();

        } catch (IOException e) {
            System.out.println("Unable to read");
        }


    }
}
