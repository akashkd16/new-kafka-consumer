package com.stackroute.springbootkafkaconsumer.listener;


import com.stackroute.springbootkafkaconsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

//    @KafkaListener(topics="test", groupId="group_id1")
//    public void consume(String message) {
//        System.out.println("Consumed message: " + message);
//    }

    @KafkaListener(topics = "test2" ,groupId = "group_id2",
    containerFactory="userKafkaListenerFactory")
    public void consumeJson(@Payload User user) {
        System.out.println("Consumed Json Message: "+ user);
    }
}
