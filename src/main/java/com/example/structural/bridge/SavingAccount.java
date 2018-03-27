package com.example.structural.bridge;

/**
 * Created by chuliu on 2018/3/27.
 */
public class SavingAccount implements Account{

    @Override
    public Account openAccount() {
        System.out.println("OPENED: SAVING ACCOUNT ");
        return new SavingAccount();
    }

    @Override
    public void accountType() {
        System.out.println("##It is a SAVING Account##");
    }
}
