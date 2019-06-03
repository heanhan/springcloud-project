package com.zhaojh.user;

import com.zhaojh.common.utils.IdWorker;
import com.zhaojh.common.utils.JwtUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringcloudUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudUserApplication.class, args);
    }

    /**
     * 雪花算法
     * @return
     */
    @Bean
    public IdWorker idWorker()
    {
        return new IdWorker();
    }

    /**
     * 使用Bcy
     */
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    /**
     *
     * @return
     */
    @Bean
    public JwtUtil jwtUtil(){
        return new JwtUtil();
    }

}
