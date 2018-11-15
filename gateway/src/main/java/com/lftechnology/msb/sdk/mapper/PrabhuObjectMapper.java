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
        transactionDetail.setCustomerRate(String.valueOf(transaction.getRate()));
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
                branchResponseList.add(branchResponse);
            });
            syncBankResponse.setBranchResponseList(branchResponseList);
            responseList.add(syncBankResponse);
        });
        return responseList;
    }
}