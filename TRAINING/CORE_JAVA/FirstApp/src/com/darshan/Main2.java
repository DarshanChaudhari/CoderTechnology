package com.darshan;

public class Main2 {

    public static void main (String args []){

        int num = 12;
        boolean isPrime = true;
        for (int i = 2; i<num/2;i++)
            if (num%i==0){
                isPrime=false;
                break;
        }

        if(isPrime)
            System.out.println(num + " is prime number");
        else
            System.out.println(num + " is not prime number");


    }


        }

