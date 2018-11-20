package com.JunitAssessment3;

public class SalaryCalculator {


    private static final double TAX_FREE = 0;

    public SalaryCalculator() {
    }

    public double calcTax(double salary, double taxRate){
        double taxableSal = salary - TAX_FREE;
        if(taxableSal > 0){
            return taxableSal *taxRate;
        }
        else {
            return 0;
        }
    }
}
