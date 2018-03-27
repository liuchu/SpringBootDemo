package com.example.creation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chuliu on 2018/3/27.
 */
class AccountCache {

    static Map<String,Account> accountCacheMap = new HashMap<String,Account>();

    static{
        Account currentAccount = new CurrentAccount();
        Account savingAccount = new SavingAccount();
        accountCacheMap.put("SAVING", savingAccount);
        accountCacheMap.put("CURRENT", currentAccount);
    }
}
