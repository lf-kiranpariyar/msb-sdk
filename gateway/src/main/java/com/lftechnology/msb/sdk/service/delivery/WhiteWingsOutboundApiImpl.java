package com.lftechnology.msb.sdk.service.delivery;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.lftechnology.moneytun.outbound.dto.Credential;
import com.lftechnology.moneytun.outbound.dto.UnpaidTransactionList;
import com.lftechnology.moneytun.outbound.service.OutboundService;
import com.lftechnology.moneytun.outbound.service.impl.OutboundServiceImpl;
import com.lftechnology.msb.sdk.annotation.TransactionDeliveryConfirmation;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.exception.UnsupportedException;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@TransactionDeliveryConfirmation("MTN")
@Stateless
public class WhiteWingsOutboundApiImpl implements DelvieryConfirmationService {

    @Override
    public Boolean confirmTransaction(String credentialString, String payeeCode) {

    }

    @Override
    public List<TransactionResponse> getUnpaidTransactionList(String credentialString, String transferNo, String payeeCode) {
        com.lftechnology.moneytun.outbound.dto.Credential outboundCrendential = toCrendential(credentialString);
        OutboundService service = new OutboundServiceImpl();
        UnpaidTransactionList unpaidTransactionList = service.getUnpaidTransactionList(outboundCrendential,transferNo,payeeCode);
        return toTransactionResponse(unpaidTransactionList);

    }

    private Credential toCrendential(String credentialString) {
        System.out.println(credentialString);
        Gson gson = new Gson();
        Credential outCrendential = gson.fromJson(credentialString ,com.lftechnology.moneytun.outbound.dto.Credential.class);
        System.out.println(outCrendential);
        return outCrendential;
    }

    private List<TransactionResponse> toTransactionResponse(UnpaidTransactionList unpaidTransactionList){
        List<TransactionResponse> transactionList = new ArrayList<>();


        for(com.lftechnology.moneytun.outbound.dto.Transaction vTransaction : unpaidTransactionList.getUnpaidTransactions()){

            TransactionResponse gTransactionResponse = new TransactionResponse();
            ObjectMapper mapper = new ObjectMapper();
            Map<String,Object> map = mapper.convertValue(vTransaction, Map.class);

            gTransactionResponse.setReferenceNumber(vTransaction.getTransferNo());
            gTransactionResponse.setMetadata(map);

            transactionList.add(gTransactionResponse);

        }
        return transactionList;


    }

    public static void main(String[] args) {

        WhiteWingsOutboundApiImpl whiteWingsOutboundApi = new WhiteWingsOutboundApiImpl();
        List<TransactionResponse>  transactionResponses = whiteWingsOutboundApi.getUnpaidTransactionList("{\"accessKey\":\"VTNB745695C-77A9-4373-BF6B-FB653C0FD3B1\",\"secretKey\":\"rPKq5Qn7+RtxgXf4TwieBEw/gQFfZA6c0gxsj7C8mzA=\"}","test","TRG");
        System.out.println(transactionResponses.get(0).getMetadata().toString());
    }

}
