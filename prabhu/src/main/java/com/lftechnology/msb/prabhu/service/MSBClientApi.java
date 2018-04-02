package com.lftechnology.msb.prabhu.service;

import com.lftechnology.msb.prabhu.dto.*;

import java.util.List;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public interface MSBClientApi {

    TransactionResponse createTransaction(Credential credential, TransactionDetail transactionDetail);

    Boolean amendTransaction(Credential credential, TransactionAmendmentDetail amendmentRequest);

    List<Agent> getAgents(Credential credential, BankInfo bankInfo);

    CancelResponse cancelTransaction(Credential credential, CancelTransactionDetail cancelTransactionDetail);

    Boolean acknowledgeTransaction(Credential credential,String msbTxnId);

}
