package com.aslan.kafka.producer;

import com.aslan.kafka.model.ExampleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produce")
public class SimpleProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/direct")
    public ResponseEntity publicMessageToKafka(@RequestBody ExampleRequest request){
        this.sendMessage(request.getMessage());
        return ResponseEntity.ok("Message sent to kafka");
    }

    public void sendMessage(String msg) {
        kafkaTemplate.send("test", msg);
    }
}
