package com.young.xshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.young.xshop.mapper")
public class  XshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(XshopApplication.class, args);
    }

}
