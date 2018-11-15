package com.lftechnology.msb.sdk.service.delivery;

import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.dto.TransactionStatusChangeResponse;

import java.util.List;

public interface DeliveryConfirmationService {

    TransactionStatusChangeResponse confirmTransaction(String credential, String transferNo, String payeeCode );

    List<TransactionResponse> getUnpaidTransactionList(String credential, String transferNo, String payeeCode);
}
