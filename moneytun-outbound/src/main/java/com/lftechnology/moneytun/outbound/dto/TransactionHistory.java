package com.lftechnology.moneytun.outbound.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Message")
    private List<Message> messages = new ArrayList<Message>();


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TransactionHistory{");
        sb.append("code='").append(code).append('\'');
        sb.append(", messages=").append(messages);
        sb.append('}');
        return sb.toString();
    }
}
