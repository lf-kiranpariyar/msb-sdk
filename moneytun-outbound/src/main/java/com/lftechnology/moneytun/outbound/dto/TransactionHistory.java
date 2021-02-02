package com.lftechnology.moneytun.outbound.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TransactionHistory {
    @JsonProperty("Code")
    private String code;

    @JsonProperty("Message")
    private List<Message> messages;


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
