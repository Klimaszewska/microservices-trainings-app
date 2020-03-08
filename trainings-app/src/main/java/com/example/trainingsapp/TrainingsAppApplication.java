package com.example.trainingsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TrainingsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainingsAppApplication.class, args);
    }

}
