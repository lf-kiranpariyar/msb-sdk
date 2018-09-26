package com.lftechnology.vtn.sdk.api;

import com.lftechnology.vtn.sdk.dto.Balance;
import com.lftechnology.vtn.sdk.dto.Credential;
import com.lftechnology.vtn.sdk.exception.ApiException;
import com.lftechnology.vtn.sdk.exception.VtnException;
import com.lftechnology.vtn.sdk.services.BalanceApiService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

/**
 * Balance related Api request are handle by this class
 * @author shankar ghimire
 */

public class BalanceApi {

    private RequestApi requestApi;

    public BalanceApi() {
        this.requestApi = new RequestApi();
    }

    /**
     * Request on this <a>https://www.VirtualTerminalNetwork.com/API/RemittanceBalanceStatus.asp</a> with Crendential
     * and map the response to Balance dto
     * @return
     */
    public Balance getBalance() {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        BalanceApiService service = retrofit.create(BalanceApiService.class);
        Call<Balance> call = service.getBalance();
        Balance b = executeApiCall(call);


        if(b.getResponseCode().equals("R00"))
        {
            System.out.println("success response");
            return b;
        }
        throw new VtnException(b.getResponseMessage(),b.getResponseCode());

    }


    public static void main(String[] args) {
        System.out.println("runninigi");
        Credential.configure("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        BalanceApi balanceApi = new BalanceApi();
        Balance b = balanceApi.getBalance();
        System.out.println(b.getResponseMessage());

    }

    /**
     * Executes Api call and Handle any Error on Api Call
     * @param call
     * @return
     */
    private Balance executeApiCall(Call<Balance> call) {
        try {
            Response<Balance> response = call.execute();

            if (!response.isSuccessful()) {
                throw new ApiException(response.errorBody().string());
            }

            return response.body();
        } catch (IOException e) {
            throw new ApiException();
        }
    }
}
