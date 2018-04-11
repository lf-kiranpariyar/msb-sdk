package com.lftechnology.msb.sdk.enums;

import com.lftechnology.msb.moneytun.enums.TxnStatus;

/**
 * Holds Common Status for MSB's.
 */
public enum MSBTransactionStatus {
    CREATED, HOLD, UNPAID,CANCELED, PAID, COMPLIANCE_ON_HOLD;

    public static MSBTransactionStatus getTransactionStatus(TxnStatus status){
        switch (status){
            case HOLD:
                return MSBTransactionStatus.HOLD;
            case COMPLAINCE:
                return  MSBTransactionStatus.COMPLIANCE_ON_HOLD;
            case POST:
                return  MSBTransactionStatus.CREATED;
            case PAID:
                return  MSBTransactionStatus.PAID;
            case UNPAID:
                return MSBTransactionStatus.UNPAID;
            case CANCEL :
                return MSBTransactionStatus.CANCELED;
            default:
                return  MSBTransactionStatus.CREATED;
        }
    }

    public static MSBTransactionStatus getTransactionStatus(com.lftechnology.msb.prabhu.enums.TxnStatus status){
        switch (status){
            case HOLD:
                return MSBTransactionStatus.HOLD;
            case COMPLAINCE:
                return  MSBTransactionStatus.COMPLIANCE_ON_HOLD;
            case POST:
                return  MSBTransactionStatus.CREATED;
            case PAID:
                return  MSBTransactionStatus.PAID;
            case UNPAID:
                return MSBTransactionStatus.UNPAID;
            case CANCEL :
                return MSBTransactionStatus.CANCELED;
            default:
                return  MSBTransactionStatus.CREATED;
        }

    }
}
