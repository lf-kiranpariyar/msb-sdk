package com.lftechnology.vtn.api;

import com.lftechnology.vtn.dto.request.BankRequest;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.BankResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BankApiTest {
    Credential credential = new Credential("Invalid", "invalid");

    @Test
    public void verifyBank() {
        //Given
        BankApi bankApi = new BankApi(credential);
        BankRequest bankRequest = new BankRequest();
        bankRequest.setBankAccountName("PETER OJO");
        bankRequest.setBankAccountNumber("2173986879");
        bankRequest.setBankName("000015");

        //When
        BankResponse bankResponse = bankApi.verifyBank(bankRequest);


        //Then
        assertNotNull(bankResponse);
    }
}