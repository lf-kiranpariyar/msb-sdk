package com.lftechnology.vtn.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.HashMap;
import java.util.Map;

public enum ResponseCode {

    R00("R00","200","Success"),
    R01("R01","400","Both Sender Phone And Email Empty"),
    R02("R02","400","Invalid Sender Email Address"),
    R03("R03","400","Invalid Sender Phone Format"),
    R04("R04","400","Sender First Name Empty"),
    R05("R05","400","Sender Country Empty"),
    R06("R06","400","Both Receiver Phone And Email Empty"),
    R07("R07","400","Invalid Receiver Email Address"),
    R08("R08","400","Invalid Receiver Phone Format"),
    R09("R09","400","Receiver First Name Empty"),
    R10("R10","400","Receiver Country Empty"),
    R11("R11","500","Access Token Empty"),
    R12("R12","500","Access Key Empty"),
    R13("R13","500","Access Token And Access Key Mismatch"),
    R14("R14","400","Transaction Id Empty"),
    R15("R15","400","Currency Code Empty"),
    R16("R16","400","Amount in Sender Currency Empty"),
    R17("R17","400","Amount in Naira Empty"),
    R18("R18","400","Fee in Sender Currency Empty"),
    R19("R19","400","Fee in Naira Empty"),
    R20("R20","400","Transfer Date Empty"),
    R21("R21","400","Transfer Type Empty"),
    R22("R22","400","Bank Account Number Empty"),
    R23("R23","400","Bank Account Name Empty"),
    R24("R24","400","Bank Name Empty"),
    R25("R25","400","Invalid Bank Account"),
    R26("R26","500","Invalid IP Address"),
    R27("R27","500","Remittance Provider Inactive"),
    R28("R28","500","Insufficient Funds"),
    R29("R29","400","Invalid Sender Account"),
    R30("R30","400","Invalid Receiver Account"),
    R31("R31","400","Invalid Sender Account"),
    R32("R32","400","Invalid Receiver Account"),
    R33("R33","400","Invalid Request"),
    R34("R34","500","System Failure"),
    R35("R35","500","Server Time Out"),
    R36("R36","400","Invalid Bank Name"),
    R38("R38","400","Empty Data"),
    R39("R39","400","Amount in Naira less than required Minimum amount"),
    R40("R40","400","Fee in Naira less than required Minimum fee"),
    R41("R41","400","Invalid Transaction"),
    R42("R42","400","Bank Account Name' received from Bank/NIBSS does not match what you provided."),
    R43("R43","400","Transactions received with same ID within 60 seconds. Please try after 60 seconds"),
    R44("R44","400","You have exceeded your VTN limit for the day Please try again at 2 PM Nigeria time"),
    R99("R99", "400", "Invalid Sender Email"),
    Z01("Z01","500","Bank Transfer Queued"),
    Z02("Z02","500","Bank Transfer Failed and the amount was returned back to Remittance Provider. Try again with another TransactionId"),
    Z03("Z03","500","Bank Transfer failed, but amount is held"),
    Z04("Z04","500","Refund Bank Reversal"),
    Z05("Z05","500","Refund Manually"),
    Z06("Z06","500","This is a low KYC Account.Amount exceed limit allowed"),
    Z07("Z07","500","VTN NIBSS transfer limit exceeded"),
    _03("03","500","Invalid Sender"),
    _06("06","500","Dormant Account"),
    _07("07","500","Invalid Account"),
    _08("08","500","Account Name Mismatch"),
    _09("09","500","Request processing in progress"),
    _12("12","500","Invalid transaction"),
    _14("14","500","Invalid Batch Number"),
    _15("15","500","Invalid Session or Record ID"),
    _16("16","500","Unknown Bank Code"),
    _17("17","500","Invalid Channel"),
    _18("18","500","Wrong Method Call"),
    _21("21","500","No action taken"),
    _25("25","500","Unable to locate record"),
    _26("26","500","Duplicate record"),
    _30("30","500","Format error"),
    _34("34","500","Suspected fraud"),
    _35("35","500","Contact sending bank"),
    _57("57","500","Transaction not permitted to sender"),
    _58("58","500","Transaction not permitted on channel"),
    _63("63","500","Security violation"),
    _65("65","500","Exceeds withdrawal frequency"),
    _68("68","500","Response received too late"),
    _91("91","500","Beneficiary Bank not available"),
    _92("92","500","Routing error"),
    _94("94","500","Duplicate transaction"),
    _96("96","500","System malfunction"),
    _97("97","500","Timeout waiting for response from destination");

    private String message;
    private String code;
    private String key;

    private static final Map<String, ResponseCode> RESPONSE_CODE_MAP = new HashMap<>();

    static {
        for (ResponseCode value : ResponseCode.values()) {
            RESPONSE_CODE_MAP.put(value.key, value);
        }
    }

    ResponseCode(String key, String code, String message) {
        this.key = key;
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public String getCode(){
        return code;
    }

    @JsonCreator
    public static ResponseCode get(String key) {
        return RESPONSE_CODE_MAP.get(key);
    }
}
