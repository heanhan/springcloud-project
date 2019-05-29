package com.zhaojh.article;

import com.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
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
