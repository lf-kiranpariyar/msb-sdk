package com.lftechnology.vtn.sdk.api;

import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.ManualUpdateListResponseDTO;
import com.lftechnology.vtn.sdk.dto.Response.ManualUpdateResponseDTO;
import com.lftechnology.vtn.sdk.exception.ApiException;
import com.lftechnology.vtn.sdk.exception.VtnException;
import com.lftechnology.vtn.sdk.services.ManualUpdateService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

/**
 * @author shankar ghimire
 */

public class ManualUpdateApi {


    private RequestApi requestApi;


    public ManualUpdateApi() {


        this.requestApi = new RequestApi();


    }


    /**
     * This method will call api using requestApi object and  if sucucess return AccountStatusResponseDTO and on failure it will throw an error
     *
     * @param account     :@see com.lftechnology.vtn.sdk.dto.Response.AccountStatusResponseDTO
     * @param credentials :@see com.lftechnology.vtn.sdk.dto.Request.Credentials
     * @return AccountStatusResponseDTO : return if accountStatsusResponseDto code is R00
     */


    public ManualUpdateListResponseDTO getStatus(Credentials credentials,String transactionId) {


        Retrofit retrofit = this.requestApi.getRetrofitObject();


        ManualUpdateService service = retrofit.create(ManualUpdateService.class);


        Call<ManualUpdateListResponseDTO> call = service.getStatus(credentials.getAccessToken(), credentials.getAccessKey(), transactionId);





        ManualUpdateListResponseDTO manualUpdateListResponseDTO = executeApiCall(call);
        System.out.println(manualUpdateListResponseDTO.getTransaction()+"fsalkfj");


//        if (manualUpdateListResponseDTO.getCode().equals("R00")) {
//
//
//            return accountStatusResponseDTO;
//
//
//        }
//
//
//        throw new VtnException(accountStatusResponseDTO.getMessage(), accountStatusResponseDTO.getCode());
//
        return  manualUpdateListResponseDTO;

    }




//


//

    /**
     * //
     * exceute request and mapped to response dto
     *
     * @param call
     * @return AccountStatusResponseDTO if response is sucessful
     */


    private ManualUpdateListResponseDTO executeApiCall(Call<ManualUpdateListResponseDTO> call) {


        try {


            Response<ManualUpdateListResponseDTO> response = call.execute();


            if (!response.isSuccessful()) {


                throw new ApiException(response.errorBody().string());


            }


            return response.body();


        } catch (IOException e) {


            throw new ApiException();


        }


    }

}
















