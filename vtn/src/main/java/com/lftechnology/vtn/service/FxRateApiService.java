package com.lftechnology.vtn.service;

import com.lftechnology.vtn.dto.response.FxRateResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface FxRateApiService {


    @POST("FetchFXRates.asp")
    @FormUrlEncoded
    Call<FxRateResponse> getRate(@Field("CurrencyCode") String currrencyCode);

}
