package com.zhaojh.friend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudFriendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFriendApplication.class, args);
    }

}
