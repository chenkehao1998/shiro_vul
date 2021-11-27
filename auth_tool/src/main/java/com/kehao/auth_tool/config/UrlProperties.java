package com.kehao.auth_tool.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "auth")
public class UrlProperties {
    private List<String> authUrlList;

    public List<String> getAuthUrlList() {
        return authUrlList;
    }

    public void setAuthUrlList(List<String> authUrlList) {
        this.authUrlList = authUrlList;
    }
}
