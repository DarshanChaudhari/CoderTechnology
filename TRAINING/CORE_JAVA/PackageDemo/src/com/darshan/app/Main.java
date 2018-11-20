package com.darshan.app;
import com.darshan.logic.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        double k = c.doSum(12.24,50.55);
        System.out.println("Answer : " +k);

    }

}
