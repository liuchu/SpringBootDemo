package com.example.j2ee.filter_intercept;

import javax.servlet.ServletRequest;

/**
 * Created by chuliu on 2018/3/27.
 */
public class FilterManager {

    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(Request request){
        filterChain.execute(request);
    }
}
