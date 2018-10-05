package com.lftechnology.vtn.enums;

public enum ResponseCode {

    R00("Success"),
    R01("Both Sender Phone And Email Empty"),
    R02("Invalid Sender Email Address"),
    R03("Invalid Sender Phone Format"),
    R04("Sender First Name Empty"),
    R05("Sender Country Empty"),
    R06("Both Receiver Phone And Email Empty"),
    R07("Invalid Receiver Email Address"),
    R08("Invalid Receiver Phone Format"),
    R09("Receiver First Name Empty"),
    R10("Receiver Country Empty"),
    R11("Access Token Empty"),
    R12("Access Key Empty"),
    R13("Access Token And Access Key Mismatch"),
    R14("Transaction Id Empty"),
    R15("Currency Code Empty"),
    R16("Amount in Sender Currency Empty"),
    R17("Amount in Naira Empty"),
    R18("Fee in Sender Currency Empty"),
    R19("Fee in Naira Empty"),
    R20("Transfer Date Empty"),
    R21("Transfer Type Empty"),
    R22("Bank Account Number Empty"),
    R23("Bank Account Name Empty"),
    R24("Bank Name Empty"),
    R25("Invalid Bank Account"),
    R26("Invalid IP Address"),
    R27("Remittance Provider Inactive"),
    R28("Insufficient Funds"),
    R29("Invalid Sender Account"),
    R30("Invalid Receiver Account"),
    R31("Invalid Sender Account"),
    R32("Invalid Receiver Account"),
    R33("Invalid Request"),
    R34("System Failure"),
    R35("Server Time Out"),
    R36("Invalid Bank Name"),
    R38("Empty Data"),
    R39("Amount in Naira less than required Minimum amount"),
    R40("Fee in Naira less than required Minimum fee"),
    R41("Invalid Transaction"),
    R42("'Bank Account Name' received from Bank/NIBSS does not match what you provided."),
    R43("Transactions received with same ID within 60 seconds. Please try after 60 seconds"),
    R44("You have exceeded your VTN limit for the day Please try again at 2 PM Nigeria time"),
    Z01("Bank Transfer Queued"),
    Z02("Bank Transfer Failed and the amount was returned back to Remittance Provider. Try again with another TransactionId"),
    Z03("Bank Transfer failed, but amount is held"),
    Z04("Refund Bank Reversal"),
    Z05("Refund Manually"),
    Z06("This is a low KYC Account.Amount exceed limit allowed"),
    Z07("VTN NIBSS transfer limit exceeded");


    private String message;

    ResponseCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
