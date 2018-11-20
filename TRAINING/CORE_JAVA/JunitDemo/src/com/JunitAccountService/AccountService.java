package com.JunitAccountService;

import java.util.*;

public class AccountService {

    private Map<Integer,Account> accounts = new HashMap<Integer,Account>();

    public AccountService(){
        /*Map<Integer,Account> accounts = new HashMap<Integer, Account>();
        accounts.put(1001,new Account("Abhishek",12300.2));
        accounts.put(1002,new Account("Amitabh",340080.12));
        accounts.put(1003,new Account("Jaya",123000)); */

    }

    /*public AccountService (Map<Integer,Account> accounts){
        this.accounts=accounts;
    }*/

    public void setData(Map<Integer,Account> accounts){
        this.accounts=accounts;
    }


    public Account findAccount(int accountNo){
        if(accounts.containsKey(accountNo)){
            return accounts.get(accountNo);
        }
        else throw new RuntimeException("Account No "+accountNo+" does not exists!");
    }

    public void withdraw(int accountNo, double amount)  {
        Account acc = accounts.get(accountNo);
        if(acc.getAmount()<amount) {
            throw new NoSufficientFundException(accountNo);
        }
        else {
            acc.setAmount(acc.getAmount() - amount);
            System.out.println("Current Balance after withdrawal");
        }
    }

    public void deposit(int accountNo,double amount){
        Account account = findAccount(accountNo);
        account.setAmount(account.getAmount()+amount);
    }
}
