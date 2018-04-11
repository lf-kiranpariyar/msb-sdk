package com.lftechnology.msb.sdk.enums;

import com.lftechnology.msb.prabhu.enums.PaymentMode;
import com.lftechnology.msb.sdk.exception.UnsupportedException;

public enum TransactionPaymentType {
    BANK_ACCOUNT, HOME_DELIVERY, CASH, PARTNER_BANK_ACCOUNT;

    public static com.lftechnology.msb.moneytun.enums.PaymentMode getMoneyTunPaymentMode(TransactionPaymentType type){
        switch (type){
            case BANK_ACCOUNT:
                return com.lftechnology.msb.moneytun.enums.PaymentMode.ACCOUNT_DEPOSIT;
            case CASH:
                return com.lftechnology.msb.moneytun.enums.PaymentMode.CASH_PICKUP;
            case HOME_DELIVERY:
                return com.lftechnology.msb.moneytun.enums.PaymentMode.HOME_DELIVERY;
            default:
                throw new UnsupportedException("Invalid Payment Mode.");
        }
    }

    public static com.lftechnology.msb.prabhu.enums.PaymentMode getPrabhuPaymentMode(TransactionPaymentType type){
        switch (type){
            case BANK_ACCOUNT:
                return PaymentMode.ACCOUNT_DEPOSIT;
            case CASH:
                return PaymentMode.CASH_PICKUP;
            case HOME_DELIVERY:
                return PaymentMode.HOME_DELIVERY;
            case PARTNER_BANK_ACCOUNT:
                return PaymentMode.ACCOUNT_DEPOSIT_ANOTHER_BANK;
            default:
                throw new UnsupportedException("Invalid Payment Mode.");
        }
    }
}
