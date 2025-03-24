package org.example.controllers;

import org.example.kafka.KafkaProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private final KafkaProducer producer;

    public KafkaController(KafkaProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return "Mensaje enviado: " + message;
    }
}

