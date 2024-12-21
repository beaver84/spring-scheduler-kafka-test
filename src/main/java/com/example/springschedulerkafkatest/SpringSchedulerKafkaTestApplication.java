package com.example.springschedulerkafkatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringSchedulerKafkaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSchedulerKafkaTestApplication.class, args);
    }

}
