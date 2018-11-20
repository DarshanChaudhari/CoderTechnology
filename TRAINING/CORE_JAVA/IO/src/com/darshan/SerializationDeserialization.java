package com.darshan;
import java.io.Serializable;
import  java.time.LocalDate;

public class SerializationDeserialization implements Serializable {
    private String firstName, lastName;
    private int age;
    private LocalDate joiningDate;


    public SerializationDeserialization(String firstName,String lastName, int age, LocalDate joiningDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age= age;
        this.joiningDate= joiningDate;
    }


    @Override
    public String toString() {
        return "SerializationDeserialization{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", joiningDate=" + joiningDate +
                '}';
    }
}
