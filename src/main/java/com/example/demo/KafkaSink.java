package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import java.time.LocalDate;
import java.time.LocalDateTime;

@EnableBinding(Sink.class)
public class KafkaSink {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaSink.class);

    @StreamListener(Sink.INPUT)
    public void handleMessage(String message) {
        LocalDateTime a = LocalDateTime.now();
        LOGGER.info("New message received: " + message + a );


    }
}