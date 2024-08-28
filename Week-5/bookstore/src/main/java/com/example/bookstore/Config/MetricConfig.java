package com.example.bookstore.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@Configuration
public class MetricConfig {

    @Bean
    public MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        return registry -> registry.config().commonTags("application", "online-bookstore");
    }

    @Bean
    public CommandLineRunner demo(MeterRegistry meterRegistry) {
        return args -> {
            Counter counter = meterRegistry.counter("books.added");
            counter.increment();
        };
    }
}