package com.lftechnology.msb.sdk.service;

import com.lftechnology.msb.sdk.dto.Transaction;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.dto.TransactionStatusChangeRequest;

public interface MsbClientService {

    TransactionResponse create(Transaction transaction, String credentials);

    TransactionResponse fetch(String referenceId, String credentials);

    Boolean changeTransactionStatus(TransactionStatusChangeRequest changeRequest, String credentials);

    Boolean acknowledgeTransaction(String referenceId, String credential);
}
