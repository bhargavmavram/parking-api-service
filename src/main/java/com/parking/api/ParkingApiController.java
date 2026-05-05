package com.parking.api;

import java.time.Instant;
import java.util.Map;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Parking API", description = "Parking resource endpoints")
public class ParkingApiController {

    @GetMapping("/api/status")
    @Operation(summary = "Get API service status")
    public Map<String, String> status() {
        return Map.of(
                "service", "parking-api-service",
                "message", "Parking API Service is running",
                "timestamp", Instant.now().toString()
        );
    }

    @GetMapping("/api/secure/sample")
    @Operation(summary = "Access a secured sample API")
    @SecurityRequirement(name = "bearerAuth")
    public Map<String, String> secureSample(Authentication authentication) {
        return Map.of(
                "message", "You are authorized to access the secure parking API",
                "username", authentication.getName(),
                "timestamp", Instant.now().toString()
        );
    }
}