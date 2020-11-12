package com.uwjx.springsecuritytesting.controller;

import com.uwjx.springsecuritytesting.domain.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
@RequestMapping(value = "user")
public class UserController {

    @PostMapping(value = "add")
    public String add(@Valid  @RequestBody UserDto userDto){
        log.warn("UserController add 请求处理中 。。。");




        return "UserController add ok";
    }
}
