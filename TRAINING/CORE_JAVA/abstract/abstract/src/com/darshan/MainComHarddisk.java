package com.darshan;

public class MainComHarddisk {
    public static void main(String[] args) {

        // Type of variable could be class or interface or primitive
        // Variable of base type can hold object of derived type-- This is polymorphic object in java
        Computer comp = new Computer(new Monitor(), new HardDisk());
    }
}
