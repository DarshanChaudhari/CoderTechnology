package com.darshan;

public class StringExamples {
    public static void main(String[] args) {
        String name1 = "darshan"; // Create new object, caused not previous object found
        String name2 = "darshan"; // Re-uses previous object

        String name3 = new String("mahendra"); // forces new object


        System.out.println("Is name1 and name2 are same ?" + (name1==name2));
        System.out.println("Is name1 and name2 are same ?" + (name1==name3));

        name1 = name1.toUpperCase(); //
        System.out.println("Is name1 and name2 are same ?" + (name1==name2));

        String temp = name2.toUpperCase();
        System.out.println(name2 + " " + temp);
    }
}
