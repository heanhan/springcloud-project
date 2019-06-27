package com.zhaojh.web.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Collections;

/**
 *  @Author: zhaojh
 *  @Date: 2019/6/27 20:36
 *  @Description: 使用zuul解决请求跨域问题
 * 在配置文件中配置允许的跨域头后  注入CorsFilter
 * 这样我们就完成了跨域，但需要注意如果在最外层的服务网关配置了跨域，那服务自身就不能再进行跨域处理否则会引发冲突
 */
@Configuration
public class CrosConfig {

    @Bean
    public CorsFilter crosFilter(){
        final UrlBasedCorsConfigurationSource  urlBasedCorsConfigurationSource= new UrlBasedCorsConfigurationSource();
        final CorsConfiguration corsConfiguration=new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);//yunxucookies 进行跨域

        /**
         * 允许向该服务器提交请求的URI,*表示全部允许，在springMVC中如果设置成*
         * 会自动转换成请求头中Origin
         */
        corsConfiguration.setAllowedOrigins(Collections.singletonList("*"));

        corsConfiguration.setAllowedHeaders(Collections.singletonList("*"));//允许访问的头信息，*代表所有
        corsConfiguration.setMaxAge(18000L);//预检请求的方法，*表示全部允许
        corsConfiguration.addAllowedMethod("*");//允许请求所有的方法
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);


    }
}
