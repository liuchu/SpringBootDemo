package com.example.structural.bridge;

/**
 * Created by chuliu on 2018/3/27.
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
