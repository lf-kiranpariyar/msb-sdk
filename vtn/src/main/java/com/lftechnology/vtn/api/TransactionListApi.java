package com.lftechnology.vtn.api;

import com.lftechnology.vtn.constant.CommonConstant;
import com.lftechnology.vtn.dto.response.TransactionListResponse;
import com.lftechnology.vtn.exception.VtnException;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.service.TransactionListApiService;
import retrofit2.Call;
import retrofit2.Retrofit;

public class TransactionListApi {

    private RequestApi requestApi;

    public TransactionListApi(Credential credential) {
        this.requestApi = new RequestApi(credential);
    }

    public TransactionListResponse retrieveTransaction(String transactionId) {
        Retrofit retrofit = this.requestApi.getRetrofitObject();
        TransactionListApiService service = retrofit.create(TransactionListApiService.class);

        Call<TransactionListResponse> call = service.getTransaction(transactionId);
        TransactionListResponse transactionListResponseDTO = requestApi.executeApiCall(call);
        if (!transactionListResponseDTO.getCode().equals(CommonConstant.SUCCESS))
            throw new VtnException(transactionListResponseDTO.getMessage(), transactionListResponseDTO.getCode());

        return transactionListResponseDTO;
    }


}
