package com.lftechnology.msb.moneytun.service;

import com.lftechnology.msb.moneytun.dto.APIContext;
import com.lftechnology.msb.moneytun.dto.Bank;
import com.lftechnology.msb.moneytun.dto.City;
import com.lftechnology.msb.moneytun.dto.CityRequest;
import com.lftechnology.msb.moneytun.dto.CustomExchangeRate;
import com.lftechnology.msb.moneytun.dto.ExchangeRate;
import com.lftechnology.msb.moneytun.dto.PayTransaction;
import com.lftechnology.msb.moneytun.dto.PointOfContact;
import com.lftechnology.msb.moneytun.dto.PointOfContactRequest;
import com.lftechnology.msb.moneytun.dto.State;
import com.lftechnology.msb.moneytun.dto.StateRequest;
import com.lftechnology.msb.moneytun.dto.Transaction;
import com.lftechnology.msb.moneytun.dto.TransactionResponse;
import com.lftechnology.msb.moneytun.enums.TxnStatus;

import java.util.List;


public interface WhiteWingApiService {

    TransactionResponse createTransaction(Transaction transaction, APIContext apiContext);

    TransactionResponse getTransaction(String referenceNumber, APIContext apiContext);

    TxnStatus getStatus(String referenceNumber, APIContext apiContext);

    List<Bank> getBankList(String countryISOCode, APIContext apiContext);

    CustomExchangeRate getRate(ExchangeRate rate, APIContext apiContext);

    void updateRate(ExchangeRate rate, APIContext apiContext);

    List<PointOfContact> getPointOfContacts(PointOfContactRequest pointOfContactRequest, APIContext apiContext);

    List<City> getCities(CityRequest cityRequest, APIContext apiContext);

    List<State> getStates(StateRequest stateRequest, APIContext apiContext);

    void payTransaction(PayTransaction payTransaction, APIContext apiContext);

}
