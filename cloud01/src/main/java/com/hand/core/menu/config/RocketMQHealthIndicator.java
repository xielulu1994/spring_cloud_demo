package com.hand.core.menu.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;




@Component
public class RocketMQHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        Health.Builder builder = new Health.Builder();
        try {
            doHealthCheck(builder);
        }catch (Exception ex) {
            builder.down(ex);
            Health.up().build();
        }
        return builder.build();
    }
    protected void doHealthCheck(Health.Builder builder) throws Exception {

    }

}
