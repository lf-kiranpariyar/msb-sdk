package com.lftechnology.msb.sdk.mapper;

import com.google.gson.Gson;
import com.lftechnology.msb.moneytun.enums.PaymentMode;
import com.lftechnology.msb.prabhu.dto.TransactionDetail;
import com.lftechnology.msb.sdk.dto.Document;
import com.lftechnology.msb.sdk.dto.Transaction;
import com.lftechnology.msb.sdk.enums.DocumentType;
import com.lftechnology.msb.sdk.enums.TransactionPaymentType;

import java.time.LocalDate;

public class PrabhuObjectMapper {
    public static com.lftechnology.msb.prabhu.dto.Credential toCredential(String credential){
        Gson gson = new Gson();
        return  gson.fromJson(credential, com.lftechnology.msb.prabhu.dto.Credential.class);
    }

    public static void main(String[] args) {
        System.out.println(LocalDate.now().toString());
    }

    public static TransactionDetail toTransactionDetail(Transaction transaction){
        TransactionDetail transactionDetail = new TransactionDetail();
        Document ssnDocument = transaction.getSender().getDocumentList().stream().filter(it -> it.equals(it.getType() == DocumentType.SSN)).findFirst().get();
        Document otherDocument = transaction.getSender().getDocumentList().stream().filter(it -> it.equals(it.getType() != DocumentType.SSN)).findFirst().get();

        transactionDetail.setSenderName(transaction.getSender().getFullName());
        transactionDetail.setSenderAddress(transaction.getSender().getAddress().getFullAddress());
        transactionDetail.setSenderMobile(transaction.getSender().getContact().getMobilePhone());
        transactionDetail.setSenderCity(transaction.getSender().getAddress().getCity());
        transactionDetail.setSenderCountry(transaction.getSender().getAddress().getCountry().getName());
        transactionDetail.setSenderIdType(DocumentType.getPrabhuDocument(otherDocument.getType()).getValue());
        transactionDetail.setSenderIdNumber(otherDocument.getIdNumber());
        transactionDetail.setSenderIdIsuueDate(otherDocument.getIssuedDate().toString());
        transactionDetail.setSenderIdExpireDate(otherDocument.getExpiryDate().toString());
        transactionDetail.setSenderDateofBirth(transaction.getSender().getDateOfBirth().toString());
        transactionDetail.setReceiverName(transaction.getRecipient().getFullName());
        transactionDetail.setReceiverAddress(transaction.getRecipient().getAddress().getFullAddress());
        transactionDetail.setReceiverContactNumber(transaction.getRecipient().getContact().getMobilePhone());
        transactionDetail.setReceiverCity(transaction.getRecipient().getAddress().getCity());
        transactionDetail.setReceiverCountry(transaction.getRecipient().getAddress().getCountry().getName());
        transactionDetail.setTransferAmount(transaction.getAmount().toString());
     transactionDetail.setPaymentMode(TransactionPaymentType.getPrabhuPaymentMode(transaction.getType
()).getValue());
        transactionDetail.setBankBranchName(transaction.getBank().getBranch().getName());
        transactionDetail.setBankAccountNumber(transaction.getBank().getAccountNumber());
        transactionDetail.setBankLocationId(String.valueOf(transaction.getBank().getMetadata().get("locationId")));
        transactionDetail.setBankId(transaction.getBank().getReferenceId());
        transactionDetail.setCalcBy("C");
        transactionDetail.setSenderOccupation(transaction.getSender().getOccupation());
        transactionDetail.setSenderSourceOfFund("Business");
        transactionDetail.setSenderBeneficiaryRelationship(transaction.getRecipient().getRelationship());
        transactionDetail.setPurposeOfRemittance(transaction.getPurpose());
        transactionDetail.setSenderSSN(ssnDocument.getIdNumber());
        return transactionDetail;
    }

}
