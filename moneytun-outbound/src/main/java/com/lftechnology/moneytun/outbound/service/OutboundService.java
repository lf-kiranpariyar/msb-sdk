package com.lftechnology.moneytun.outbound.service;

import com.lftechnology.moneytun.outbound.dto.Credential;
import com.lftechnology.moneytun.outbound.dto.Response;
import com.lftechnology.moneytun.outbound.dto.Transaction;
import com.lftechnology.moneytun.outbound.dto.UnpaidTransactionList;

import java.util.List;

public interface OutboundService {

    Response getToken(String accessKey);

    List<Transaction> getUnpaidTransactionList(Credential credential, String transferNo, String payeeCode);

    Response confirmTransaction(Credential credential, String transferNo, String payeeCode);
}
