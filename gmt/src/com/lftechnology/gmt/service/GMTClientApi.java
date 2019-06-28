package com.lftechnology.gmt.service;

import com.lftechnology.gmt.dto.Agent;
import com.lftechnology.gmt.dto.BankInfo;
import com.lftechnology.gmt.dto.CancelResponse;
import com.lftechnology.gmt.dto.CancelTransactionDetail;
import com.lftechnology.gmt.dto.Credential;
import com.lftechnology.gmt.dto.TransactionAmendmentDetail;
import com.lftechnology.gmt.dto.TransactionDetail;
import com.lftechnology.gmt.dto.TransactionResponse;


import java.math.BigDecimal;
import java.util.List;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public interface GMTClientApi {

    TransactionResponse createTransaction(Credential credential, TransactionDetail transactionDetail);

    TransactionResponse getDetails(Credential credential, TransactionDetail transactionDetail);

    Boolean amendTransaction(Credential credential, TransactionAmendmentDetail amendmentRequest);

    List<Agent> getAgents(Credential credential, BankInfo bankInfo);

    CancelResponse cancelTransaction(Credential credential, CancelTransactionDetail cancelTransactionDetail);

    Boolean acknowledgeTransaction(Credential credential, String msbTxnId);

    BigDecimal getExchangeRate(Credential credential, String destinationCountryISOCode);

}
