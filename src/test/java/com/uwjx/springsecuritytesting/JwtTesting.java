package com.uwjx.springsecuritytesting;

import com.uwjx.springsecuritytesting.util.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Slf4j
public class JwtTesting {

    @Test
    public void run(){
        JwtUtil jwtUtil = new JwtUtil();

        Collection<? extends GrantedAuthority> authorities = new HashSet<>();

        UserDetails userDetails = new User("wanghuan" , "pwd",authorities);
        String token = jwtUtil.createJWTToken(userDetails , 1000);
        log.warn("token {}" , token);
    }
}
