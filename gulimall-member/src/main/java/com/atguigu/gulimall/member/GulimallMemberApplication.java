package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
    1、使用open-feign远程调用别的服务，首先要先引入open-feign的依赖
    2、写好接口后，告诉Springcloud这个接口需要调用远程服务
        声明接口的方法都是调用远程服务的哪个请求，方法名，全路径
    3、EnableFeignClients开启远程调用功能,basePackages这里要写注册得到feign的接口路径
 */
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
