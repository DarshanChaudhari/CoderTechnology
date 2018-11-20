package com.darshan.javapractice;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        System.out.println("Enter the number ");
        int i;

        Scanner scaninp = new Scanner(System.in);
        i = scaninp.nextInt();

        if (i%2==0){
            System.out.println("The entered number is Even");
        }
        else{
            System.out.println("The entered number is Odd");
        }
    }
}
