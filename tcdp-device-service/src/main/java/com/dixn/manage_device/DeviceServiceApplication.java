package com.dixn.manage_device;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EntityScan("com.dixn.model.domain.device")//扫描实体类
@ComponentScan(basePackages={"com.dixn.api"})//扫描接口
@ComponentScan(basePackages={"com.dixn.common"})//扫描common包下的类
@ComponentScan(basePackages={"com.dixn.manage_device"})//扫描本项目下的所有类
public class DeviceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeviceServiceApplication.class, args);
    }
}
