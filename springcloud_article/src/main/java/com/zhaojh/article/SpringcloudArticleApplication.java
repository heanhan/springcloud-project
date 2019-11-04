package com.zhaojh.article;

import com.zhaojh.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;


/**
 * @SpringCloudApplication  注解 标识开始Spring Cloud 的
 * 它包含了  以下三个注解。
 * @SpringBootApplication
 * @EnableDiscoveryClient
 * @EnableCircuitBreaker
 */
@SpringCloudApplication
@EnableEurekaClient
public class SpringcloudArticleApplication implements ApplicationListener <ContextRefreshedEvent>{

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

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();//获取上下文
//        applicationContext.getBean("");//通过benan的名字获取容器中的bean
    }
}
