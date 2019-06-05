package com.zhaojh.spit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudSpitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSpitApplication.class, args);
    }

}
