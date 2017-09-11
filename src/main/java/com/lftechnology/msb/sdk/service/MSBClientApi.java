package com.lftechnology.msb.sdk.service;

import com.lftechnology.msb.sdk.dto.Agent;
import com.lftechnology.msb.sdk.dto.BankInfo;
import com.lftechnology.msb.sdk.dto.Credential;
import com.lftechnology.msb.sdk.dto.TransactionDetail;
import com.lftechnology.msb.sdk.dto.TransactionResponse;

import java.util.List;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public interface MSBClientApi {

    TransactionResponse createTransaction(Credential credential,TransactionDetail transactionDetail);

    List<Agent> getAgents(Credential credential,BankInfo bankInfo);

}
