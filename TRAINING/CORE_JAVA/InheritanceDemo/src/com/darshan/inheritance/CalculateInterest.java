package com.darshan.inheritance;
public class CalculateInterest {
    public static void main(String[] args) {
        CompoundInterestCalculator calc = new CompoundInterestCalculator(34000,11.2,60)   ;
        double interest = calc.calculate();

        System.out.println("Compound Interest : " + interest);

        InterestCalculator Simplecalc = new InterestCalculator(34000,11.2,60)   ;
        double interest1 = Simplecalc.calculate();

        System.out.println("Simple Interest : " + interest1);
    }

}
