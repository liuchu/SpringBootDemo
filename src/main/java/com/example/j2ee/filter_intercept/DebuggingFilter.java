package com.example.j2ee.filter_intercept;

import javax.servlet.ServletRequest;

/**
 * Created by chuliu on 2018/3/27.
 */
public class DebuggingFilter implements Filter {

    public void execute(Request request)  {
        //Do some filter processing here, such as
        // displaying request parameters
        System.out.println("request log: " + request);
    }
}
