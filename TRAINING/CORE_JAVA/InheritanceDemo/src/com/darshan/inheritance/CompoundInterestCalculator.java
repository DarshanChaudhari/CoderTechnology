package com.darshan.inheritance;

public class CompoundInterestCalculator extends InterestCalculator {

    public CompoundInterestCalculator(double principal, double rate, int duration){
        super (principal,rate,duration);
    }

    public double calculate(){
        return p *(Math.pow((1 + r / 100), t));
    }
}
