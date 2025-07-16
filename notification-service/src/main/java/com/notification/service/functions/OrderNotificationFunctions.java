package com.notification.service.functions;

import com.notification.service.dto.OrderDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class OrderNotificationFunctions {

    @Bean
    public Function<OrderDetail,String> orderEventReceiver() {
        return (orderDetail -> {
            //process
            System.out.println("Sending noitifcation to user");
            logicToSendEmailAndMessageToUser(orderDetail.getEmail(), orderDetail.getUserPhone());
            return orderDetail.getOrderId();
        });
    }

    private void logicToSendEmailAndMessageToUser(String email, String userPhone) {
        System.out.println("Sending email to: " + email);
        System.out.println("Sending text to: " + userPhone);
        System.out.println("Notification sent to user");
        System.out.println("-------------------------");
    }
}
