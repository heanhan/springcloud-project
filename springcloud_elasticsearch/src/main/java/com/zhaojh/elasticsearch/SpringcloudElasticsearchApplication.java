package com.zhaojh.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudElasticsearchApplication.class, args);
    }

}
