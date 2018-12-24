package com.aslan.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.stereotype.Component;

@Component
public class SimpleConsumer {
    @KafkaListener(topics = "test", groupId = "1")
    public void listen(String message) {
        System.out.println("Message with string listener is " + message);
    }

    @KafkaListener(topics = "test",groupId = "2")
    public void listen(ConsumerRecord consumerRecord) throws Exception{
        System.out.println("Message with consumer record is: " + consumerRecord.value()
                + " and offset is: " + consumerRecord.offset());
    }

}
