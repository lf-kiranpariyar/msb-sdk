package com.lftechnology.msb.sdk.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.msb.prabhu.dto.Agent;
import com.lftechnology.msb.prabhu.dto.TransactionDetail;
import com.lftechnology.msb.sdk.dto.SyncBankResponse;
import com.lftechnology.msb.sdk.dto.Transaction;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrabhuObjectMapper {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(PrabhuObjectMapper.class);

    public static TransactionResponse fromTransactionResponse(com.lftechnology.msb.prabhu.dto.TransactionResponse transactionResponse){
        TransactionResponse response = new TransactionResponse();
        response.setReferenceNumber(response.getReferenceNumber());
        ObjectMapper objectMapper = new ObjectMapper();
        response.setMetadata(objectMapper.convertValue(response, Map.class));
        return response;
    }

    public static TransactionDetail toTransaction(Transaction transaction) {
        LOGGER.debug("Transaction Object Reference For MoneyTun Transaction Creation : {}" , transaction);
        TransactionDetail transactionDetail = new TransactionDetail();
     /*   transactionDetail.setSenderName(transaction.getSender().getFullName());
        transactionDetail.setSenderAddress(transaction.getSender().getAddress().getAddressLine1());
        transactionDetail.setSenderMobile(transaction.getSender().getContact().getMobilePhone());
        transactionDetail.setSenderCity(transaction.getSender().getAddress().getCity());
        transactionDetail.setSenderCountry(transaction.getSender().getAddress().getCountry().getName());
        Document document = transaction.getSender().getDocumentList().get(0);
        transactionDetail.setSenderIdType(DocumentType.getPrabhuDocument(document.getType()).toString());
        transactionDetail.setSenderIdNumber(document.getIdNumber());
        transactionDetail.setSenderIdIsuueDate(DateUtil.getDateString(document.getIssuedDate(), DateUtil.ISO_DATE_FORMAT));
        transactionDetail.setSenderIdExpireDate(DateUtil.getDateString(document.getExpiryDate(), DateUtil.ISO_DATE_FORMAT));
        transactionDetail.setSenderDateofBirth(DateUtil.getDateString(transaction.getSender().getDateOfBirth(), DateUtil.ISO_DATE_FORMAT));
        transactionDetail.setReceiverName(transaction.getRecipient().getFullName());
        transactionDetail.setReceiverAddress(transaction.getRecipient().getAddress().getAddressLine1());
        transactionDetail.setReceiverContactNumber(transaction.getRecipient().getContact().getMobilePhone());
        transactionDetail.setReceiverCity(transaction.getRecipient().getAddress().getCity());
        transactionDetail.setReceiverCountry(transaction.getRecipient().getAddress().getCountry().getName());
        transactionDetail.setTransferAmount(transaction.getAmount().toPlainString());
        transactionDetail.setPaymentMode(PaymentMode.ACCOUNT_DEPOSIT_ANOTHER_BANK.getValue());
        transactionDetail.setBankAccountNumber(transaction.getBank().getAccountNumber());
        transactionDetail.setBankLocationId(String.valueOf(transaction.getBank().getMetadata().get("locationId")));
        transactionDetail.setBankId(transaction.getBank().getReferenceId());
        transactionDetail.setCalcBy("C");
        transactionDetail.setSenderOccupation("");
        transactionDetail.setBankBranchName(transaction.getBank().getName());
        transactionDetail.setSenderSourceOfFund(transaction.getSourceOfIncome());
        transactionDetail.setSenderBeneficiaryRelationship(transaction.getRecipient().getRelationship());
        transactionDetail.setPurposeOfRemittance(transaction.getPurpose());
        Document ssnDocument = transaction.getSender().getDocumentList().stream().filter(it-> it.getType().equals(DocumentType.SSN)).findFirst().get();
        transactionDetail.setSenderSSN(ssnDocument.getIdNumber());*/
        return transactionDetail;
    }

    public static List<SyncBankResponse> fetchBankList(List<Agent> agents){
        return agents
                .stream()
                .map(n -> convertToSyncBankResponse(n))
                .collect(Collectors.toList());
    }

    private static SyncBankResponse convertToSyncBankResponse(Agent agent){
        SyncBankResponse syncBankResponse =  new SyncBankResponse();
        syncBankResponse.setName(agent.getAgent());
        return  syncBankResponse;
    }

    private static SyncBankResponse convertToSyncBranchResponse(Agent agent){
        SyncBankResponse syncBankResponse =  new SyncBankResponse();
        syncBankResponse.setName(agent.getAgent());
        return syncBankResponse;
    }
}




