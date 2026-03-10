package com.dt.emp.config;

import org.springframework.context.annotation.Configuration;

import java.time.Clock;

@Configuration
public class AppConfig {
    public Clock systemClock(){
        return Clock.systemUTC();
    }
}
