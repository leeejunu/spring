package com.spring;

import java.io.IOException;
import java.math.BigDecimal;

public class SimpleExRateProvider implements ExRateProvider{

    @Override
    public BigDecimal getExRate(String currency) throws IOException {
        if(currency.equalsIgnoreCase("USD")) return BigDecimal.valueOf(1000);

        throw new IllegalArgumentException("");
    }
}
