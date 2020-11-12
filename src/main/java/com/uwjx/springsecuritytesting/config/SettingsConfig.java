package com.uwjx.springsecuritytesting.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(value = "uwjx")
public class SettingsConfig {
}
