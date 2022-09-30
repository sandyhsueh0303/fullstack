package com.example.demo_fullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo_fullstack.student")
public class DemoFullstackApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFullstackApplication.class, args);
    }

}
