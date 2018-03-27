package com.example.creation.singleton;

/**
 * Created by chuliu on 2018/3/27.
 */
public class SingletonClassEager {

    private static SingletonClassEager instance = new SingletonClassEager();

    public static SingletonClassEager getInstance(){
        return instance;
    }
}
