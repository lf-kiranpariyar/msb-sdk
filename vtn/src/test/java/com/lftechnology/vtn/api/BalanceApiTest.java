package com.lftechnology.vtn.api;

import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.BalanceResponse;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalanceApiTest {

    private Credential credential = new Credential("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");

    @Test
    public void getBalance() {
        //Given
        BalanceApi balanceApi = new BalanceApi(credential);

        //When
        BalanceResponse balanceQueryDTO = balanceApi.getBalance();

        //Then
        Assert.assertNotNull(balanceQueryDTO);

    }
}