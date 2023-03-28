
package com.example.kafkastreams.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Invoice {

    private Double mCESS;
    private Double mCGST;
    private String mCashierID;
    private Long mCreatedTime;
    private String mCustomerCardNo;
    private String mCustomerType;
    private DeliveryAddress mDeliveryAddress;
    private String mDeliveryType;
    private List<InvoiceLineItem> mInvoiceLineItems;
    private String mInvoiceNunmber;
    private Long mNumberOfItems;
    private String mPaymentMethod;
    private String mPosID;
    private Double mSGST;
    private String mStoreID;
    private Double mTaxableAmount;
    private Double mTotalAmount;



}
