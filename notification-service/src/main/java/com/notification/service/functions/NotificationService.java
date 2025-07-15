package com.notification.service.functions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;
import java.util.function.Function;

@Configuration
public class NotificationService {

    @Bean
    public Supplier<String> testing() {
        return () -> "This is testing";
    }
    
    @Bean
    public Function<String, String> testingPost() {
        return input -> "This is testing with input: " + input;
    }
}
