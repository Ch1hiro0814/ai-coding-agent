package com.chihiro.aicoding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chihiro.aicoding.mapper")
public class AiCodingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiCodingApplication.class, args);
    }

}
