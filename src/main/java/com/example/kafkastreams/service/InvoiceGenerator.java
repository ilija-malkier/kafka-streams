package com.example.kafkastreams.service;

import com.example.kafkastreams.model.Invoice;
import org.springframework.stereotype.Service;

@Service
public class InvoiceGenerator {



    public Invoice generateInvoice(){
        return Invoice.builder().mInvoiceNunmber("12345").build();
    }
}
