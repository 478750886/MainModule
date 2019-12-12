package com.cjtc.userclientribbon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class UserClientRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserClientRibbonApplication.class, args);
        log.info("用户消费者服务启动成功");
    }




}
