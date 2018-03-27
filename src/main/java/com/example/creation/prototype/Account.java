package com.example.creation.prototype;

/**
 * Created by chuliu on 2018/3/27.
 */
public abstract class Account implements Cloneable {

    public Account() {
    }

    abstract public void accountType();

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
