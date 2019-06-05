package com.zhaojh.gathering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudGatheringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatheringApplication.class, args);
    }

}
