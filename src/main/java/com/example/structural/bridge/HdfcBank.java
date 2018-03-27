package com.example.structural.bridge;

/**
 * Created by chuliu on 2018/3/27.
 */
public class HdfcBank extends Bank {

    public HdfcBank(Account account) {
        super(account);
    }
    @Override
    Account openAccount() {
        System.out.print("Open your account with HDFC Bank");
        return account;
    }
}
