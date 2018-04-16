package com.lftechnology.msb.moneytun.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListResponse<T> extends Response{

    @SerializedName(value="RandomKey",alternate = {"BankList","CountryList", "StateList", "CityList", "CurrencyList", "DeliveryMethodList", "PointOfContactList", "PayerList", "SubPayerList", "AccountTypeList", "IdentificationTypeList"})
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ListResponse{");
        sb.append("results=").append(results);
        sb.append(", message='").append(message).append('\'');
        sb.append(", statusCode=").append(statusCode);
        sb.append(", error=").append(error);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
