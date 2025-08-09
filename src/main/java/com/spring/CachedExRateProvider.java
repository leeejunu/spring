package com.spring;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CachedExRateProvider implements ExRateProvider{

    private final ExRateProvider target;

    private BigDecimal cachedExRate;

    private LocalDateTime cachedExpiryTime;

    public CachedExRateProvider(ExRateProvider target) {
        this.target = target;
    }

    @Override
    public BigDecimal getExRate(String currency) throws IOException {
        if (cachedExRate == null) {
            cachedExRate = this.target.getExRate(currency);
            cachedExpiryTime = LocalDateTime.now().plusMinutes(3);
        }

        return cachedExRate;
    }
}
