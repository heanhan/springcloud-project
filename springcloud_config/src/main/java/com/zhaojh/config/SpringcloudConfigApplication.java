package com.zhaojh.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @EnableEurekaClient  标注为eureka的客户端
 * @EnableConfigServer  开启config的服务
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class SpringcloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigApplication.class, args);
    }

}
