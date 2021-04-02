package com.study.provideserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProvideServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvideServerApplication.class, args);
    }

}
