package com.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 孔垂云 on 2019/3/25.
 */
@SpringBootApplication
@EnableEurekaClient
public class DzdjServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DzdjServiceApplication.class, args);
    }
}
