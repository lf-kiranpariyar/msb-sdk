package com.lftechnology.moneytun.outbound.service;

import com.lftechnology.moneytun.outbound.dto.Response;
import com.lftechnology.moneytun.outbound.dto.UnpaidTransactionList;

public interface OutboundService {

    Response getToken(String accessKey);

    UnpaidTransactionList getUnpaidTransactionList(String transferNo, String payeeCode);

    Response confirmTransaction(String transferNo, String payeeCode);
}
