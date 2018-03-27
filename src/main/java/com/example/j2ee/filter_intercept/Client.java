package com.example.j2ee.filter_intercept;

import javax.servlet.ServletRequest;

/**
 * Created by chuliu on 2018/3/27.
 */
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(Request request){
        filterManager.filterRequest(request);
    }
}
