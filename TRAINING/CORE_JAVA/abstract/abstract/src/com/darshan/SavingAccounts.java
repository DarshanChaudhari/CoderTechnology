package com.darshan;

public class SavingAccounts extends Accounts {


    public SavingAccounts(int accountNo, String custName, double balance) {
        super(accountNo, custName, balance);
    }

    @Override
    public void deposit(double amount) {
        super.balance = balance + amount;
        System.out.println("Dear " +custName + ". Your account is credited with " + amount+ ".Your available balance is Rs." + balance + ".");
    }

    @Override
    public void withdraw(double amount) {
        super.balance = balance - amount;
        System.out.println("Dear " +custName + ". Your account is debited with " + amount+ ".Your available balance is Rs." + balance + ".");
    }


}
