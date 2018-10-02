package com.lftechnology.moneytun.outbound.service;

import com.lftechnology.moneytun.outbound.dto.Response;

public interface OutboundService {

    Response getToken(String accessKey);


}
