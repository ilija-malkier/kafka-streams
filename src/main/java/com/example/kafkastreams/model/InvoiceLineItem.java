
package com.example.kafkastreams.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceLineItem {


    private String mItemCode;
    private String mItemDescription;
    private Double mItemPrice;
    private Long mItemQty;
    private Double mTotalValue;



}
