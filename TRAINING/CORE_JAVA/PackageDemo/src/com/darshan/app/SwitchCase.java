package com.darshan.app;

public class SwitchCase {
    public static void main(String[] args) {
        int numOfAngles = 3;

        switch(numOfAngles){
            case 3 :
                System.out.println("Triangle");
                break;
            case 4 :
                System.out.println("Rectangle");
                break;
            case 5 :
                System.out.println("Pentagon");
                break;
            default:
                System.out.println("Unknown Shape");
        }

    }
}
