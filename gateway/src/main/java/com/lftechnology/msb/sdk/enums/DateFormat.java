package com.lftechnology.msb.sdk.enums;

/**
 * Stores MSB SDK Specific date format.
 */
public enum DateFormat {
    MONEYTUN_STANDARD_DATE_FORMAT("MM-dd-yyyy"), PRABHU_STANDARD_DATE_FORMAT("yyyy-mm-dd");

    String format;

    DateFormat(String value) {
        this.format = value;
    }
}
