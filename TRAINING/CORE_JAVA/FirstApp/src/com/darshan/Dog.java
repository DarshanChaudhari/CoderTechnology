package com.darshan;

public class Dog {

    // Instance Variables

    private String breed;
    private String size;
    private  int age;
    private  String color;

    // No-Arg construction (Use same name as ClassName)
    public Dog(){

        breed="Indian";
        size = "Small";
        age=1;
    }
    // Parameterized Constructor
    public Dog(String breed,String size, int age){
        // Use ' this ' to distinguish instance variable from local variables
        this.size = size;
        this.breed = breed;
        this.age=age;
    }

    public String getInfo(){

        return ("\tBreed :: " + breed+ " \n\tSize :: " + size+" \n\tAge :: " + age+ " \n\tColor :: " + color);
    }
}
