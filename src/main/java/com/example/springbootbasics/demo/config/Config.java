package com.example.springbootbasics.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean("test")
    public Zorro getZorro() {
        return new Zorro();
    }

    @Bean("nish-45")
    public Integer x() {
        return new Integer(33);
    }

    @Bean("nish-87")
    public Integer y() {
        return new Integer(23);
    }

    @Bean("nish-33")
    public Integer y1() {
        return new Integer(106);
    }
}


