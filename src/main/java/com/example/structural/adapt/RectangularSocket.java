package com.example.structural.adapt;

/**
 * Created by chuliu on 2018/3/27.
 */
public class RectangularSocket {

    private String rectaStem1;
    private String rectaStem2;

    public void getPower() {
        RectangulerAdapter adapter = new RectangulerAdapter();
        adapter.adapt(rectaStem1, rectaStem2);
    }
}