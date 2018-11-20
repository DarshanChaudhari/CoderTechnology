package com.darshan.app;
import com.darshan.logic.Account;

public class HashCodeObjectDemo {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 =a1;

        System.out.println("Hashcode for a1 : " + a1.hashCode());
        System.out.println("Hashcode for a2 : " + a2.hashCode());
        System.out.println("Hashcode for a3 : " + a3.hashCode());

        System.out.println("\nToString of object a1 : " + a1.toString());
        System.out.println("ToString of object a2 : " + a2.toString());
        System.out.println("ToString of object a3 : " + a3.toString());

        System.out.println("To String " + Integer.toHexString(255));
        System.out.println("To String " + Integer.toOctalString(255));
        System.out.println("To String " + Integer.toBinaryString(255));
        System.out.println(Character.isDigit('9'));
    }
}
