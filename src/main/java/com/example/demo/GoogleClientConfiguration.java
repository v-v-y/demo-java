package com.example.demo;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class GoogleClientConfiguration {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }
}
