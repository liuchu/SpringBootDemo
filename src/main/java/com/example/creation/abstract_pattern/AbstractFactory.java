package com.example.creation.abstract_pattern;

/**
 * Created by chuliu on 2018/3/27.
 */
public abstract class AbstractFactory {
    abstract Bank getBank(String bankName);
    abstract Account getAccount(String accountType);
}