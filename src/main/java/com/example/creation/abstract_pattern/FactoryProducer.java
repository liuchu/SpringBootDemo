package com.example.creation.abstract_pattern;

/**
 * Created by chuliu on 2018/3/27.
 */
public class FactoryProducer {

    private final static String BANK = "BANK";
    private final static String ACCOUNT = "ACCOUNT";

    public AbstractFactory getFactory(String factoryType){
        if(BANK.equalsIgnoreCase(factoryType)){
            return new BankFactory();
        }else if(ACCOUNT.equalsIgnoreCase(factoryType)){
            return new AccountFactory();
        }
        return null;
    }
}
