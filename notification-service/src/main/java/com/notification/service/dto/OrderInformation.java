package com.notification.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderInformation {
    private String orderId;
    private String userId;
    private String emailId;
    private Date createdAt;
    private String userPhone;
    private String price;
}
