package com.example.structural.bridge;

/**
 * Created by chuliu on 2018/3/27.
 */
public class IciciBank extends Bank {

    public IciciBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.print("Open your account with ICICI Bank");
        return account;
    }
}
