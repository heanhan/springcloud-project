package com.zhaojh.labels;

import com.zhaojh.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringcloudLabelsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudLabelsApplication.class, args);
    }


    /**
     * 雪花算法
     */
    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }
}
