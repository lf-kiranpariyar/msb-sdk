package com.lftechnology.msb.sdk.literal;

import com.lftechnology.msb.sdk.annotation.TransactionOriginator;

import javax.enterprise.util.AnnotationLiteral;






































    private String value;

    public TransactionOriginatorLiteral(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return this.value;
    }
}
