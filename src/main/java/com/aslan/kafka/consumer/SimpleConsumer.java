package com.aslan.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SimpleConsumer {
    @KafkaListener(topics = "test", groupId = "1")
    public void listen(String message) {
        System.out.println("Received Messasge in group foo: " + message);
    }

}
