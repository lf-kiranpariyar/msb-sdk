package com.lftechnology.msb.sdk.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.moneytun.outbound.dto.Credential;
import com.lftechnology.moneytun.outbound.dto.OutboundResponse;
import com.lftechnology.moneytun.outbound.dto.Transaction;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.dto.TransactionStatusChangeResponse;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MoneyTunOutboundObjectMapper {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MoneyTunObjectMapper.class);

    public static Credential toCrendential(String credentialString) {
        LOGGER.info("MoneyRunOutboundObjectMapper: string credential to Outbound credential object");
        Credential outboundCrendential = new Credential();
        outboundCrendential.setAccessKey("VTNB745695C-77A9-4373-BF6B-FB653C0FD3B1");
        outboundCrendential.setSecretKey("gQFfZA6c0gxsj7C8mzA=/rPKq5Qn7+RtxgXf4TwieBEw");
        return outboundCrendential;
    }

    public static List<TransactionResponse> toTransactionResponse(List<Transaction> unpaidTransactionList) {
        LOGGER.info("MoneyRunOutboundObjectMapper: Outbound UnpaidTransactionList to Gateway TransactionResponse List ");
        List<TransactionResponse> transactionList = new ArrayList<>();
        unpaidTransactionList.forEach(item -> {
            TransactionResponse gTransactionResponse = new TransactionResponse();
            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> map = mapper.convertValue(item, Map.class);

            gTransactionResponse.setReferenceNumber(item.getTransferNo());
            gTransactionResponse.setMetadata(map);
            transactionList.add(gTransactionResponse);

        });
        return transactionList;


    }

    public static TransactionStatusChangeResponse toTransactionStatusChangeResponse(OutboundResponse outboundResponse) {
        LOGGER.info("MoneyRunOutboundObjectMapper: OutboundResponse object to  gateway TransactionStatusChangeResponse object");
        TransactionStatusChangeResponse txn = new TransactionStatusChangeResponse();
        txn.setMessage(outboundResponse.getMessage());
        txn.setCode(String.valueOf(outboundResponse.getCode()));
        if (outboundResponse.getCode() == 1) {
            txn.setSuccess(true);
        }
        return txn;
    }
}
