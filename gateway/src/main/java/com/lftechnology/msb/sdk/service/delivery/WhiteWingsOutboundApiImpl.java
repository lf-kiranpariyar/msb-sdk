package com.lftechnology.msb.sdk.service.delivery;

import com.lftechnology.moneytun.outbound.dto.APIContext;
import com.lftechnology.moneytun.outbound.dto.OutboundResponse;
import com.lftechnology.moneytun.outbound.dto.Transaction;
import com.lftechnology.moneytun.outbound.enums.ApiMode;
import com.lftechnology.moneytun.outbound.exception.ApiException;
import com.lftechnology.moneytun.outbound.exception.OutboundException;
import com.lftechnology.moneytun.outbound.service.OutboundService;
import com.lftechnology.moneytun.outbound.service.impl.OutboundServiceImpl;
import com.lftechnology.msb.sdk.annotation.TransactionDeliveryConfirmation;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.dto.TransactionStatusChangeResponse;
import com.lftechnology.msb.sdk.mapper.MoneyTunOutboundObjectMapper;
import javax.ejb.Stateless;
import java.util.List;

@TransactionDeliveryConfirmation("MTN")
@Stateless
public class WhiteWingsOutboundApiImpl implements DeliveryConfirmationService {

    @Override
    public TransactionStatusChangeResponse confirmTransaction(String credentialString, String transferNo, String payeeCode) {
        try{
        com.lftechnology.moneytun.outbound.dto.Credential outboundCrendential = MoneyTunOutboundObjectMapper.toCrendential(credentialString);
        APIContext apiContext = new APIContext(outboundCrendential, ApiMode.SANDBOX);
        OutboundService service = new OutboundServiceImpl();
        OutboundResponse outboundResponse = service.confirmTransaction(apiContext,transferNo,payeeCode);

    return MoneyTunOutboundObjectMapper.toTransactionStatusChangeResponse(outboundResponse);
    }catch(OutboundException e){
            throw new com.lftechnology.msb.sdk.exception.ApiException(e.getMessage());
        }catch(com.lftechnology.vtn.exception.ApiException e){
            throw new com.lftechnology.msb.sdk.exception.ApiException(e.getMessage());
        }
    }

    @Override
    public List<TransactionResponse> getUnpaidTransactionList(String credentialString, String transferNo, String payeeCode){
        try{
        com.lftechnology.moneytun.outbound.dto.Credential outboundCrendential = MoneyTunOutboundObjectMapper.toCrendential(credentialString);
        APIContext apiContext = new APIContext(outboundCrendential, ApiMode.SANDBOX);
        OutboundService service = new OutboundServiceImpl();
        List<Transaction> unpaidTransactionList =service.getUnpaidTransactionList(apiContext,transferNo,payeeCode);
        return MoneyTunOutboundObjectMapper.toTransactionResponse(unpaidTransactionList);

    }catch(OutboundException e){
            throw new com.lftechnology.msb.sdk.exception.ApiException(e.getMessage());
        }catch(com.lftechnology.vtn.exception.ApiException e){
            throw new com.lftechnology.msb.sdk.exception.ApiException(e.getMessage());
        }
    }




}
