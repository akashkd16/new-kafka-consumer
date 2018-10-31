package com.stackroute.springbootkafkaconsumer.listener;


import com.stackroute.springbootkafkaconsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="Test", groupId="group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(topics = "Test_json2" ,groupId = "group_json",
    containerFactory="userKafkaListenerFactory")
    public void consumeJson( User user) {
        System.out.println("Consumed Json Message: "+ user.toString());
    }
}
