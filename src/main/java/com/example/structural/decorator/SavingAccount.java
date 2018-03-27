package com.example.structural.decorator;

/**
 * Created by chuliu on 2018/3/27.
 */
public class SavingAccount implements Account {

    @Override
    public String getTotalBenefits() {
        return "This account has 4% interest rate with per day $5000 withdrwal limit";
    }
}
