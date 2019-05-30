package com.zhaojh.user.config;

import com.zhaojh.user.intercepter.JwtIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class ApplicationConfig extends WebMvcConfigurationSupport {

    @Autowired
    private JwtIntercepter jwtIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwtIntercepter).
                addPathPatterns("/**").
                excludePathPatterns("/**/login").excludePathPatterns("/**/register");
    }

}
