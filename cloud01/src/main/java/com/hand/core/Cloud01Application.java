package com.hand.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class Cloud01Application {

    public static void main(String[] args) {
        SpringApplication.run(Cloud01Application.class, args);
    }

}
