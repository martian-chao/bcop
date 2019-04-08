package com.cars;

import com.cars.filter.AuthFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by 孔垂云 on 2019/3/25.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GatewayServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayServerApplication.class, args);
    }

    @Bean
    public AuthFilter authFilter() {
        return new AuthFilter();
    }
}
