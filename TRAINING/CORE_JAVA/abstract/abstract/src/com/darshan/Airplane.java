package com.darshan;

public class Airplane implements Flyable {

    // This method will display from Airplane fly but if we change the method name to something else then it will display the flyable method
    public void fly(){
        System.out.println("Airplane fly");
    }

    public void flyl(){
        System.out.println("Airplane fly");
    }

    public static void main (String args[]){
        Airplane plane = new Airplane();
 //     Flyable fli = new Flyable(); // Interface cannot be instantiated
        plane.fly();

        Flyable.navigate(); // you can call directly by interface.method name, you cannot call by creating object of class and call it

    }
}
