package com.spring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) throws IOException {

        BeanFactory bc = new AnnotationConfigApplicationContext(ObjectFactory.class);

        ObjectFactory objectFactory = new ObjectFactory();
        PaymentService paymentService = objectFactory.paymentService();
        Payment payment = paymentService.prepare(100L, "USD", BigDecimal.valueOf(50.7));



        System.out.println(payment);
    }
}
