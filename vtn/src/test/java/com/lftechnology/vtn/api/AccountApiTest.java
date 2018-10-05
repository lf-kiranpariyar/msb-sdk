package com.lftechnology.vtn.api;

import com.lftechnology.vtn.dto.request.AccountStatusRequest;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.AccountStatusResponse;
import com.lftechnology.vtn.exception.VtnException;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AccountApiTest {


    @Test
    public void getAccount() {
        //Given
        Credential credential = new Credential("Invalid", "invalid");
        AccountStatusRequest accountStatusRequest = new AccountStatusRequest();
        accountStatusRequest.setEmail("peter@peterojo.com");
        AccountApi accountApi = new AccountApi(credential);

        //When0
        AccountStatusResponse accountStatusResponse = accountApi.getAccount(accountStatusRequest);

        //Then
        assertNotNull(accountStatusResponse);


    }

    @Test(expected = VtnException.class)
    public void testVtnExceptionOfInvalidAccesstoken() {

        //Given
        Credential credential = new Credential("Invalid", "invalid");
        //When
        AccountStatusRequest accountStatusRequest = new AccountStatusRequest();
        accountStatusRequest.setEmail("peter@peterojo.com");
        AccountApi accountApi = new AccountApi(credential);

        //Then
        AccountStatusResponse accountStatusResponse = accountApi.getAccount(accountStatusRequest);


    }


}