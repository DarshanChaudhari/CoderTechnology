package com.darshan;
import java.util.Scanner;
public class ScannerExample {

    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter you name");

            String name = scn.nextLine();

            System.out.println("Enter your age");
            int age = scn.nextInt();

            System.out.println("Hello " + name + " you are " + age);

        }
    }
