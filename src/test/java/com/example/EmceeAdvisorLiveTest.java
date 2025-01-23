package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@MicronautTest(rebuildContext = true)
public class EmceeAdvisorLiveTest {

    Logger logger = LoggerFactory.getLogger(EmceeAdvisorLiveTest.class);

    @Inject
    EmceeAdvisor assistant;

    @Test
    void givenAdvisor_whenSendChatMessage_thenExpectedResponseShouldContainInformationAboutStLouis() {
        String response = assistant.chat("Greet our audience");
        logger.info(response);
        Assertions.assertTrue(response.contains("St. Louis"));
    }

}