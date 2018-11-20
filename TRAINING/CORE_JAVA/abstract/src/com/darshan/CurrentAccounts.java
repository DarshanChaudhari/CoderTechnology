package com.darshan;

public class CurrentAccounts extends Accounts {
    public CurrentAccounts(int accountNo, String custName, double balance) {
        super(accountNo, custName, balance);
    }

    @Override
    public void deposit(double amount) {
        super.balance = balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        super.balance = balance - amount;
    }
}
