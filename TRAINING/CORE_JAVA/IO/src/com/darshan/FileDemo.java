package com.darshan;
import java.io.*;
import java.net.URI;

public class FileDemo {

    public static void main(String[] args) {

            try{

               File file = new File("D:\\Training");
              // File file = new File(URI.create("file :///D:/Training/data"));
                if(file.exists()){
                    System.out.println("It does exists");
                }

                if(file.isDirectory()){
                    System.out.println("Its a directory");
                }
                else{
                    System.out.println("Its not a directory");
                }
                File newFile = new File(file, "data.txt");

                if(newFile.exists()){
                    System.out.println("File is already Exists");
                }
                else{
                    System.out.println("File not exist!");
                    newFile.createNewFile();
                }
            } catch (IOException e) {
                System.out.println("Unable to Create");
            }


        }
    }