package com.spring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectFactory {

    public PaymentService paymentService() {
        return new PaymentService(exRateProvider());
    }

    public ExRateProvider exRateProvider() {
        return new WebApiExRateProvider();
    }
}
