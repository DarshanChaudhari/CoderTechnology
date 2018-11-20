package com.darshan;

public class Transactions {

   public void fundTransfer(Accounts fromAccount, Accounts toAccount, double amount){
       fromAccount.withdraw(amount);
       toAccount.deposit(amount);
   }

   public void payBill(Accounts fromAccount, Accounts toAccount, double amount){
       fromAccount.withdraw(amount);
    }

    public static void main(String[] args) {
       SavingAccounts sa = new SavingAccounts(1254568,"Darshan",5000);
       CurrentAccounts ca = new CurrentAccounts(56458,"Chaudhari",2000);
       Transactions ta = new Transactions();

       ta.fundTransfer(sa, ca,1000);

    }
}
