package com.zhaojh.qa;

import com.zhaojh.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


/**
 * @EnableEurekaClient   与 @EnableDiscoveryClient  区别
 * @EnableEurekaClient 适用于注册中心是Eureka ,@EnableDiscoveryClient 注册中部局限于eureka ,还有zookeeper的注册中心
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class SpringcloudQaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudQaApplication.class, args);
    }

    /**
     * 雪花算法
     */
    @Bean
    public IdWorker idworker(){
        return new IdWorker();
    }


}
