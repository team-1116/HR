package cn.kgc.administrator.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("cn.kgc.administrator.service.mapper")
@EnableEurekaClient
public class AdministratorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdministratorServiceApplication.class, args);
    }

}
