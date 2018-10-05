package com.lftechnology.vtn.api;

import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.FxRateResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class FxRateApiTest {

    @Test
    public void getRate() {
        //Given
        Credential credential = new Credential("Invalid", "invalid");
        FxRateApi fxRateApi = new FxRateApi(credential);

        //When
        FxRateResponse fxRateResponse = fxRateApi.getRate("USD");

        //Then
        fxRateResponse.toString();
        System.out.println(fxRateResponse.toString());
        assertNotNull(fxRateResponse);


    }
}