package com.ThreadAssesment3;

public class MainThreadCall {

    public static void main(String[] args) {

        // Creating Object of Current Date Time class
        CurrentDateTime mydate1 = new CurrentDateTime();
        CurrentDateTime mydate2 = new CurrentDateTime();


        // creating a thread object
        Thread th1 = new Thread(mydate1);
        Thread th2 = new Thread(mydate2);

        // Launch the thread
        th1.start();
        th2.start();
    }
}
