package com.uwjx.springsecuritytesting.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController {

    @GetMapping(value = "list")
    public String list(){
        log.warn("Order list 请求处理中 。。。");




        return "list ok";
    }
}
