package com.example.apollodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
//apollo服务为apollo-quick-start-1.8.0；
public class ApollodemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApollodemoApplication.class, args);
    }
}
