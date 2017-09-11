package com.lftechnology.msb.sdk.dto;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class TransactionResponse {

   private String code;
   private String pinNumber;
   private String agentTxnId;
   private String collectCurrency;
   private String agentSessionId;
   private String message;
   private String collectAmount;
   private String payoutAmount;
   private String payoutCurrency;
   private String txnDate;
   private String exchangeRate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    public String getAgentTxnId() {
        return agentTxnId;
    }

    public void setAgentTxnId(String agentTxnId) {
        this.agentTxnId = agentTxnId;
    }

    public String getCollectCurrency() {
        return collectCurrency;
    }

    public void setCollectCurrency(String collectCurrency) {
        this.collectCurrency = collectCurrency;
    }

    public String getAgentSessionId() {
        return agentSessionId;
    }

    public void setAgentSessionId(String agentSessionId) {
        this.agentSessionId = agentSessionId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCollectAmount() {
        return collectAmount;
    }

    public void setCollectAmount(String collectAmount) {
        this.collectAmount = collectAmount;
    }

    public String getPayoutAmount() {
        return payoutAmount;
    }

    public void setPayoutAmount(String payoutAmount) {
        this.payoutAmount = payoutAmount;
    }

    public String getPayoutCurrency() {
        return payoutCurrency;
    }

    public void setPayoutCurrency(String payoutCurrency) {
        this.payoutCurrency = payoutCurrency;
    }

    public String getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(String txnDate) {
        this.txnDate = txnDate;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override public String toString() {
        final StringBuffer sb = new StringBuffer("TransactionResponse{");
        sb.append("code='").append(code).append('\'');
        sb.append(", pinNumber='").append(pinNumber).append('\'');
        sb.append(", agentTxnId='").append(agentTxnId).append('\'');
        sb.append(", collectCurrency='").append(collectCurrency).append('\'');
        sb.append(", agentSessionId='").append(agentSessionId).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append(", collectAmount='").append(collectAmount).append('\'');
        sb.append(", payoutAmount='").append(payoutAmount).append('\'');
        sb.append(", payoutCurrency='").append(payoutCurrency).append('\'');
        sb.append(", txnDate='").append(txnDate).append('\'');
        sb.append(", exchangeRate='").append(exchangeRate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
