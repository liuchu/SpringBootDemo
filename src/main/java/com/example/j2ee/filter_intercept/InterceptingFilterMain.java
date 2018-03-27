package com.example.j2ee.filter_intercept;

import org.springframework.security.web.debug.DebugFilter;

import javax.servlet.ServletRequest;

/**
 * Created by chuliu on 2018/3/27.
 */
public class InterceptingFilterMain {

    public static void main(String[] args) {
        Request request = new Request("A HTTP request");

        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebuggingFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest(request);
    }
}
