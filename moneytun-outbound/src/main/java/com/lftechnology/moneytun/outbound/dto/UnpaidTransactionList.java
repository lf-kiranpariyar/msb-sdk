package com.lftechnology.moneytun.outbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnpaidTransactionList {
    @JsonUnwrapped
    List<Transaction> unpaidTransactions= new ArrayList<>();

    public List<Transaction> getUnpaidTransactions() {
        return unpaidTransactions;
    }

    public void setUnpaidTransactions(List<Transaction> unpaidTransactions) {
        this.unpaidTransactions = unpaidTransactions;
    }

}
