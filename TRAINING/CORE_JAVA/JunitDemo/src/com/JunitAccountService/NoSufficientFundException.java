package com.JunitAccountService;

public class NoSufficientFundException extends RuntimeException {

        public NoSufficientFundException(int accountNo) {

        super("No Sufficenet fund in account." + accountNo);
//        System.out.println("In Sufficient Fund");
    }
}
