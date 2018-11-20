package com.darshan.inheritance;

public class MainOverloading {

    public static void main(String[] args) {
        System.out.println("Main method");
        MainOverloading m = new MainOverloading();
        m.main(35);

    }

    public static void main() {
        System.out.println("Overload method");
    }

    public static void main(int x){
        System.out.println(x);
    }
}
