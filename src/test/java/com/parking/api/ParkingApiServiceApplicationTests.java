package com.parking.api;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.TestingAuthenticationToken;

@SpringBootTest
class ParkingApiServiceApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void secureSampleReturnsAuthenticatedUsername() {
        ParkingApiController controller = new ParkingApiController();

        Map<String, String> response = controller.secureSample(new TestingAuthenticationToken("alice", null));

        assertThat(response)
                .containsEntry("username", "alice")
                .containsEntry("message", "You are authorized to access the secure parking API");
    }
}