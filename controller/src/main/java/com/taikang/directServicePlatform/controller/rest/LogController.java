package com.taikang.directServicePlatform.controller.rest;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class LogController {

    @GetMapping("/test")
    @SentinelResource(value = "hello", blockHandler = "testBlockHandler", fallback = "fallbackHandler")
    public void test(){
        log.warn("hello world");
    }

    public void testBlockHandler(BlockException e){
        log.warn("block");
    }

    public void fallbackHandler(Throwable e){
        log.warn("fallback");
    }
}
