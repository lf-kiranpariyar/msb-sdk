package com.lftechnology.moneytun.outbound.service;

import com.lftechnology.moneytun.outbound.dto.Credential;
import com.lftechnology.moneytun.outbound.dto.OutboundResponse;
import com.lftechnology.moneytun.outbound.dto.UnpaidTransactionList;

public interface OutboundService {

    OutboundResponse getToken(String accessKey);

    UnpaidTransactionList getUnpaidTransactionList(Credential credential, String transferNo, String payeeCode);

    OutboundResponse confirmTransaction(Credential credential, String transferNo, String payeeCode);
}
