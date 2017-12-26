package com.lftechnology.msb.sdk.service;

import com.lftechnology.msb.sdk.dto.*;
import prabhu.webservices.AmendmentRequest;
import prabhu.webservices.AmendmentRequestResponse;
import prabhu.webservices.CancelTransactionResponse;

import java.util.List;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public interface MSBClientApi {

    TransactionResponse createTransaction(Credential credential,TransactionDetail transactionDetail);

    Boolean amendTransaction(Credential credential, TransactionAmendmentDetail amendmentRequest);

    List<Agent> getAgents(Credential credential,BankInfo bankInfo);

    CancelResponse cancelTransaction(Credential credential,CancelTransactionDetail cancelTransactionDetail);

}
