package com.darshan;

public class Main {

    public static void main(String[] args) {
	    // Data Types widening

        byte byteVar = 16;
        int intVar = byteVar;

        float floatVar = 12.0F;
        long longVar = intVar;
        floatVar = longVar;
        double doubleVar = floatVar;

        // Data Types Narrowing
        int intVar2 = 16;
        // byte bytevar1 = intVar2;

        // Unicode
        char charVal = '\u0041';
        intVar = charVal;
        System.out.println(intVar);

        // Type Casting Topic. Another name Explicit

        // Loss of precision using Integer

        int n = 22/7;
        System.out.println(n);

        // Loss of precision using Float

        int f = 22/7;
       // System.out.print(f);
        // No Loss of precision

        float f1 = (float)22/7;
        System.out.println(f1);

        double d = 22/7.0;
        System.out.println(d);

        int k=10;
        System.out.println(k++);

        int k1=10;
        System.out.println(++k1);

    }
}

