package com.guo.myestatemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.guo.myestatemanager.dao")
public class EstateManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstateManagementApplication.class, args);
    }

}
