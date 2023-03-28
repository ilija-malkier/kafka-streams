package com.example.kafkastreams.service;

import com.example.kafkastreams.model.Invoice;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

import static com.example.kafkastreams.config.Constants.TOPIC_NAME;

@Service
@Log4j2
@AllArgsConstructor
public class KafkaProduerService {
    private KafkaTemplate<String, Invoice> kafkaTemplate;
    public void sendMessage(Invoice invoice){
     log.info(String.format("Producing Message -Key: %s Value %s to topic %s",TOPIC_NAME,invoice.getMStoreID(),invoice));
        kafkaTemplate.send(TOPIC_NAME,invoice.getMStoreID(),invoice);
    }

    @Bean
    public Consumer<KStream<String,String>> process(){
        return (x)->x.foreach((k,v)->System.out.format(k+" - "+ v));
    }

}
