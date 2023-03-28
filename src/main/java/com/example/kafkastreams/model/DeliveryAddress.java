
package com.example.kafkastreams.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryAddress {


    private String mAddressLine;

    private String mCity;

    private String mContactNumber;

    private String mPinCode;

    private String mState;


}
