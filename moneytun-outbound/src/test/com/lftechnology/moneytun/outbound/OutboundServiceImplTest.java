package com.lftechnology.moneytun.outbound;



import com.lftechnology.moneytun.outbound.dto.Credential;
import com.lftechnology.moneytun.outbound.dto.OutboundResponse;
import com.lftechnology.moneytun.outbound.dto.UnpaidTransactionList;
import com.lftechnology.moneytun.outbound.service.OutboundService;
import com.lftechnology.moneytun.outbound.service.impl.OutboundServiceImpl;
import org.junit.Test;

public class OutboundServiceImplTest {


    @Test
    public void getTokenTest(){
        OutboundService outboundService = new OutboundServiceImpl();
        OutboundResponse outboundResponse = outboundService.getToken("VTNB745695C-77A9-4373-BF6B-FB653C0FD3B1");
        System.out.println(outboundResponse.toString());

    }

    @Test
    public void getTransactionListTest(){
        Credential credential = new Credential();
        credential.setAccessKey("VTNB745695C-77A9-4373-BF6B-FB653C0FD3B1");
        credential.setSecretKey("rPKq5Qn7+RtxgXf4TwieBEw/gQFfZA6c0gxsj7C8mzA=");

        OutboundService outboundService = new OutboundServiceImpl();
        UnpaidTransactionList response = outboundService.getUnpaidTransactionList(credential,"033341240","TRG");
        System.out.println(response.getUnpaidTransactions().toString());

    }


    @Test
    public void confirmTransactionTest(){
        Credential credential = new Credential();
        credential.setAccessKey("VTNB745695C-77A9-4373-BF6B-FB653C0FD3B1");
        credential.setSecretKey("rPKq5Qn7+RtxgXf4TwieBEw/gQFfZA6c0gxsj7C8mzA=");

        OutboundService outboundService = new OutboundServiceImpl();
        OutboundResponse outboundResponse = outboundService.confirmTransaction(credential,"033341240","TRG");
        System.out.println(outboundResponse.toString());


    }

}
