package com.lftechnology.msb.moneytun.service.impl;

import com.lftechnology.msb.moneytun.dto.APIContext;
import com.lftechnology.msb.moneytun.dto.Bank;
import com.lftechnology.msb.moneytun.dto.ListResponse;
import com.lftechnology.msb.moneytun.dto.Transaction;
import com.lftechnology.msb.moneytun.dto.TransactionDetail;
import com.lftechnology.msb.moneytun.dto.TransactionResponse;
import com.lftechnology.msb.moneytun.enums.QueryType;
import com.lftechnology.msb.moneytun.enums.TxnStatus;
import com.lftechnology.msb.moneytun.exception.WhiteWingBadRequestException;
import com.lftechnology.msb.moneytun.service.WhiteWingApiService;
import com.lftechnology.msb.moneytun.service.WhiteWingResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

public class WhiteWingApiServiceImpl implements WhiteWingApiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WhiteWingApiServiceImpl.class);

    @Override
    public TransactionResponse createTransaction(Transaction transaction, APIContext apiContext) {
        Retrofit retrofit = RequestApi.getRetrofitObject(apiContext);
        WhiteWingResource service = retrofit.create(WhiteWingResource.class);
        Call<TransactionResponse> call = service.create(apiContext.getCredential().getAuthenticationDetail(), QueryType.TRANSACTION_PROCESS.getValue(), transaction);
        try {
            Response<TransactionResponse> response = call.execute();
            if (!response.isSuccessful()) {
                throw new WhiteWingBadRequestException(response.errorBody().string());
            }
            return response.body();
        } catch (IOException e) {
            throw new WhiteWingBadRequestException(e.getMessage());
        }
    }

    @Override
    public TransactionResponse getTransaction(String referenceNumber, APIContext apiContext) {
        Retrofit retrofit = RequestApi.getRetrofitObject(apiContext);
        WhiteWingResource service = retrofit.create(WhiteWingResource.class);
        Call<TransactionResponse> call = service.getTransaction(apiContext.getCredential().getAuthenticationDetail(), QueryType.TRANSACTION_PROCESS.getValue(), referenceNumber);
        try {
            Response<TransactionResponse> response = call.execute();
            if (!response.isSuccessful()) {
                throw new WhiteWingBadRequestException(response.errorBody().string());
            }
            return response.body();
        } catch (IOException e) {
            throw new WhiteWingBadRequestException(e.getMessage());
        }
    }

    @Override
    public TxnStatus getStatus(String referenceNumber, APIContext apiContext) {
        Retrofit retrofit = RequestApi.getRetrofitObject(apiContext);
        WhiteWingResource service = retrofit.create(WhiteWingResource.class);
        Call<ListResponse<TransactionDetail>> call = service.getStatus(apiContext.getCredential().getAuthenticationDetail(), QueryType.TRANSACTION_PROCESS.getValue(), referenceNumber);
        try {
            Response<ListResponse<TransactionDetail>> response = call.execute();
            if (!response.isSuccessful()) {
                throw new WhiteWingBadRequestException(response.errorBody().string());
            }
            return response.body().getResults().get(0).getStatus();
        } catch (IOException e) {
            throw new WhiteWingBadRequestException(e.getMessage());
        }
    }

    @Override
    public List<Bank> getBankList(String countryISOCode, APIContext apiContext) {
        Retrofit retrofit = RequestApi.getRetrofitObject(apiContext);
        WhiteWingResource service = retrofit.create(WhiteWingResource.class);
        Call<ListResponse<Bank>> call = service.getBankList(apiContext.getCredential().getAuthenticationDetail(), QueryType.BANK.getValue(), "EWY,VNM");
        try {
            Response<ListResponse<Bank>> response = call.execute();
            if (!response.isSuccessful()) {
                throw new WhiteWingBadRequestException(response.errorBody().string());
            }
            ListResponse<Bank> bankListResponse = response.body();
            return response.body().getResults();
        } catch (IOException e) {
            throw new WhiteWingBadRequestException(e.getMessage());
        }
    }
}
