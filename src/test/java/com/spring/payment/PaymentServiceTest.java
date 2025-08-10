package com.spring.payment;


import com.spring.Payment;
import com.spring.PaymentService;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

class PaymentServiceTest {

    @Test
    void convertedAmount() throws IOException {
        testAmount(BigDecimal.valueOf(500), BigDecimal.valueOf(5_000));
        testAmount(BigDecimal.valueOf(1_000), BigDecimal.valueOf(10_000));
        testAmount(BigDecimal.valueOf(3_000), BigDecimal.valueOf(30_000));
    }

    private static Payment testAmount(BigDecimal exRate, BigDecimal convertedAmount) throws IOException {
        PaymentService paymentService = new PaymentService(new ExRateProviderStub(exRate));

        Payment payment = paymentService.prepare(1L, "USD", BigDecimal.TEN);

        //환율정보 가져온다
        assertThat(payment.getExRate()).isEqualByComparingTo(exRate);
        assertThat(payment.getConvertedAmount()).isEqualTo(convertedAmount);
        return payment;
    }
}