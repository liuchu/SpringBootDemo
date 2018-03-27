package com.example.j2ee.filter_intercept;

import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chuliu on 2018/3/27.
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(Request request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
