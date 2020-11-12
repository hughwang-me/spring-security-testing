package com.uwjx.springsecuritytesting.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "test")
public class TestController {

    @GetMapping(value = "list")
    public String list(){
        log.warn("TestController list 请求处理中 。。。");




        return "TestController list ok";
    }

    @GetMapping(value = "principal")
    public String principal(){
        log.warn("TestController principal 请求处理中 。。。");
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
    }
}
