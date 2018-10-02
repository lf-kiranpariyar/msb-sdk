package com.lftechnology.moneytun.outbound;


import com.lftechnology.moneytun.outbound.dto.Response;
import com.lftechnology.moneytun.outbound.service.OutboundService;
import com.lftechnology.moneytun.outbound.service.impl.OutboundServiceImpl;
import org.junit.Test;

public class OutboundServiceImplTest {


    @Test
    public void getTokenTest(){
        OutboundService outboundService = new OutboundServiceImpl();
        Response response = outboundService.getToken("VTNB745695C-77A9-4373-BF6B-FB653C0FD3B1");
        System.out.println(response.toString());

    }
}
