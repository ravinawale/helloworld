package com.devops.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.devops.controller.MainController;

@ComponentScan(basePackages = "com.devops")
public class TestBeanConfig {
	
	@Bean
    public MainController mainController() {
        return new MainController();
    }
}
