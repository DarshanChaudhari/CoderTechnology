package com.darshan.app;

public class ForLoop {

    public static void main(String[] args) {
        int nums[] = {10,20,30,40,50};
        System.out.println("\nNormal FOR LOOP");
        for(int i = 0 ; i <nums.length;i++){
            System.out.println("Number : " + nums[i]);
        }


        System.out.println("\nENHANCED FOR LOOP");
        // Get one value of type INT from array "nums"
        // Loop terminates after LAST element
        for(int x:nums){
            System.out.println("Number : " + x);
        }
    }
}


