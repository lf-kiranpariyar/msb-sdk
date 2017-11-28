package com.lftechnology.msb.sdk.service;

import com.lftechnology.msb.sdk.constant.MSBConstant;
import com.lftechnology.msb.sdk.dto.Agent;
import com.lftechnology.msb.sdk.dto.BankInfo;
import com.lftechnology.msb.sdk.dto.CancelResponse;
import com.lftechnology.msb.sdk.dto.CancelTransactionDetail;
import com.lftechnology.msb.sdk.dto.Credential;
import com.lftechnology.msb.sdk.dto.TransactionDetail;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.utils.MSBUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import prabhu.webservices.ArrayOfReturnAGENTLIST;
import prabhu.webservices.IRemitService;
import prabhu.webservices.IRemitServiceSoap;
import prabhu.webservices.ReturnAGENTLIST;
import prabhu.webservices.ReturnCreateTXN;
import prabhu.webservices.ReturnTXNCancel;

import java.util.List;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class MSBClientApiImpl implements MSBClientApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(MSBClientApi.class);

    @Override
    public TransactionResponse createTransaction(Credential credential, TransactionDetail transactionDetail) {
        IRemitService iRemitService =new IRemitService();
        IRemitServiceSoap iRemitServiceSoap = iRemitService.getIRemitServiceSoap();
        ReturnCreateTXN returnCreateTXN = iRemitServiceSoap.sendTransaction(
                credential.getAgentCode(),
                credential.getAgentUserId(),
                credential.getAgentPassword(),
                credential.getAgentSessionId(),
                transactionDetail.getAgentTxnId(),
                transactionDetail.getBankLocationId(),
                transactionDetail.getSenderName(),
                transactionDetail.getSenderAddress(),
                transactionDetail.getSenderMobile(),
                transactionDetail.getSenderCity(),
                transactionDetail.getSenderCountry(),
                transactionDetail.getSenderIdType(),
                transactionDetail.getSenderIdNumber(),
                transactionDetail.getSenderIdIsuueDate(),
                transactionDetail.getSenderIdExpireDate(),
                transactionDetail.getSenderDateofBirth(),
                transactionDetail.getReceiverName(),
                transactionDetail.getReceiverAddress(),
                transactionDetail.getReceiverContactNumber(),
                transactionDetail.getReceiverCity(),
                transactionDetail.getReceiverCountry(),
                transactionDetail.getTransferAmount(),
                transactionDetail.getPaymentMode(),
                transactionDetail.getBankId(),
                transactionDetail.getBankAccountNumber(),
                transactionDetail.getCalcBy(), "",
                transactionDetail.getBankBranchName(),
                transactionDetail.getBankBranchId(),
                transactionDetail.getSenderOccupation(),
                transactionDetail.getSenderSourceOfFund(),
                transactionDetail.getSenderBeneficiaryRelationship(),
                transactionDetail.getPurposeOfRemittance(),
                "", "",
                transactionDetail.getSenderSSN()
        );
        return MSBUtil.mapToTransactionResponse(returnCreateTXN);
    }

    @Override
    public List<Agent> getAgents(Credential credential, BankInfo bankInfo) {
        IRemitService iRemitService =new IRemitService();
        IRemitServiceSoap iRemitServiceSoap = iRemitService.getIRemitServiceSoap();
        System.out.println(credential.toString());
        System.out.println(bankInfo.getPaymentType());
        System.out.println(bankInfo.getPayoutCountry());
        ArrayOfReturnAGENTLIST arrayOfReturnAGENTLIST = iRemitServiceSoap.getAgentList(
                credential.getAgentCode(),
                credential.getAgentUserId(),
                credential.getAgentPassword(),
                credential.getAgentSessionId(),
                bankInfo.getPaymentType(),
                bankInfo.getPayoutCountry(),
                bankInfo.getBankName(),
                bankInfo.getBranchState()
        );
        List<ReturnAGENTLIST> returnAGENTLIST = arrayOfReturnAGENTLIST.getReturnAGENTLIST();
        return MSBUtil.mapToListOfAgent(returnAGENTLIST);
    }

    @Override
    public CancelResponse cancelTransaction(Credential credential, CancelTransactionDetail cancelTransactionDetail) {
        IRemitService iRemitService =new IRemitService();
        IRemitServiceSoap iRemitServiceSoap = iRemitService.getIRemitServiceSoap();
        ReturnTXNCancel returnTXNCancel = iRemitServiceSoap.cancelTransactionv2(
                credential.getAgentCode(),
                credential.getAgentUserId(),
                credential.getAgentPassword(),
                cancelTransactionDetail.getMsbTxnId(),
                credential.getAgentSessionId(),
                cancelTransactionDetail.getCancelComment()
        );

        if(returnTXNCancel.getCODE().equals(MSBConstant.SUCCESS)){
            return MSBUtil.mapToCancelTransactionResponse(returnTXNCancel);
        }else {
            LOGGER.debug("Could not cancel transaction in MSB." + returnTXNCancel.toString());
            CancelResponse cancelResponse = new CancelResponse();
            cancelResponse.setCode(MSBConstant.FAILED);
            cancelResponse.setMsbTxnId(cancelTransactionDetail.getMsbTxnId());
            return cancelResponse;
        }
    }
}
