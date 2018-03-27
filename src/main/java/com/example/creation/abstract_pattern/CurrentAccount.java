package com.example.creation.abstract_pattern;

/**
 * Created by chuliu on 2018/3/27.
 */
public class CurrentAccount implements Account {

    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }

}