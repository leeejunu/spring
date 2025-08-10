package com.spring.payment;

import com.spring.ExRateProvider;
import com.spring.PaymentService;
import com.spring.WebApiExRateProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class TestObjectFactory {

    @Bean
    public PaymentService paymentService() {
        return new PaymentService(exRateProvider());
    }

    @Bean
    public ExRateProvider exRateProvider() {
        return new ExRateProviderStub(BigDecimal.valueOf(1_000));
    }

//    @Bean
//    public CachedExRateProvider cachedExRateProvider() {
//        return new CachedExRateProvider(exRateProvider());
//    }
}
