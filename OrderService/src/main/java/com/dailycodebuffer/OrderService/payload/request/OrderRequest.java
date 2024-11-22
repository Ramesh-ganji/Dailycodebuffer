package com.dailycodebuffer.OrderService.payload.request;

import com.dailycodebuffer.OrderService.utils.PaymentMode.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {
    private long productId;
    private  long totalAmount;
    private long quantity;
    private PaymentMode paymentMode;
}
