package com.darshan.javapractice;

public class ArrayAverage {
    public static void main(String[] args) {
        double arr[] = {100,12,12.3,200,50};
        double total=0;

        /*for(int i = 0 ; i <arr.length;i++){
            total = total + arr[i];
        }*/

        for (double x:arr){
            total = total + x;
        }

        double average = (total)/arr.length;
        //System.out.println(average);
        System.out.format("The average is: %.3f", average);

    }
}
