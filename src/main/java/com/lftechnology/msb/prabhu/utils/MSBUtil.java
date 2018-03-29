package com.lftechnology.msb.prabhu.utils;

import com.lftechnology.msb.prabhu.dto.*;
import com.lftechnology.msb.prabhu.webservices.ReturnCreateTXN;
import com.lftechnology.msb.prabhu.webservices.ReturnTXNCancel;
import prabhu.dto.*;
import com.lftechnology.msb.prabhu.webservices.ReturnAGENTLIST;
import com.lftechnology.msb.prabhu.webservices.SendTransaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class MSBUtil {

    private MSBUtil(){
    }

    public static TransactionResponse mapToTransactionResponse(ReturnCreateTXN returnCreateTXN){
        TransactionResponse transactionResponse = new TransactionResponse();
        transactionResponse.setCode(returnCreateTXN.getCODE());
        transactionResponse.setPinNumber(returnCreateTXN.getPINNO());
        transactionResponse.setAgentTxnId(returnCreateTXN.getAGENTTXNID());
        transactionResponse.setCollectCurrency(returnCreateTXN.getCOLLECTCURRENCY());
        transactionResponse.setMessage(returnCreateTXN.getMESSAGE());
        transactionResponse.setCollectAmount(returnCreateTXN.getCOLLECTAMT());
        transactionResponse.setPayoutAmount(returnCreateTXN.getPAYOUTAMT());
        transactionResponse.setPayoutCurrency(returnCreateTXN.getPAYOUTCURRENCY());
        transactionResponse.setTxnDate(returnCreateTXN.getTXNDATE());
        transactionResponse.setExchangeRate(returnCreateTXN.getEXCHANGERATE());
        return transactionResponse;
    }

    public static SendTransaction mapToSenderTransaction(Credential credential, TransactionDetail transactionDetail) {
        SendTransaction sendTransaction = new SendTransaction();
        sendTransaction.setAGENTCODE(credential.getAgentCode());
        sendTransaction.setUSERID(credential.getAgentUserId());
        sendTransaction.setPASSWORD(credential.getAgentPassword());
        sendTransaction.setAGENTSESSIONID(credential.getAgentSessionId());
        sendTransaction.setLOCATIONID(credential.getAgentLocationId());
        sendTransaction.setAGENTTXNID(transactionDetail.getAgentTxnId());
        sendTransaction.setSENDERNAME(transactionDetail.getSenderName());
        sendTransaction.setSENDERADDRESS(transactionDetail.getSenderAddress());
        sendTransaction.setSENDERMOBILE(transactionDetail.getSenderMobile());
        sendTransaction.setSENDERCITY(transactionDetail.getSenderCity());
        sendTransaction.setSENDERCOUNTRY(transactionDetail.getSenderCountry());
        sendTransaction.setSENDERIDTYPE(transactionDetail.getSenderIdType());
        sendTransaction.setSENDERIDNUMBER(transactionDetail.getSenderIdNumber());
        sendTransaction.setSENDERIDISSUEDATE(transactionDetail.getSenderIdIsuueDate());
        sendTransaction.setSENDERIDEXPIREDATE(transactionDetail.getSenderIdExpireDate());
        sendTransaction.setRECEIVERNAME(transactionDetail.getReceiverName());
        sendTransaction.setRECEIVERADDRESS(transactionDetail.getReceiverAddress());
        sendTransaction.setRECEIVERCONTACTNUMBER(transactionDetail.getReceiverContactNumber());
        sendTransaction.setRECEIVERCITY(transactionDetail.getReceiverCity());
        sendTransaction.setRECEIVERCOUNTRY(transactionDetail.getReceiverCountry());
        sendTransaction.setTRANSFERAMOUNT(transactionDetail.getTransferAmount());
        sendTransaction.setPAYMENTMODE(transactionDetail.getPaymentMode());
        sendTransaction.setBANKID(transactionDetail.getBankId());
        sendTransaction.setBANKBRANCHID(transactionDetail.getBankBranchId());
        sendTransaction.setSENDEROCCUPATION(transactionDetail.getSenderOccupation());
        sendTransaction.setSENDERSOURCEOFFUND(transactionDetail.getSenderSourceOfFund());
        sendTransaction.setSENDERBENEFICIARYRELATIONSHIP(transactionDetail.getSenderBeneficiaryRelationship());
        sendTransaction.setPURPOSEOFREMITTANCE(transactionDetail.getPurposeOfRemittance());
        sendTransaction.setSENDERSOCIALSECURITYNUMBER(transactionDetail.getSenderSSN());
        return sendTransaction;
    }

    public static List<Agent> mapToListOfAgent(List<ReturnAGENTLIST> returnAGENTLISTS){
        List<Agent> agentList = new ArrayList<>();
        Map<String, List<ReturnAGENTLIST>> agentGroups = returnAGENTLISTS.stream().collect(Collectors.groupingBy(ReturnAGENTLIST::getAGENT));
        for (Map.Entry<String, List<ReturnAGENTLIST>> entry : agentGroups.entrySet()) {
            Agent agent = new Agent();
            agent.setAgent(entry.getKey());
            List<AgentBranch> agentBranchList = new ArrayList<>();
            List<ReturnAGENTLIST> agentBranchesFromApi = entry.getValue();
            agentBranchesFromApi.forEach(returnAGENTLIST -> agentBranchList.add(mapToAgentBranch(returnAGENTLIST)));
            agent.setAgentBranchList(agentBranchList);
            agentList.add(agent);
        }
        return agentList;
    }

    private static AgentBranch mapToAgentBranch(ReturnAGENTLIST returnAGENTLIST){
        return new AgentBranch(
                returnAGENTLIST.getLOCATIONID(),
                returnAGENTLIST.getBRANCH(),
                returnAGENTLIST.getADDRESS(),
                returnAGENTLIST.getCITY(),
                returnAGENTLIST.getCURRENCY(),
                returnAGENTLIST.getBANKID(),
                returnAGENTLIST.getBANKBRANCHID(),
                returnAGENTLIST.getBANKBRANCHSTATE(),
                returnAGENTLIST.getAGENTCODE()
        );
    }

    public static CancelResponse mapToCancelTransactionResponse(ReturnTXNCancel returnTXNCancel) {
        CancelResponse cancelResponse = new CancelResponse();
        cancelResponse.setCode(returnTXNCancel.getCODE());
        cancelResponse.setMsbTxnId(returnTXNCancel.getPINNO());
        return cancelResponse;
    }
}
