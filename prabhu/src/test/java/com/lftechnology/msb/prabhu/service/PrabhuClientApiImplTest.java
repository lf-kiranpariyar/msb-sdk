package com.lftechnology.msb.prabhu.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lftechnology.msb.prabhu.dto.TransactionDetail;
import com.lftechnology.msb.prabhu.dto.TransactionResponse;
import com.lftechnology.msb.prabhu.webservices.ArrayOfReturnAGENTLIST;
import com.lftechnology.msb.prabhu.webservices.IRemitServiceSoap;
import com.lftechnology.msb.prabhu.dto.BankInfo;
import com.lftechnology.msb.prabhu.dto.Credential;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.lftechnology.msb.prabhu.webservices.IRemitService;
import com.lftechnology.msb.prabhu.webservices.ReturnAGENTLIST;

import java.util.List;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
@RunWith(JUnit4.class)
public class PrabhuClientApiImplTest {

    @Test
    public void shouldReturnAgentList(){
        IRemitService iRemitService = new IRemitService();
        IRemitServiceSoap iRemitServiceSoap = iRemitService.getIRemitServiceSoap();
        Credential credential = getCredential();
        BankInfo bankInfo = getBankInfo();
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
        returnAGENTLIST.forEach(it->{
            try {
                System.out.println(new ObjectMapper().writeValueAsString(returnAGENTLIST));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            System.out.println(it.getAGENT());
            System.out.println(it.getBANKBRANCHID());
            System.out.println(it.getLOCATIONID());
        });
        Assert.assertNotEquals(1,returnAGENTLIST.size());
    }

    @Test
    public void shouldReturnTransactionCreationResponse(){
        PrabhuClientApi prabhuClientApi = new PrabhuClientApiImpl();
        Credential credential = getCredential();
        TransactionDetail transactionDetail = buildTransactionDetail();
        TransactionResponse transactionResponse = prabhuClientApi.createTransaction(credential,transactionDetail);
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
        transactionDetail.setSenderIdNumber("13213123");
        transactionDetail.setSenderIdIsuueDate("2016-05-12");
        transactionDetail.setSenderIdExpireDate("2020-12-10");
        transactionDetail.setSenderDateofBirth("1993-02-15");
        transactionDetail.setReceiverName("summit bajracharya");
        transactionDetail.setReceiverAddress("Daehak");
        transactionDetail.setReceiverContactNumber("1234567895");
        transactionDetail.setReceiverCity("city");
        transactionDetail.setReceiverCountry("Vietnam");
        transactionDetail.setTransferAmount("10");
        transactionDetail.setPaymentMode("D");
        transactionDetail.setBankBranchName("An Binh Commercial Joint Stock Bank");
        transactionDetail.setBankAccountNumber("123456");
        transactionDetail.setBankLocationId("39325698");
        transactionDetail.setBankId("6451");
        transactionDetail.setCalcBy("C");
        transactionDetail.setSenderOccupation("Software Engineer");
        transactionDetail.setSenderSourceOfFund("Business");
        transactionDetail.setSenderBeneficiaryRelationship("Brother");
        transactionDetail.setPurposeOfRemittance("Home Maintenance");
        transactionDetail.setSenderSSN("123456780");
        return transactionDetail;
    }

    private Credential getCredential(){
        Credential credential = new Credential();
        credential.setAgentCode("SODA01");
        credential.setAgentUserId("SODACREWAPI");
        credential.setAgentPassword("Sh_X=p5$43");
        credential.setAgentSessionId("1234");
        return credential;
    }

    private BankInfo getBankInfo(){
        BankInfo bankInfo = new BankInfo();
        bankInfo.setPayoutCountry("VIETNAM");
        bankInfo.setPaymentType("D");
        return bankInfo;
    }
}
