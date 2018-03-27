package com.example.j2ee.filter_intercept;

import javax.servlet.ServletRequest;

/**
 * Created by chuliu on 2018/3/27.
 */
public class Target {

    public void execute(Request request){
        System.out.println("Executing request: " + request);
    }
}
