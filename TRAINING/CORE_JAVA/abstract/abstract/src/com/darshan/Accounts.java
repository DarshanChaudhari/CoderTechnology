package com.darshan;

public abstract class Accounts {

    protected int accountNo;
    protected String custName;
    protected double balance;


    public abstract void deposit(double amount);

    public Accounts(int accountNo, String custName, double balance) {
        this.accountNo = accountNo;
        this.custName = custName;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void withdraw(double amount);


}
