package com.zhaojh.spit.config;

//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import com.zhaojh.spit.intercepter.JwtIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 *  注册自定义的拦截器
 */
@Component
public class WebConfig extends WebMvcConfigurationSupport {

    @Autowired
    private JwtIntercepter  jwtIntercepter;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwtIntercepter)
                .addPathPatterns("/**")
                .excludePathPatterns("/**/login");
    }


}
