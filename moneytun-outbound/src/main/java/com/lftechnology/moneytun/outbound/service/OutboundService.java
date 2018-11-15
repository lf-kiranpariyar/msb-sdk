package com.lftechnology.moneytun.outbound.service;

import com.lftechnology.moneytun.outbound.dto.APIContext;
import com.lftechnology.moneytun.outbound.dto.OutboundResponse;
import com.lftechnology.moneytun.outbound.dto.Transaction;

import java.util.List;

public interface OutboundService {

    List<Transaction> getUnpaidTransactionList(APIContext apiContext, String transferNo, String payeeCode);

    OutboundResponse confirmTransaction(APIContext apiContext, String transferNo, String payeeCode);
}
