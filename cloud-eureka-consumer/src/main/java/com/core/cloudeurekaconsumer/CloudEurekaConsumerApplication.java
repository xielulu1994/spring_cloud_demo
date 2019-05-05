package com.core.cloudeurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudEurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaConsumerApplication.class, args);
    }

}
