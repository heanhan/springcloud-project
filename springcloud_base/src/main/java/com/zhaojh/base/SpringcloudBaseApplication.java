package com.zhaojh.base;

import com.zhaojh.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringcloudBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudBaseApplication.class, args);
    }

    /**
     * 创建IdWorker雪花算法 bean
     */
    @Bean
    public IdWorker idWorker()
    {
        return new IdWorker();
    }

}
