package com.dixn.manage_device_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient // 配置本应用将使用服务注册和服务发现
@EnableHystrix
public class DeviceServiceFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeviceServiceFeignApplication.class, args);
    }
}
