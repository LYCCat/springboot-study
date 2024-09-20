package com.example.access_count_;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.access_count_.mapper")
public class AccessCountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccessCountApplication.class, args);
    }

}
