package com.lftechnology.moneytun.outbound;


import com.lftechnology.moneytun.outbound.dto.APIContext;
import com.lftechnology.moneytun.outbound.dto.Credential;
import com.lftechnology.moneytun.outbound.dto.OutboundResponse;
import com.lftechnology.moneytun.outbound.dto.Transaction;
import com.lftechnology.moneytun.outbound.enums.ApiMode;
import com.lftechnology.moneytun.outbound.exception.ApiException;
import com.lftechnology.moneytun.outbound.exception.OutboundException;
import com.lftechnology.moneytun.outbound.service.OutboundService;
import com.lftechnology.moneytun.outbound.service.impl.OutboundServiceImpl;
import org.junit.Test;

import java.util.List;

public class OutboundServiceImplTest {


    @Test
    public void getTransactionListTest() {

        try {


            Credential credential = new Credential();
            credential.setAccessKey("VTNB745695C-77A9-4373-BF6B-FB653C0FD3B1");
            credential.setSecretKey("rPKq5Qn7+RtxgXf4TwieBEw/gQFfZA6c0gxsj7C8mzA=");
            APIContext apiContext = new APIContext(credential, ApiMode.SANDBOX);

            OutboundService outboundService = new OutboundServiceImpl();
            List<Transaction> response = outboundService.getUnpaidTransactionList(apiContext, "test", "TRG");
            System.out.println(response.toString());


        } catch (ApiException e) {
            System.out.println(e.getMessage());
        } catch (OutboundException e) {
            System.out.println(e.getMessage());
        }


    }


    @Test
    public void confirmTransactionTest() {
        Credential credential = new Credential();
        credential.setAccessKey("VTNB745695C-77A9-4373-BF6B-FB653C0FD3B1");
        credential.setSecretKey("rPKq5Qn7+RtxgXf4TwieBEw/gQFfZA6c0gxsj7C8mzA=");
        APIContext apiContext = new APIContext(credential, ApiMode.SANDBOX);
        OutboundService outboundService = new OutboundServiceImpl();
        OutboundResponse outboundResponse = outboundService.confirmTransaction(apiContext, "033341240", "TRG");
        System.out.println(outboundResponse.toString());


    }

}
