package com.lftechnology.vtn.api;

import com.lftechnology.vtn.dto.request.BankRequest;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.BankResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankApiTest {
    private Credential credential = new Credential("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
    @Test
    public void verifyBank() {
        //Given
        BankApi bankApi = new BankApi(credential);
        BankRequest bankRequest = new BankRequest();
        bankRequest.setBankAccountName("PETER   OJO");
        bankRequest.setBankAccountNumber("2173986879");
        bankRequest.setBankName("000015");

        //When
        BankResponse bankResponse = bankApi.verifyBank(bankRequest);


        //Then
        assertNotNull(bankResponse);
    }
}