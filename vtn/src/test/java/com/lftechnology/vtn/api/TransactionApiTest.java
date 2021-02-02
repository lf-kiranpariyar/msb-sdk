package com.lftechnology.vtn.api;

import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.request.TransactionRequest;
import com.lftechnology.vtn.dto.response.TransactionResponse;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertNotNull;


public class TransactionApiTest {

    @Test
    public void createTransaction() {

        //Given
        Credential credential = new Credential("Invalid", "invalid");
        TransactionRequest transactionRequest = new TransactionRequest.Builder()
                .setTransactionDetail("a6c3055c-bbed-11e8-a355-529269fb1459", LocalDate.now(), 2)
                .setSenderDetail("Peter", "Ojo", "peter@peterojo.com", "123444", "USA")
                .setReceiverDetail("shankar", "Ghimire", "coder@gmail.com", "24555555", "Nigeria")
                .setAmount(new BigDecimal(1), new BigDecimal(101.95), "USD")
                .setFee(new BigDecimal(0.28), new BigDecimal(101.1))
                .setBankDetail("000015", "PETER   OJO", "2173986879")
                .build();

        TransactionApi transactionApi = new TransactionApi(credential);

        //When
        TransactionResponse transactionResponse = transactionApi.createTransaction(transactionRequest);

        //Then
        assertNotNull(transactionResponse);


    }

}