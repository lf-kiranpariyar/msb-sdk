package com.lftechnology.vtn.service;

import com.lftechnology.vtn.dto.response.FxRateResponse;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import java.util.Map;

public interface FxRateApiService {


    @POST("FetchFXRates.asp")
    @FormUrlEncoded
    Call<FxRateResponse> getRate(@FieldMap Map<String, String> param);

}
