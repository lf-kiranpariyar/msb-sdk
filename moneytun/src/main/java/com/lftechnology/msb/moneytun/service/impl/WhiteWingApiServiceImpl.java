package com.lftechnology.msb.moneytun.service.impl;

import com.lftechnology.msb.moneytun.dto.APIContext;
import com.lftechnology.msb.moneytun.dto.ApiResponse;
import com.lftechnology.msb.moneytun.dto.Bank;
import com.lftechnology.msb.moneytun.dto.City;
import com.lftechnology.msb.moneytun.dto.CityRequest;
import com.lftechnology.msb.moneytun.dto.CustomExchangeRate;
import com.lftechnology.msb.moneytun.dto.ExchangeRate;
import com.lftechnology.msb.moneytun.dto.ListResponse;
import com.lftechnology.msb.moneytun.dto.PointOfContact;
import com.lftechnology.msb.moneytun.dto.PointOfContactRequest;
import com.lftechnology.msb.moneytun.dto.State;
import com.lftechnology.msb.moneytun.dto.StateRequest;
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

/**
 * WhiteWings API Integration.
 *
 */
public class WhiteWingApiServiceImpl implements WhiteWingApiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WhiteWingApiServiceImpl.class);

    @Override
    public TransactionResponse createTransaction(Transaction transaction, APIContext apiContext) {
        LOGGER.info("Moneytun Transaction Creation Request : {}", transaction);
        transaction.setEmployee(apiContext.getEmployeeDetail());
        transaction.setAgentId(apiContext.getEmployeeDetail().getCode());
        Retrofit retrofit = RequestApi.getRetrofitObject(apiContext);
        WhiteWingResource service = retrofit.create(WhiteWingResource.class);
        Call<TransactionResponse> call = service.create(apiContext.getCredential().getAuthenticationDetail(), QueryType.TRANSACTION_PROCESS.getValue(), transaction);
        try {
            Response<TransactionResponse> response = call.execute();
            if (!response.isSuccessful()) {
                throw new WhiteWingBadRequestException(response.body().getMessage());
            }
            return response.body();
        } catch (IOException e) {
            LOGGER.error("Error while parsing white wings response : {}", e);
            throw new WhiteWingBadRequestException(e.getMessage());
        }
    }

    @Override
    public TransactionResponse getTransaction(String referenceNumber, APIContext apiContext) {
        LOGGER.info("Moneytun Fetch Transaction Request : {}", referenceNumber);
        Retrofit retrofit = RequestApi.getRetrofitObject(apiContext);
        WhiteWingResource service = retrofit.create(WhiteWingResource.class);
        Call<TransactionResponse> call = service.getTransaction(apiContext.getCredential().getAuthenticationDetail(), QueryType.TRANSACTION_PROCESS.getValue(), referenceNumber);
        try {
            Response<TransactionResponse> response = call.execute();
            if (!response.isSuccessful()) {
                throw new WhiteWingBadRequestException(response.message());
            }
            return response.body();
        } catch (IOException e ) {
            LOGGER.error("Error while parsing white wings response : {}", e);
            throw new WhiteWingBadRequestException(e.getMessage());
        }
    }

    @Override
    public TxnStatus getStatus(String referenceNumber, APIContext apiContext) {
        LOGGER.info("Moneytun Fetch Transaction Status Request : {}", referenceNumber);
        Retrofit retrofit = RequestApi.getRetrofitObject(apiContext);
        WhiteWingResource service = retrofit.create(WhiteWingResource.class);
        Call<ApiResponse<TransactionDetail>> call = service.getStatus(apiContext.getCredential().getAuthenticationDetail(), QueryType.TRANSACTION_GET_STATUS.getValue(), referenceNumber);
        try {
            Response<ApiResponse<TransactionDetail>> response = call.execute();
            if (!response.isSuccessful()) {
                throw new WhiteWingBadRequestException(response.message());
            }
            String txnStatus = response.body().getResult().getStatus();
            LOGGER.info("Moneytun Fetch Transaction Status Request : {}", txnStatus);
            return TxnStatus.getValue(txnStatus);
        } catch (IOException e) {
            LOGGER.error("Error while parsing white wings response : {}", e);
            throw new WhiteWingBadRequestException(e.getMessage());
        }
    }

    @Override
    public List<Bank> getBankList(String countryISOCode, APIContext apiContext) {
        LOGGER.info("Moneytun Fetch Bank List : {}", countryISOCode);
        Retrofit retrofit = RequestApi.getRetrofitObject(apiContext);
        WhiteWingResource service = retrofit.create(WhiteWingResource.class);
        String bankRequestQuery= apiContext.getCredential().getPayerDetails().get(countryISOCode).get(0).getPayeeCode().concat(",").concat(countryISOCode);
        Call<ListResponse<Bank>> call = service.getBankList(apiContext.getCredential().getAuthenticationDetail(), QueryType.BANK.getValue(), bankRequestQuery);
        try {
            Response<ListResponse<Bank>> response = call.execute();
            if (!response.isSuccessful()) {
                throw new WhiteWingBadRequestException(response.message());
            }
            return response.body().getResults();
        } catch (IOException e) {
            LOGGER.error("Error while parsing white wings response : {}", e);
            throw new WhiteWingBadRequestException(e.getMessage());
        }
    }

    @Override
    public CustomExchangeRate getRate(ExchangeRate rate, APIContext apiContext) {
        LOGGER.info("Moneytun Get Exchange Rate Request : {}", rate);
        Retrofit retrofit = RequestApi.getRetrofitObject(apiContext);
        WhiteWingResource service = retrofit.create(WhiteWingResource.class);
        Call<ApiResponse<CustomExchangeRate>> call = service.getRate(apiContext.getCredential().getAuthenticationDetail(), QueryType.GET_RATE.getValue(),rate);
        try {
            Response<ApiResponse<CustomExchangeRate>> response = call.execute();
            if (!response.isSuccessful()) {
                throw new WhiteWingBadRequestException(response.message());
            }
            return response.body().getResult();
        } catch (IOException e) {
            LOGGER.error("Error while parsing white wings response : {}", e);
            throw new WhiteWingBadRequestException(e.getMessage());
        }
    }

    @Override
    public void updateRate(ExchangeRate rate, APIContext apiContext) {
        LOGGER.info("Moneytun Update Exchange Rate Request : {}", rate);
        Retrofit retrofit = RequestApi.getRetrofitObject(apiContext);
        WhiteWingResource service = retrofit.create(WhiteWingResource.class);
        Call<com.lftechnology.msb.moneytun.dto.Response> call = service.updateRate(apiContext.getCredential().getAuthenticationDetail(), QueryType.UPDATE_RATE.getValue(),rate);
        try {
            Response<com.lftechnology.msb.moneytun.dto.Response> response = call.execute();
            if (!response.isSuccessful()) {
                throw new WhiteWingBadRequestException(response.message());
            }

        } catch (IOException e) {
            LOGGER.error("Exchange rate update request error : {}",e);
            throw new WhiteWingBadRequestException(e.getMessage());
        }
    }

    @Override
    public List<PointOfContact> getPointOfContacts(PointOfContactRequest pointOfContactRequest, APIContext apiContext) {
        LOGGER.info("MoneyTun Get Point Of Contacts List : {}", pointOfContactRequest);
        Retrofit retrofit = RequestApi.getRetrofitObject(apiContext);
        WhiteWingResource service = retrofit.create(WhiteWingResource.class);
        Call<ListResponse<PointOfContact>> call = service.getPointOfContact(apiContext.getCredential().getAuthenticationDetail(), pointOfContactRequest.getCountryCode(), pointOfContactRequest.getPayeeCode());
        try {
            Response<ListResponse<PointOfContact>> response = call.execute();

            if (!response.isSuccessful()) {
                throw new WhiteWingBadRequestException(response.message());
            }
            return  response.body().getResults();
        } catch (IOException e) {
            LOGGER.error("Error while fetching point of contact list {}", e);
            throw new WhiteWingBadRequestException(e.getMessage());
        }
    }

    @Override
    public List<City> getCities(CityRequest cityRequest, APIContext apiContext) {
        LOGGER.info("MoneyTun Get City List For Country : {}", cityRequest);
        Retrofit retrofit = RequestApi.getRetrofitObject(apiContext);
        WhiteWingResource service = retrofit.create(WhiteWingResource.class);
        Call<ListResponse<City>> call = service.getCity(apiContext.getCredential().getAuthenticationDetail(), cityRequest);
        try {
            Response<ListResponse<City>> response = call.execute();

            if (!response.isSuccessful()) {
                throw new WhiteWingBadRequestException(response.message());
            }
            return  response.body().getResults();
        } catch (IOException e) {
            LOGGER.error("Error while fetching point of contact list {}", e);
            throw new WhiteWingBadRequestException(e.getMessage());
        }
    }

    @Override
    public List<State> getStates(StateRequest stateRequest, APIContext apiContext) {
        LOGGER.info("MoneyTun Get City List For Country : {}", stateRequest);
        Retrofit retrofit = RequestApi.getRetrofitObject(apiContext);
        WhiteWingResource service = retrofit.create(WhiteWingResource.class);
        Call<ListResponse<State>> call = service.getState(apiContext.getCredential().getAuthenticationDetail(), stateRequest);
        try {
            Response<ListResponse<State>> response = call.execute();
            if (!response.isSuccessful()) {
                throw new WhiteWingBadRequestException(response.message());
            }
            return  response.body().getResults();
        } catch (IOException e) {
            LOGGER.error("Error while fetching point of contact list {}", e);
            throw new WhiteWingBadRequestException(e.getMessage());
        }
    }
}
