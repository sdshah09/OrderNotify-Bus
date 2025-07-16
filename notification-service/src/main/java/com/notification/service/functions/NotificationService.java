package com.notification.service.functions;

import com.notification.service.dto.OrderInformation;
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
    public Function<String, String> sayHello() {
        return (message) -> "Hello how are you? " + message;
    }

    @Bean
    public Function<OrderInformation, String> sendOrderNotification() {
        return (orderInformation) -> {
            sendNotification(orderInformation);
            System.out.println(orderInformation.getOrderId());
            System.out.println(orderInformation.getCreatedAt());
            System.out.println(orderInformation.getEmailId());
            System.out.println(orderInformation.getUserPhone());
            System.out.println(orderInformation.getUserId());
            return orderInformation.getUserPhone();
        };
    }
    private void sendNotification(OrderInformation orderInformation) {

    }

}
