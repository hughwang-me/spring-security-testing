package com.uwjx.springsecuritytesting.controller;

import com.uwjx.springsecuritytesting.config.SettingsConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping(value = "test")
public class TestController {

    @Resource
    private SettingsConfig settingsConfig;

    @GetMapping(value = "list")
    public String list(){
        log.warn("TestController list 请求处理中 。。。");


        long accessTokenExpiredTime = settingsConfig.getJwt().getAccessTokenExpireTime();

        long refreshTokenExpiredTime = settingsConfig.getJwt().getRefreshTokenExpireTime();

        log.warn("TestController list accessTokenExpiredTime : {}" , accessTokenExpiredTime);
        log.warn("TestController list refreshTokenExpiredTime : {}" , refreshTokenExpiredTime);

        return "TestController list ok";
    }

    @GetMapping(value = "principal")
    public String principal(){
        log.warn("TestController principal 请求处理中 。。。");
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
    }
}
