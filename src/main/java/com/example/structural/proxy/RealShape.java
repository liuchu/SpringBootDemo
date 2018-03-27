package com.example.structural.proxy;

/**
 * Created by chuliu on 2018/3/27.
 */
public class RealShape implements Shape {

    private String shapeName;

    public RealShape(String shapeName){
        this.shapeName = shapeName;
    }


    @Override
    public void draw() {
        System.out.println("Drawing Shape " + shapeName);
    }
}
