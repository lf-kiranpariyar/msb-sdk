package com.lftechnology.vtn.api;

import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.FxRateResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class FxRateApiTest {

    @Test
    public void getRate() {
        //Given
        Credential c = new Credential("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4", "MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        FxRateApi fxRateApi = new FxRateApi(c);

        //When
        FxRateResponse fxRateResponse = fxRateApi.getRate("USD");

        //Then
        assertNotNull(fxRateResponse);


    }
}