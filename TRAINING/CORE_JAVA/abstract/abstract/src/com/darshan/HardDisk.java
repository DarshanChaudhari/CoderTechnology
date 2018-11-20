package com.darshan;

public class HardDisk implements Storage {


    public void read(){
        System.out.println("Read from Storage");
    }

    @Override
    public void write() {
        System.out.println("Write to Storage");
    }
}
