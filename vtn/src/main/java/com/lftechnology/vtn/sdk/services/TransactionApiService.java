package com.lftechnology.vtn.sdk.services;


import com.lftechnology.vtn.sdk.dto.Response.TransactionResponseDTO;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface TransactionApiService {


    @POST("Remittance.asp")
    @FormUrlEncoded
    Call<TransactionResponseDTO> createTransaction(@Field("AccessToken") String accessToken,
                                            @Field("AccessKey") String accessKey,
                                            @Field("TransactionId") String transactionId,
                                            @Field("TransferDate") LocalDateTime transferDate,
                                            @Field("TransferType") Integer transferType,
                                            @Field("SenderEmail") String senderEmail,
                                            @Field("SenderPhone") String senderPhone,
                                            @Field("SenderFirstName") String senderFirstName,
                                            @Field("SenderLastName") String senderLastName,
                                            @Field("SenderCountry") String senderCountry,
                                            @Field("ReceiverEmail") String receiverEmail,
                                            @Field("ReceiverPhone") String receiverPhone ,
                                            @Field("ReceiverFirstName") String receiverFirstName,
                                            @Field("ReceiverLastName") String receiverLastName,
                                            @Field("ReceiverCountry") String receiverCountry,
                                            @Field("CurrencyCode") String currencyCode,
                                            @Field("AmountInSenderCurrency") BigDecimal amount,
                                            @Field("AmountInNaira") BigDecimal amountInNaira,
                                            @Field("FeeInSenderCurrency") BigDecimal fee,
                                            @Field("FeeInNaira") BigDecimal feeInNaira,
                                            @Field("BankAccountNumber") String bankAccountNumber,
                                            @Field("BankAccountName") String bankAccountName,
                                            @Field("BankName") String bankName
                                                   );
}
