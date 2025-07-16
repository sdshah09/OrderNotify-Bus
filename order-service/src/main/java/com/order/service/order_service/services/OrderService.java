package com.order.service.order_service.services;

import com.order.service.order_service.OrderDetail;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public OrderDetail createOrder() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId(UUID.randomUUID().toString());
        orderDetail.setEmail("shaswatshah05@gmail.com");
        orderDetail.setUserPhone("5719210883");
        orderDetail.setUserId("123234566");
        orderDetail.setCourseId(UUID.randomUUID().toString());
        // save this to database
        // mysql-jpo, mongo-db
        // assignment
        return orderDetail;
    }
}
