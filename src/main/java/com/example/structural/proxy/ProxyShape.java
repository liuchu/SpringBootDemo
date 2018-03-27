package com.example.structural.proxy;

/**
 * Created by chuliu on 2018/3/27.
 */
public class ProxyShape implements Shape {

    private RealShape realShape;
    private String shapeName;

    public ProxyShape(String shapeName){
        this.shapeName = shapeName;
    }

    @Override
    public void draw() {
        if(realShape == null){
            realShape = new RealShape(shapeName);
        }
        realShape.draw();
    }
}
