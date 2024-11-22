package com.dailycodebuffer.PaymentService.service;

import com.dailycodebuffer.PaymentService.model.PaymentRequest;
import com.dailycodebuffer.PaymentService.model.PaymentResponse;
import org.springframework.http.HttpStatus;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);


    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
