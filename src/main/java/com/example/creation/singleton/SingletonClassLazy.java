package com.example.creation.singleton;

/**
 * Created by chuliu on 2018/3/27.
 */
public class SingletonClassLazy {

    private static SingletonClassLazy instance = null;

    public SingletonClassLazy() {
    }

    public static SingletonClassLazy getInstance() {

        if (instance == null) {
            synchronized (SingletonClassLazy.class) {
                if (instance == null) {
                    instance = new SingletonClassLazy();
                }
            }

        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello Dinesh on Java!!!");
    }
}
