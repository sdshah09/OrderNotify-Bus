package com.order.service.order_service.controllers;

import com.order.service.order_service.OrderDetail;
import com.order.service.order_service.services.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping
    public ResponseEntity<?> createOrder() {
        // order create logic
        OrderDetail order = this.orderService.createOrder();
        // send notification to notification service: so that notification service send the email and message to the user
        orderCreatedNotification(order);
        return ResponseEntity.ok("Order Created");
    }

    private void orderCreatedNotification(OrderDetail order) {

    }

}
