package com.lftechnology.msb.sdk.service.delivery;

import com.lftechnology.msb.sdk.dto.TransactionResponse;

import java.util.List;

public interface DelvieryConfirmationService {

    Boolean confirmTransaction(String credential, String payeeCode );


    List<TransactionResponse> getUnpaidTransactionList(String credential, String transferNo, String payeeCode);
}
