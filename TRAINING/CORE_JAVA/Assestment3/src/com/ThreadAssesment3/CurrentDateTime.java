package com.ThreadAssesment3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime implements Runnable{

    public CurrentDateTime() {
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i<10;i++){
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                System.out.println("Current Date Time :" + dateFormat.format(date));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
