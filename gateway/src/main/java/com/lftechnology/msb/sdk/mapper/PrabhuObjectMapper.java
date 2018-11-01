package com.lftechnology.msb.sdk.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.msb.prabhu.dto.Agent;
import com.lftechnology.msb.prabhu.dto.CancelTransactionDetail;
import com.lftechnology.msb.prabhu.dto.Credential;
import com.lftechnology.msb.prabhu.dto.TransactionDetail;
import com.lftechnology.msb.sdk.dto.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PrabhuObjectMapper {


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


    public static TransactionDetail toTransactionDetail(Transaction transaction) {
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setAgentTxnId(transaction.getTransactionId());
        transactionDetail.setPinNo(transaction.getReferenceNumber());
        return transactionDetail;
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
