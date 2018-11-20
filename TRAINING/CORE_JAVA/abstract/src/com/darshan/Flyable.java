package com.darshan;

public interface Flyable {
        int speed=100;// final and static

       //void fly(); //Abstract and Public Method

         // Default methods were introduced in JAVA -8
        default void fly(){
            System.out.println("Default fly");
        }
        // Interface can have static Method!
        public static void navigate(){
            System.out.println("Navigate");
        }
}
