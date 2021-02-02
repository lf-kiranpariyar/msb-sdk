package com.lftechnology.msb.sdk.literal;

import com.lftechnology.msb.sdk.annotation.TransactionDeliveryConfirmation;

import javax.enterprise.util.AnnotationLiteral;

public class TransactionOriginatorConfirmationLiteral extends AnnotationLiteral<TransactionDeliveryConfirmation> implements TransactionDeliveryConfirmation {

    private String value;

    public TransactionOriginatorConfirmationLiteral(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return this.value;
    }
}
