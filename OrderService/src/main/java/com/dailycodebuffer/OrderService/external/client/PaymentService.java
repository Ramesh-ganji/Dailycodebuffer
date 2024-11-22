package com.dailycodebuffer.OrderService.external.client;

import com.dailycodebuffer.OrderService.exception.OrderServiceCustomException;
import com.dailycodebuffer.OrderService.payload.request.PaymentRequest;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CircuitBreaker(name = "external", fallbackMethod = "fallback")
@FeignClient(name="PaymentService/payment")
public interface PaymentService {
    @PostMapping
    public ResponseEntity<Long> doPayment(@RequestBody PaymentRequest paymentRequest);
    default void fallback(Exception e){
        throw new OrderServiceCustomException("Payment Service is not available","UNAVAILABLE",
                500);
    }

    }

