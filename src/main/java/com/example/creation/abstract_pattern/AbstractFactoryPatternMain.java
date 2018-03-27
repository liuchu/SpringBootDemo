package com.example.creation.abstract_pattern;

/**
 * Created by chuliu on 2018/3/27.
 */
public class AbstractFactoryPatternMain {

    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();

        AccountFactory accountFactory = (AccountFactory) factoryProducer.getFactory("ACCOUNT");
        Account account= accountFactory.getAccount("SAVING");
        account.accountType();

        BankFactory bankFactory = (BankFactory) factoryProducer.getFactory("BANK");
        Bank bank = bankFactory.getBank("Yes");
        bank.bankName();

    }
}
