package com.lftechnology.vtn.dto.request;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lftechnology.vtn.serilizer.LocalDateSerializer;
import java.math.BigDecimal;
import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionRequest extends Credential {

    @JsonProperty(value = "TransactionId")
    private String transactionId;

    @JsonProperty(value = "TransferDate")
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate transferDate;

    @JsonProperty(value = "TransferType")
    private Integer transferType;

    @JsonProperty(value = "SenderEmail")
    private String senderEmail;

    @JsonProperty(value = "SenderPhone")
    private String senderPhone;

    @JsonProperty(value = "SenderFirstName")
    private String senderFirstName;

    @JsonProperty(value = "SenderLastName")
    private String senderLastName;

    @JsonProperty(value = "SenderCountry")
    private String senderCountry;

    @JsonProperty(value = "ReceiverEmail")
    private String receiverEmail;

    @JsonProperty(value = "ReceiverPhone")
    private String receiverPhone;

    @JsonProperty(value = "ReceiverFirstName")
    private String receiverFirstName;

    @JsonProperty(value = "ReceiverLastName")
    private String receiverLastName;

    @JsonProperty(value = "ReceiverCountry")
    private String receiverCountry;

    @JsonProperty(value = "CurrencyCode")
    private String currencyCode;

    @JsonProperty(value = "AmountInSenderCurrency")
    private BigDecimal amountInSenderCurrency;

    @JsonProperty(value = "AmountInNaira")
    private BigDecimal amountInNaira;

    @JsonProperty(value = "FeeInSenderCurrency")
    private BigDecimal feeInSenderCurrency;

    @JsonProperty(value = "FeeInNaira")
    private BigDecimal feeInNaira;

    @JsonProperty(value = "BankAccountNumber")
    private String bankAccountNumber;

    @JsonProperty(value = "BankAccountName")
    private String bankAccountName;

    @JsonProperty(value = "BankName")
    private String bankName;


    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDate getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(LocalDate transferDate) {
        this.transferDate = transferDate;
    }

    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderFirstName() {
        return senderFirstName;
    }

    public void setSenderFirstName(String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }

    public String getSenderLastName() {
        return senderLastName;
    }

    public void setSenderLastName(String senderLastName) {
        this.senderLastName = senderLastName;
    }

    public String getSenderCountry() {
        return senderCountry;
    }

    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverFirstName() {
        return receiverFirstName;
    }

    public void setReceiverFirstName(String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }

    public String getGetReceiverLastName() {
        return receiverLastName;
    }

    public void setReceiverLastName(String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }

    public String getReceiverCountry() {
        return receiverCountry;
    }

    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getAmountInSenderCurrency() {
        return amountInSenderCurrency;
    }

    public void setAmountInSenderCurrency(BigDecimal amountInSenderCurrency) {
        this.amountInSenderCurrency = amountInSenderCurrency;
    }

    public BigDecimal getAmountInNaira() {
        return amountInNaira;
    }

    public void setAmountInNaira(BigDecimal amountInNaira) {
        this.amountInNaira = amountInNaira;
    }

    public BigDecimal getFeeInSenderCurrency() {
        return feeInSenderCurrency;
    }

    public void setFeeInSenderCurrency(BigDecimal feeInSenderCurrency) {
        this.feeInSenderCurrency = feeInSenderCurrency;
    }

    public BigDecimal getFeeInNaira() {
        return feeInNaira;
    }

    public void setFeeInNaira(BigDecimal feeInNaira) {
        this.feeInNaira = feeInNaira;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TransactionRequest{");
        sb.append("transactionId='").append(transactionId).append('\'');
        sb.append(", transferDate=").append(transferDate);
        sb.append(", transferType=").append(transferType);
        sb.append(", senderEmail='").append(senderEmail).append('\'');
        sb.append(", senderPhone='").append(senderPhone).append('\'');
        sb.append(", senderFirstName='").append(senderFirstName).append('\'');
        sb.append(", senderLastName='").append(senderLastName).append('\'');
        sb.append(", senderCountry='").append(senderCountry).append('\'');
        sb.append(", receiverEmail='").append(receiverEmail).append('\'');
        sb.append(", receiverPhone='").append(receiverPhone).append('\'');
        sb.append(", receiverFirstName='").append(receiverFirstName).append('\'');
        sb.append(", receiverLastName='").append(receiverLastName).append('\'');
        sb.append(", receiverCountry='").append(receiverCountry).append('\'');
        sb.append(", currencyCode='").append(currencyCode).append('\'');
        sb.append(", amountInSenderCurrency=").append(amountInSenderCurrency);
        sb.append(", amountInNaira=").append(amountInNaira);
        sb.append(", feeInSenderCurrency=").append(feeInSenderCurrency);
        sb.append(", feeInNaira=").append(feeInNaira);
        sb.append(", bankAccountNumber='").append(bankAccountNumber).append('\'');
        sb.append(", bankAccountName='").append(bankAccountName).append('\'');
        sb.append(", bankName='").append(bankName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * @author shankar ghimire
     */
    public static class Builder {

        private String transactionId;
        private LocalDate transferDate;
        private String senderEmail;
        private String senderPhone;
        private String senderFirstName;
        private String senderLastName;
        private String senderCountry;
        private String receiverEmail;
        private String receiverPhone;
        private String receiverFirstName;
        private String receiverLastName;
        private String receiverCountry;
        private String currencyCode;
        private BigDecimal ammountInSenderCurrency;
        private BigDecimal ammountInNaira;
        private BigDecimal feeInSenderCurrency;
        private BigDecimal feeInNaira;
        private String bankAccountNumber;
        private String bankAccountName;
        private String bankName;
        private Integer transferType;


        public Builder setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder setTransferDate(LocalDate transferDate) {
            this.transferDate = transferDate;
            return this;
        }

        public Builder setTransferType(Integer transferType) {
            this.transferType = transferType;
            return this;
        }

        public Builder setSenderEmail(String senderEmail) {
            this.senderEmail = senderEmail;
            return this;
        }

        public Builder setSenderPhone(String senderPhone) {
            this.senderPhone = senderPhone;
            return this;
        }

        public Builder setSenderFirstName(String senderFirstName) {
            this.senderFirstName = senderFirstName;
            return this;
        }

        public Builder setSenderLastName(String senderLastName) {
            this.senderLastName = senderLastName;
            return this;
        }

        public Builder setSenderCountry(String senderCountry) {
            this.senderCountry = senderCountry;
            return this;
        }

        public Builder setReceiverEmail(String receiverEmail) {
            this.receiverEmail = receiverEmail;
            return this;
        }

        public Builder setReceiverPhone(String receiverPhone) {
            this.receiverPhone = receiverPhone;
            return this;
        }

        public Builder setReceiverFirstName(String receiverFirstName) {
            this.receiverFirstName = receiverFirstName;
            return this;
        }

        public Builder setReceiverLastName(String receiverLastName) {
            this.receiverLastName = receiverLastName;
            return this;
        }

        public Builder setReceiverCountry(String receiverCountry) {
            this.receiverCountry = receiverCountry;
            return this;
        }

        public Builder setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Builder setAmmountInSenderCurrency(BigDecimal ammountInSenderCurrency) {
            this.ammountInSenderCurrency = ammountInSenderCurrency;
            return this;
        }

        public Builder setAmmountInNaira(BigDecimal ammountInNaira) {
            this.ammountInNaira = ammountInNaira;
            return this;
        }

        public Builder setFeeInSenderCurrency(BigDecimal feeInSenderCurrency) {
            this.feeInSenderCurrency = feeInSenderCurrency;
            return this;
        }

        public Builder setFeeInNaira(BigDecimal feeInNaira) {
            this.feeInNaira = feeInNaira;
            return this;
        }

        public Builder setBankAccountNumber(String bankAccountNumber) {
            this.bankAccountNumber = bankAccountNumber;
            return this;
        }

        public Builder setBankAccountName(String bankAccountName) {
            this.bankAccountName = bankAccountName;
            return this;
        }

        public Builder setBankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public TransactionRequest build() {
            TransactionRequest transactionRequest = new TransactionRequest();
            transactionRequest.setTransactionId(this.transactionId);
            transactionRequest.setTransferDate(this.transferDate);
            transactionRequest.setTransferType(this.transferType);
            transactionRequest.setSenderEmail(this.senderEmail);
            transactionRequest.setSenderPhone(this.senderPhone);
            transactionRequest.setSenderFirstName(this.senderFirstName);
            transactionRequest.setSenderLastName(this.senderLastName);
            transactionRequest.setSenderCountry(this.senderCountry);
            transactionRequest.setReceiverCountry(this.receiverCountry);
            transactionRequest.setReceiverEmail(this.receiverEmail);
            transactionRequest.setReceiverFirstName(this.receiverFirstName);
            transactionRequest.setReceiverLastName(this.receiverLastName);
            transactionRequest.setReceiverPhone(this.receiverPhone);
            transactionRequest.setCurrencyCode(this.currencyCode);
            transactionRequest.setAmountInNaira(this.ammountInNaira);
            transactionRequest.setAmountInSenderCurrency(this.ammountInSenderCurrency);
            transactionRequest.setFeeInNaira(this.feeInNaira);
            transactionRequest.setBankAccountNumber(this.bankAccountNumber);
            transactionRequest.setBankAccountName(this.bankAccountName);
            transactionRequest.setBankName(this.bankName);
            transactionRequest.setFeeInSenderCurrency(this.feeInSenderCurrency);


            return transactionRequest;

        }
    }
}
