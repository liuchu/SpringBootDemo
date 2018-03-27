package com.example.dao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by chuliu on 2018/3/20.
 */
@Component
@ConfigurationProperties(prefix="database")
public class DatabaseSettings {

    private String dbname;

    private String dburl;

    // ... getters and setters


    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getDburl() {
        return dburl;
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }
}