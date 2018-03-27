package com.example.j2ee.filter_intercept;

import javax.servlet.ServletRequest;

/**
 * Created by chuliu on 2018/3/27.
 */
public interface Filter {

    public void execute(Request request);
}
