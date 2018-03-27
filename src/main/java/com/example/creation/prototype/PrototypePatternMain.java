package com.example.creation.prototype;

/**
 * Created by chuliu on 2018/3/27.
 */
public class PrototypePatternMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Account currentAccount = (Account) AccountCache.accountCacheMap.get("CURRENT").clone();
        currentAccount.accountType();
        Account savingAccount = (Account) AccountCache.accountCacheMap.get("SAVING") .clone();
        savingAccount.accountType();
    }
}
