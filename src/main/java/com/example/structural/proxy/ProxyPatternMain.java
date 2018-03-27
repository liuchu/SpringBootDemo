package com.example.structural.proxy;

/**
 * Created by chuliu on 2018/3/27.
 */
public class ProxyPatternMain {

    /**
     * @param args: arguments to JVM
     */
    public static void main(String[] args) {
        Shape shape = new ProxyShape("Cricle");
        //shape going to draw
        shape.draw();
    }

}
