package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
	1、使用nacos作为配置中心，对配置文件进行统一管理
	 1）、引入依赖nacos-config
	 2）、创建一个bootstrap.properties文件
	 3）、在nacos的配置列表中，配置一个数据集 Data Id（应用名.properties）
	 4）、给应用名.properties中添加需要的配置
	 5）、在要使用的类中，添加自动刷新配置注解 @RefreshScope（动态刷新配置）
	 							   @Value("${配置名}") 获取对应的配置
	 6）、配置中心和配置文件使用了相同的配置项，那么项目会优先使用配置中心的配置


 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
