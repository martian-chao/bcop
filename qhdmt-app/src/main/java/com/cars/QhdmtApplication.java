package com.cars;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 孔垂云 on 2019/3/25.
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
@RefreshScope
public class QhdmtApplication {
    public static void main(String[] args) {
        SpringApplication.run(QhdmtApplication.class, args);
    }


    @Value("${test}")
    String test;
    @RequestMapping(value = "/getParam")
    public String getParam() {
        return test;
    }
}
