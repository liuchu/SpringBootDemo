package com.example.creation.abstract_pattern;

/**
 * Created by chuliu on 2018/3/27.
 */
public class AccountFactory extends AbstractFactory {

    final String CURRENT_ACCOUNT = "CURRENT";
    final String SAVING_ACCOUNT  = "SAVING";

    @Override
    Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Account getAccount(String accountType){
        if(CURRENT_ACCOUNT.equals(accountType)) {
            return new CurrentAccount();
        }else if(SAVING_ACCOUNT.equals(accountType)){
            return new SavingAccount();
        }
        return null;
    }

}