package com.lftechnology.vtn.api;

import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.request.TransactionRequest;
import com.lftechnology.vtn.dto.response.TransactionResponse;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.*;

public class TransactionApiTest {

    @Test
    public void createTransaction() {

        //Given
        Credential credential = new Credential("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");

        TransactionRequest transactionRequest;
        transactionRequest = new TransactionRequest.Builder()
                .setTransactionId("a6c3055c-bbed-11e8-a355-529269fb1455")
                .setTransferType(2)
                .setTransferDate(LocalDate.now())
                .setSenderEmail("funmzjo@yahoo.com")
                .setSenderCountry("Nigeria")
                .setSenderFirstName("Olufunmilayo")
                .setReceiverCountry("Nigeria")
                .setReceiverFirstName("Shankar")
                .setReceiverEmail("shankar@gmail.com")
                .setCurrencyCode("USD")
                .setAmmountInNaira(new BigDecimal(362.50))
                .setAmmountInSenderCurrency(new BigDecimal(1))
                .setFeeInNaira(new BigDecimal(110))
                .setFeeInSenderCurrency(new BigDecimal(1))
                .setBankAccountName("Olufunmilayo Ojo")
                .setBankName("000013")
                .setBankAccountNumber("0120671057")
                .build();






        TransactionApi transactionApi = new TransactionApi(credential);

        TransactionResponse transactionResponse =transactionApi.createTransaction(transactionRequest);
        System.out.println(transactionResponse.toString());

        //When

        //Then

    }
}