package com.lftechnology.msb.sdk.service;

import com.lftechnology.msb.sdk.dto.BankInfo;
import com.lftechnology.msb.sdk.dto.Credential;
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

    private Credential getCredential(){
        Credential credential = new Credential();
        credential.setAgentCode("sjkfdl");
        credential.setAgentUserId("sadklf");
        credential.setAgentPassword("asjkdfl");
        return credential;
    }

    private BankInfo getBankInfo(){
        BankInfo bankInfo = new BankInfo();
        bankInfo.setPayoutCountry("REPUBLIC OF KOREA");
        bankInfo.setPaymentType("D");
        return bankInfo;
    }
}
