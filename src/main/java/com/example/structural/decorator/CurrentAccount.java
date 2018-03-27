package com.example.structural.decorator;

/**
 * Created by chuliu on 2018/3/27.
 */
public class CurrentAccount implements Account {

    @Override
    public String getTotalBenefits() {
        return "There is no withdrwal limit for current account";
    }
}
