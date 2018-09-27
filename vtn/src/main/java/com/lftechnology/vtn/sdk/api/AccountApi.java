package com.lftechnology.vtn.sdk.api;

import com.lftechnology.vtn.sdk.dto.Request.AccountStatusRequestDTO;
import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.AccountStatusResponseDTO;
import com.lftechnology.vtn.sdk.exception.ApiException;
import com.lftechnology.vtn.sdk.exception.VtnException;
import com.lftechnology.vtn.sdk.services.AccountApiService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

/**
 * AccountApi is used to call account related Api
 * @author shankar ghimire
 */
public class AccountApi {

    private RequestApi requestApi;

    public AccountApi() {

        this.requestApi = new RequestApi();
    }

    /**
     * This method will call api using requestApi object and  if sucucess return AccountStatusResponseDTO and on failure it will throw an error
     * @param account :@see com.lftechnology.vtn.sdk.dto.Response.AccountStatusResponseDTO
     * @param credentials :@see com.lftechnology.vtn.sdk.dto.Request.Credentials
     * @return AccountStatusResponseDTO : return if accountStatsusResponseDto code is R00
     */
    public AccountStatusResponseDTO getAccount(AccountStatusRequestDTO account, Credentials credentials) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        AccountApiService service = retrofit.create(AccountApiService.class);
        Call<AccountStatusResponseDTO> call = service.getAccount(credentials.getAccessToken(), credentials.getAccessKey(), account.getEmail());
        ;
        AccountStatusResponseDTO accountStatusResponseDTO = executeApiCall(call);

        if (accountStatusResponseDTO.getCode().equals("R00")) {
            return accountStatusResponseDTO;
        }
        throw new VtnException(accountStatusResponseDTO.getMessage(), accountStatusResponseDTO.getCode());

    }


    /**
     * exceute request and mapped to response dto
     * @param call
     * @return AccountStatusResponseDTO if response is sucessful
     */
    private AccountStatusResponseDTO executeApiCall(Call<AccountStatusResponseDTO> call) {
        try {
            Response<AccountStatusResponseDTO> response = call.execute();

            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }

            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }


}
