package com.dailycodebuffer.OrderService;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class TestServiceInstanceListSupplier implements ServiceInstanceListSupplier {
    @Override
    public String getServiceId() {
        return "";
    }

    @Override
    public Flux<List<ServiceInstance>> get() {
        List<ServiceInstance> result=new ArrayList<>();
        result.add(new DefaultServiceInstance(
                "PaymentService",
                "PaymentService",
                "localhost",
                8080,
                false));
        result.add(new DefaultServiceInstance(
                "ProductService",
                "ProductService",
                "localhost",
                8080,
                false));
        return Flux.just(result);
    }
}
