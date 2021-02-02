package com.lftechnology.msb.sdk.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.lftechnology.msb.prabhu.dto.Agent;
import com.lftechnology.msb.prabhu.dto.CancelTransactionDetail;
import com.lftechnology.msb.prabhu.dto.Credential;
import com.lftechnology.msb.prabhu.dto.TransactionDetail;
import com.lftechnology.msb.sdk.dto.Address;
import com.lftechnology.msb.sdk.dto.Document;
import com.lftechnology.msb.sdk.dto.SyncBankResponse;
import com.lftechnology.msb.sdk.dto.SyncBranchResponse;
import com.lftechnology.msb.sdk.dto.Transaction;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.dto.TransactionStatusChangeRequest;
import com.lftechnology.msb.sdk.enums.DocumentType;
import com.lftechnology.msb.sdk.enums.TransactionPaymentType;
import com.lftechnology.msb.sdk.util.DateUtil;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PrabhuObjectMapper {
    public static com.lftechnology.msb.prabhu.dto.Credential toCredential(String credential) {
        Gson gson = new Gson();
        return gson.fromJson(credential, com.lftechnology.msb.prabhu.dto.Credential.class);
    }

    public static void main(String[] args) {
        System.out.println(LocalDate.now().toString());
    }

    public static TransactionDetail toTransactionDetail(Transaction transaction) {
        Document ssnDocument = transaction.getSender().getDocumentList().stream().filter(it -> it.getType().getValue().equalsIgnoreCase(DocumentType.SSN.getValue())).findFirst().get();
        Document otherDocument = transaction.getSender().getDocumentList().stream().filter(it -> it.getType() != DocumentType.SSN).findFirst().get();

        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setSenderName(transaction.getSender().getFullName());
        transactionDetail.setSenderAddress(transaction.getSender().getAddress().getFullAddress());
        transactionDetail.setSenderMobile(transaction.getSender().getContact().getMobilePhone());
        transactionDetail.setSenderCity(transaction.getSender().getAddress().getCity());
        transactionDetail.setSenderCountry(transaction.getSender().getAddress().getCountry().getName());
        transactionDetail.setSenderIdType(DocumentType.getPrabhuDocument(otherDocument.getType()).getValue());
        transactionDetail.setSenderIdNumber(otherDocument.getIdNumber());
        transactionDetail.setSenderIdIsuueDate(DateUtil.getDateString(otherDocument.getIssuedDate(),DateUtil.ISO_DATE_FORMAT));
        transactionDetail.setSenderIdExpireDate(DateUtil.getDateString(otherDocument.getExpiryDate(), DateUtil.ISO_DATE_FORMAT));
        transactionDetail.setSenderDateofBirth(DateUtil.getDateString(transaction.getSender().getDateOfBirth(), DateUtil.ISO_DATE_FORMAT));
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
        transactionDetail.setBankId(String.valueOf(transaction.getBank().getMetadata().get("bankId")));
        transactionDetail.setCalcBy("C");
        transactionDetail.setSenderOccupation(transaction.getSender().getOccupation());
        transactionDetail.setSenderSourceOfFund(transaction.getSourceOfIncome());
        transactionDetail.setSenderBeneficiaryRelationship(transaction.getRecipient().getRelationship());
        transactionDetail.setPurposeOfRemittance(transaction.getPurpose());
        String formattedSSN = String.format("%09d", Long.valueOf(ssnDocument.getIdNumber()));
        transactionDetail.setSenderSSN(formattedSSN);
        transactionDetail.setCustomerRate(String.valueOf(transaction.getRate()));
        transactionDetail.setAgentTxnId(transaction.getTransactionId());
        return transactionDetail;
    }


    public static Credential getCredential(String credentialString) {
        ObjectMapper objectMapper = new ObjectMapper();
        if (credentialString == null) {
            throw new com.lftechnology.msb.moneytun.exception.InvalidCredentialException("Credentials not found");
        }
        Credential credential = null;
        try {
            credential = objectMapper.readValue(credentialString, Credential.class);
        } catch (IOException e) {
            throw new com.lftechnology.msb.moneytun.exception.InvalidCredentialException("Invalid Credentials ");
        }
        return credential;
    }


    public static CancelTransactionDetail toCancelTransactionDetail(TransactionStatusChangeRequest transactionStatusChangeRequest) {
        CancelTransactionDetail cancelTransactionDetail = new CancelTransactionDetail();
        cancelTransactionDetail.setMsbTxnId(transactionStatusChangeRequest.getReferenceId());
        cancelTransactionDetail.setCancelComment(transactionStatusChangeRequest.getNote());
        return cancelTransactionDetail;
    }


    public static TransactionResponse toTransactionResponse(com.lftechnology.msb.prabhu.dto.TransactionResponse transactionResponse) {
        TransactionResponse txnResponse = new TransactionResponse();
        txnResponse.setReferenceNumber(transactionResponse.getPinNumber());
        ObjectMapper objectMapper = new ObjectMapper();
        txnResponse.setMetadata(objectMapper.convertValue(transactionResponse, Map.class));
        return txnResponse;
    }

    public static List<SyncBankResponse> toSyncBankResponse(List<Agent> agents) {
        List<SyncBankResponse> responseList = new ArrayList<>();
        agents.forEach(agent -> {
            SyncBankResponse syncBankResponse = new SyncBankResponse();
            syncBankResponse.setName(agent.getAgent());
            syncBankResponse.setReferenceNumber(agent.getAgentBranchList().get(0).getBankId());
            List<SyncBranchResponse> branchResponseList = new ArrayList<>();
            agent.getAgentBranchList().forEach(branch -> {
                SyncBranchResponse branchResponse = new SyncBranchResponse();
                Address address = new Address();
                address.setCity(branch.getCity());
                address.setAddressLine1(branch.getAddress());
                branchResponse.setAddress(address);
                branchResponse.setName(branch.getBranch());
                branchResponse.setMetadata(new ObjectMapper().convertValue(branch, Map.class));
                syncBankResponse.setMetadata(new ObjectMapper().convertValue(branch, Map.class));
                branchResponseList.add(branchResponse);
            });
            syncBankResponse.setBranchResponseList(branchResponseList);
            responseList.add(syncBankResponse);
        });
        return responseList;
    }
}