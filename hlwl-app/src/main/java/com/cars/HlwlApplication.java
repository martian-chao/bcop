package com.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by 孔垂云 on 2019/3/25.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class HlwlApplication {
    public static void main(String[] args) {
        SpringApplication.run(HlwlApplication.class, args);
    }
}
