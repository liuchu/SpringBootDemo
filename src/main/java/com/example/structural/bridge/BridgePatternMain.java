package com.example.structural.bridge;

/**
 * Created by chuliu on 2018/3/27.
 */
public class BridgePatternMain {

    public static void main(String[] args) {
        Bank icici = new IciciBank(new CurrentAccount());
        Account current = icici.openAccount();
        current.accountType();

        Bank hdfc = new HdfcBank(new SavingAccount());
        Account saving = hdfc.openAccount();
        saving.accountType();
    }

}
