package com.darshan.inheritance;

public class InterestCalculator {
    protected double p, r, t;

    public InterestCalculator(double p,double r, double t){
        this.p = p;
        this.r = r;
        this.t =t;
    }


    public double calculate(){
        return  (r * t * p) / 100;
    }

}

