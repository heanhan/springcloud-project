package com.zhaojh.spit;

import com.zhaojh.common.utils.IdWorker;
import com.zhaojh.common.utils.JwtUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudSpitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSpitApplication.class, args);
    }


    @Bean
    public JwtUtil jwtUtil(){
        return new JwtUtil();
    }

    /**
     * 雪花算法
     * @return
     */
    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }

}
