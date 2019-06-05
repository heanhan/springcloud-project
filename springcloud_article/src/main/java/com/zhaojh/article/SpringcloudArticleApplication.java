package com.zhaojh.article;

import com.zhaojh.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudArticleApplication.class, args);
    }

    /**
     * 雪花算法
     */
    @Bean
    public IdWorker idworker(){
        return new IdWorker();
    }

}
