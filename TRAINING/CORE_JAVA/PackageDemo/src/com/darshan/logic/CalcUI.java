package com.darshan.logic;

public class CalcUI {

    public static void main(String[] args) {

        // c is reference variable
        // new instruct to build new object of type 'Calculator' class
        // then store its reference in variable 'c'
        Calculator c = new Calculator();
        //Another variable
        Calculator d = c; // c and d both refering to same object
        System.out.println(c.doSum(12.9,99.1));
    }
}
