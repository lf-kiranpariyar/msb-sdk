package com.lftechnology.msb.sdk.literal;

import com.lftechnology.msb.sdk.annotation.DeliveryPartner;
import com.lftechnology.msb.sdk.annotation.TransactionDeliveryConfirmation;

import javax.enterprise.util.AnnotationLiteral;

public class DeliveryPartnerLiteral extends AnnotationLiteral<DeliveryPartner> implements DeliveryPartner {

    private String value;

    public DeliveryPartnerLiteral(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return this.value;
    }
}
