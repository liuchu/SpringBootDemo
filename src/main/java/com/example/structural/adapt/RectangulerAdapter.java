package com.example.structural.adapt;

/**
 * Created by chuliu on 2018/3/27.
 */
public class RectangulerAdapter {

    private CylindricalSocket socket = new CylindricalSocket();

    public void adapt(String rectaStem1, String rectaStem2) {
        //some conversion logic
        String cylinStem1 = rectaStem1;
        String cylinStem2 = rectaStem2;
        socket.supply(cylinStem1, cylinStem2);
    }
}
