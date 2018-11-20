package com.darshan;
import java.io.*;
import java.time.LocalDate;


public class SerializationDemo {

    // Serialization using readFile
    static void writeFile(String filename)  {
        SerializationDeserialization srl = new SerializationDeserialization("Darshan","Chaudhari",30, LocalDate.of(1990,12,12));

        try{
            File file = new File(filename);
            if(!file.exists())
                file.createNewFile();
            FileOutputStream out = new FileOutputStream(filename);
            ObjectOutputStream objout = new ObjectOutputStream(out);
            objout.writeObject(srl);
            objout.close();

        } catch (IOException e) {
            System.out.println("Unable to create " +e.getMessage());
        }
    }

    // Deserialization using readFile
    static void readFile(String filename){
        try{
            FileInputStream in = new FileInputStream(filename);
            ObjectInputStream oin = new ObjectInputStream(in);
            Object obj = oin.readObject();
            if(obj instanceof SerializationDeserialization){
                System.out.println(obj); //Call toString()
            }

        }catch(IOException|ClassNotFoundException  ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Creating object and serializing it");
        writeFile("d:\\training\\data.emp");
        System.out.println("Reading from file");
        readFile("d:\\training\\data.emp");
    }
}
