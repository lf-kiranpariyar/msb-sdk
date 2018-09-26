package com.lftechnology.vtn.sdk.api;

import com.lftechnology.vtn.sdk.dto.Request.AccountStatusDTO;
import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.AccountStatusResponseDTO;
import com.lftechnology.vtn.sdk.exception.ApiException;
import com.lftechnology.vtn.sdk.services.AccountApiService;
import com.lftechnology.vtn.sdk.services.BalanceApiService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.Date;

public class AccountApi {

    private RequestApi requestApi;

    public AccountApi() {

        this.requestApi = new RequestApi();
    }

    public AccountStatusResponseDTO getAccount(AccountStatusDTO account, Credentials credentials) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        AccountApiService service = retrofit.create(AccountApiService.class);
        Call<AccountStatusResponseDTO> call =  service.getAccount(credentials.getAccessToken(),credentials.getAccessKey(),account.getEmail());;
        AccountStatusResponseDTO a = executeApiCall(call);

        return a;

    }

//
//    public static void main(String [] args){
//        System.out.println("runninigi");
//        Credential.configure("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
//        AccountApi accountApi = new AccountApi();
//        Account b = accountApi.getAccount( new Account("Peter","Ojo","peter@peterojo.com","808-688-2292",new Date(7/6/1968)));
//        System.out.println(b.getFirstName());
//    }
//

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
