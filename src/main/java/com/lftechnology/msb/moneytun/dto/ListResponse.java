package com.lftechnology.msb.moneytun.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class ListResponse<T> extends Response{

    @JsonAlias({"CountryList", "StateList", "CityList", "CurrencyList", "DeliveryMethodList", "PointOfContactList", "PayerList", "SubPayerList", "AccountTypeList", "IdentificationTypeList", "BankList"})
    private List<T> results;

    public ListResponse() {
    }

    public ListResponse(List<T> results) {
        this.results = results;
    }

    public List<T> getResults() {
        return this.results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
