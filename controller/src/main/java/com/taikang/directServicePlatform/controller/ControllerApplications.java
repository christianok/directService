package com.taikang.directServicePlatform.controller;

import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

/**
 * @author
 * @since 2020/04/01
 */
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class ControllerApplications {
    public static void main(String[] args) {
        SpringApplication.run(ControllerApplications.class, args);
    }
}
