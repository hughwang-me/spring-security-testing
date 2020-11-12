package com.uwjx.springsecuritytesting.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "account")
public class AccountController {


    @GetMapping(value = "principal")
    public String principal(){
        log.warn("account principal 请求处理中 。。。");
        log.warn("结果:{}" , JSON.toJSONString(SecurityContextHolder.getContext().getAuthentication()));
        return JSON.toJSONString(SecurityContextHolder.getContext().getAuthentication());
    }

    @GetMapping(value = "principal2")
    public String principal2(Authentication authentication){
        log.warn("account principal 请求处理中 。。。");
        log.warn("结果:{}" , JSON.toJSONString(authentication.getPrincipal()));
        return JSON.toJSONString(SecurityContextHolder.getContext().getAuthentication());
    }
}
