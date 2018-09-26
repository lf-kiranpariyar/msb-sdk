package com.lftechnology.vtn.sdk.services;

import com.lftechnology.vtn.sdk.dto.Response.FxRateResponseDTO;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface FxRateApiService {


    @POST("FetchFXRates.asp")
    @FormUrlEncoded
    Call<FxRateResponseDTO> getRate(@Field("AccessToken") String accessToken,
                                    @Field("AccessKey") String accessKey,
                                    @Field("CurrencyCode") String currencyCode
    );
    
}
