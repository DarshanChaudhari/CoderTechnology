package com.darshan;

public class SavingAccounts extends Accounts {


    public SavingAccounts(int accountNo, String custName, double balance) {
        super(accountNo, custName, balance);
    }

    @Override
    public void deposit(double amount) {
        super.balance = balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        super.balance = balance - amount;
        System.out.println("Dear Customer the Amount Rs . " + amount+ " is debited from your account  and the remaining balance is "+balance );
    }


}
