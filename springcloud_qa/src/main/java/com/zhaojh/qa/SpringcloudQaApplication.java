package com.zhaojh.qa;

import com.zhaojh.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
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
