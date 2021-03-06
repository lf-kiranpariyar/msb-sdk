package com.lftechnology.msb.sdk.service;

import com.lftechnology.msb.sdk.dto.BankInfo;
import com.lftechnology.msb.sdk.dto.Credential;
import com.lftechnology.msb.sdk.dto.TransactionDetail;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import prabhu.webservices.ArrayOfReturnAGENTLIST;
import prabhu.webservices.IRemitService;
import prabhu.webservices.IRemitServiceSoap;
import prabhu.webservices.ReturnAGENTLIST;

import java.util.List;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
@RunWith(JUnit4.class)
public class MSBClientApiImplTest {

    @Test
    public void shouldReturnAgentList(){
        IRemitService iRemitService = new IRemitService();
        IRemitServiceSoap iRemitServiceSoap = iRemitService.getIRemitServiceSoap();
        Credential credential = getCredential();
        BankInfo bankInfo = getBankInfo();
        //        ReturnFOREX exRate = iRemitServiceSoap
//                .getEXRate(agentCode, userName, password, sessionId, transferAmount, paymentMode, calcBy, locationId, payoutCountry, "",
//                        "");

        ArrayOfReturnAGENTLIST arrayOfReturnAGENTLIST = iRemitServiceSoap.getAgentList(
                credential.getAgentCode(),
                credential.getAgentUserId(),
                credential.getAgentPassword(),
                credential.getAgentSessionId(),
                bankInfo.getPaymentType(),
                bankInfo.getPayoutCountry(),
                null,
                null
        );
        List<ReturnAGENTLIST> returnAGENTLIST = arrayOfReturnAGENTLIST.getReturnAGENTLIST();
        Assert.assertNotEquals(1,returnAGENTLIST.size());
    }

    @Test
    public void shouldReturnTransactionCreationResponse(){
        MSBClientApi msbClientApi = new MSBClientApiImpl();
        Credential credential = getCredential();
        TransactionDetail transactionDetail = buildTransactionDetail();
        TransactionResponse transactionResponse = msbClientApi.createTransaction(credential,transactionDetail);
        System.out.println(transactionDetail);
        System.out.println(transactionResponse);
    }

    private TransactionDetail buildTransactionDetail(){
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setSenderName("kiran Pariyar");
        transactionDetail.setSenderAddress("texas");
        transactionDetail.setSenderMobile("1234567895");
        transactionDetail.setSenderCity("texas");
        transactionDetail.setSenderCountry("United States");
        transactionDetail.setSenderIdType("passport");
        transactionDetail.setSenderIdNumber("12345");
        transactionDetail.setSenderIdIsuueDate("2016-05-12");
        transactionDetail.setSenderIdExpireDate("2020-12-10");
        transactionDetail.setSenderDateofBirth("1993-02-15");
        transactionDetail.setReceiverName("summit bajracharya");
        transactionDetail.setReceiverAddress("Daehak");
        transactionDetail.setReceiverContactNumber("1234567895");
        transactionDetail.setReceiverCity("city");
        transactionDetail.setReceiverCountry("Republic of Korea");
        transactionDetail.setTransferAmount("10");
        transactionDetail.setPaymentMode("D");
        transactionDetail.setBankBranchName("KukMin Bank");
        transactionDetail.setBankAccountNumber("123456");
        transactionDetail.setBankLocationId("96855786");
        transactionDetail.setBankId("7205");
        transactionDetail.setCalcBy("C");
        transactionDetail.setSenderOccupation("Software Engineer");
        transactionDetail.setSenderSourceOfFund("Business");
        transactionDetail.setSenderBeneficiaryRelationship("Brother");
        transactionDetail.setPurposeOfRemittance("Home Maintenance");
        transactionDetail.setSenderSSN("123456789");
        return transactionDetail;
    }

    private Credential getCredential(){
        Credential credential = new Credential();
        credential.setAgentCode("sadasdf");
        credential.setAgentUserId("asdffsd");
        credential.setAgentPassword("asdfasfd");
        credential.setAgentSessionId("1234");
        return credential;
    }

    private BankInfo getBankInfo(){
        BankInfo bankInfo = new BankInfo();
        bankInfo.setPayoutCountry("REPUBLIC OF KOREA");
        bankInfo.setPaymentType("D");
        return bankInfo;
    }
}
