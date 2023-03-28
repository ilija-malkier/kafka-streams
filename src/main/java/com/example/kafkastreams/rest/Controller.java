package com.example.kafkastreams.rest;

import com.example.kafkastreams.dto.Message;
import com.example.kafkastreams.service.InvoiceGenerator;
import com.example.kafkastreams.service.KafkaProduerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class Controller {

private KafkaProduerService kafkaProduerService;
private InvoiceGenerator invoiceGenerator;

    @GetMapping("/messages/send")
    public ResponseEntity<Void> sendMessage(){

        kafkaProduerService.sendMessage(invoiceGenerator.generateInvoice());
        return ResponseEntity.noContent().build();
    }
}
