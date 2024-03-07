package com.spring.explorer.exploringspring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="curency-service")
@Component
public class CurrencyConfiguration {
    private String url;
    private String username;
    private String key;

    public String getUrl(){
        return url;
    }
    public String getName(){
        return username;
    }
    public String getKey(){
        return key;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setKey(String key) {
        this.key = key;
    }
}
