package com.lftechnology.vtn.sdk.api;


import com.lftechnology.vtn.sdk.dto.Request.BankRequestDTO;
import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.BankResponseDTO;
import com.lftechnology.vtn.sdk.exception.ApiException;
import com.lftechnology.vtn.sdk.exception.VtnException;
import com.lftechnology.vtn.sdk.services.BankApiService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

/**
 *
 * Bank related Api request are handle by this class
 * @author shankar ghimire
 */

public class BankApi {

    private RequestApi requestApi;

    public BankApi(){
        this.requestApi = new RequestApi();
    }

    /**
     * verifyBank will call Api to verify Bank  and if sucess return BankResponseDTO object
     * @param bankRequestDTO :@see com.lftechnology.vtn.sdk.dto.Request.BankRequestDTO
     * @param credentials :@see com.lftechnology.vtn.sdk.dto.Request.Credentials
     * @return
     */
    public BankResponseDTO verifyBank(BankRequestDTO bankRequestDTO, Credentials credentials) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        BankApiService service = retrofit.create(BankApiService.class);
        String accessToken = credentials.getAccessToken();
        String accessKey = credentials.getAccessKey();
        String bankName = bankRequestDTO.getBankName();
        String bankAccountName = bankRequestDTO.getBankAccountName();
        String bankAccountNum = bankRequestDTO.getBankAccountNumber();
        Call<BankResponseDTO> call = service.verifyBank(accessToken,accessKey,bankName,bankAccountName,bankAccountNum);
        BankResponseDTO bankResponseDTO = executeApiCall(call);
        if(bankResponseDTO.getCode().equals("R00")){
            return bankResponseDTO;
        }
        throw new VtnException(bankResponseDTO.getMessage(),bankResponseDTO.getCode());
    }


    private BankResponseDTO executeApiCall(Call<BankResponseDTO> call) {
        try {
            Response<BankResponseDTO> response = call.execute();
            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }
            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }

}
