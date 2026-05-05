package com.parking.api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "parking.jwt")
public record JwtProperties(String secret) {
}