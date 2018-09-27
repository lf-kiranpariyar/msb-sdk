package com.lftechnology.vtn.sdk.api;

import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Request.TransactionRequestDTO;
import com.lftechnology.vtn.sdk.dto.Response.BalanceResponseDTO;
import com.lftechnology.vtn.sdk.dto.Response.TransactionResponseDTO;
import com.lftechnology.vtn.sdk.exception.ApiException;
import com.lftechnology.vtn.sdk.exception.VtnException;
import com.lftechnology.vtn.sdk.services.BalanceApiService;
import com.lftechnology.vtn.sdk.services.TransactionApiService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

public class TransactionApi {
    private RequestApi requestApi;

    public TransactionApi(){
        this.requestApi = new RequestApi();
    }

    public TransactionResponseDTO crateTransaction(Credentials credentials, TransactionRequestDTO transactionRequestDTO) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        TransactionApiService service = retrofit.create(TransactionApiService.class);
        Call<TransactionResponseDTO> call = service.createTransaction(credentials.getAccessToken(),credentials.getAccessKey(),
                transactionRequestDTO.getTransactionId(), transactionRequestDTO.getTransferDate(),transactionRequestDTO.getTransferType(),
                transactionRequestDTO.getSenderEmail(), transactionRequestDTO.getSenderPhone(), transactionRequestDTO.getSenderFirstName(),
                transactionRequestDTO.getSenderLastName(), transactionRequestDTO.getSenderCountry(), transactionRequestDTO.getReceiverEmail(),
                transactionRequestDTO.getReceiverPhone(), transactionRequestDTO.getReceiverFirstName(), transactionRequestDTO.getGetReceiverLastName(),
                transactionRequestDTO.getReceiverCountry(), transactionRequestDTO.getCurrencyCode(), transactionRequestDTO.getAmmountInSenderCountry(),
                transactionRequestDTO.getAmmountInNaira(),transactionRequestDTO.getFeeInSenderCountry(),transactionRequestDTO.getFeeInNaira(),
                transactionRequestDTO.getAccountNumber(),transactionRequestDTO.getBankAccountName(),transactionRequestDTO.getBankName()
        );
        TransactionResponseDTO transactionResponseDTO = executeApiCall(call);
        System.out.println(transactionResponseDTO.getCode());
        if(transactionResponseDTO.getCode().equals("R00")){
            return transactionResponseDTO;
        }

        throw  new VtnException(transactionResponseDTO.getMessage(),transactionResponseDTO.getCode());



    }



    private TransactionResponseDTO executeApiCall(Call<TransactionResponseDTO> call) {
        try {
            Response<TransactionResponseDTO> response = call.execute();

            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }

            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }

}
