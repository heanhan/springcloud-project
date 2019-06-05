package com.zhaojh.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSmsApplication.class, args);
    }

}
