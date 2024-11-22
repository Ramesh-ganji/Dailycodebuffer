package com.dailycodebuffer.OrderService.service;

import com.dailycodebuffer.OrderService.payload.request.OrderRequest;
import com.dailycodebuffer.OrderService.payload.response.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
