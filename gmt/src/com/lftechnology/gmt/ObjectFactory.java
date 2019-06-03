
package com.lftechnology.gmt;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lftechnology.gmt package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _WsSender_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsSender");
    private final static QName _WsReceiver_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsReceiver");
    private final static QName _WsTransferInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsTransferInfo");
    private final static QName _WsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsResponse");
    private final static QName _ArrayOfwsPaidTransactions_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfwsPaidTransactions");
    private final static QName _WsPaidTransactions_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsPaidTransactions");
    private final static QName _ArrayOfwsVoidTransactions_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfwsVoidTransactions");
    private final static QName _WsVoidTransactions_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsVoidTransactions");
    private final static QName _WsChangeRequestData_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsChangeRequestData");
    private final static QName _ArrayOfwsModifiedTransactions_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfwsModifiedTransactions");
    private final static QName _WsModifiedTransactions_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsModifiedTransactions");
    private final static QName _ArrayOfwsReleasedTransactions_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfwsReleasedTransactions");
    private final static QName _WsReleasedTransactions_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsReleasedTransactions");
    private final static QName _ArrayOfwsCollectedAch_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfwsCollectedAch");
    private final static QName _WsCollectedAch_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsCollectedAch");
    private final static QName _ArrayOfwsNotifications_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfwsNotifications");
    private final static QName _WsNotifications_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsNotifications");
    private final static QName _WsAchStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsAchStatus");
    private final static QName _WsStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsStatus");
    private final static QName _WsExRate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsExRate");
    private final static QName _ArrayOfwsExRateList_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfwsExRateList");
    private final static QName _WsExRateList_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsExRateList");
    private final static QName _WsOfac_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsOfac");
    private final static QName _WsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsResult");
    private final static QName _WsBillInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "wsBillInfo");
    private final static QName _ArrayOfwsSelectPayersByCountryCodeResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfws_Select_PayersByCountryCodeResult");
    private final static QName _WsSelectPayersByCountryCodeResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ws_Select_PayersByCountryCodeResult");
    private final static QName _ArrayOfwsSelectPayerAccountTypesResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfws_Select_PayerAccountTypesResult");
    private final static QName _WsSelectPayerAccountTypesResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ws_Select_PayerAccountTypesResult");
    private final static QName _ArrayOfwsSelectPayerBanksResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfws_Select_PayerBanksResult");
    private final static QName _WsSelectPayerBanksResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ws_Select_PayerBanksResult");
    private final static QName _ArrayOfwsSelectPayerCurrenciesResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfws_Select_PayerCurrenciesResult");
    private final static QName _WsSelectPayerCurrenciesResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ws_Select_PayerCurrenciesResult");
    private final static QName _ArrayOfwsSelectPayerLimitsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfws_Select_PayerLimitsResult");
    private final static QName _WsSelectPayerLimitsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ws_Select_PayerLimitsResult");
    private final static QName _ArrayOfwsSelectPayerOfficesResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfws_Select_PayerOfficesResult");
    private final static QName _WsSelectPayerOfficesResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ws_Select_PayerOfficesResult");
    private final static QName _ArrayOfwsSelectPayerServicesResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ArrayOfws_Select_PayerServicesResult");
    private final static QName _WsSelectPayerServicesResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ws_Select_PayerServicesResult");
    private final static QName _ReceiptTemplate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiptTemplate");
    private final static QName _CityByZip_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CityByZip");
    private final static QName _WsLimitByPayerResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ws_LimitByPayerResult");
    private final static QName _WsSelectPromoResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ws_Select_PromoResult");
    private final static QName _InsertTransactionAlias_QNAME = new QName("http://tempuri.org/", "alias");
    private final static QName _InsertTransactionUser_QNAME = new QName("http://tempuri.org/", "user");
    private final static QName _InsertTransactionPass_QNAME = new QName("http://tempuri.org/", "pass");
    private final static QName _InsertTransactionSender_QNAME = new QName("http://tempuri.org/", "sender");
    private final static QName _InsertTransactionReceiver_QNAME = new QName("http://tempuri.org/", "receiver");
    private final static QName _InsertTransactionTransfer_QNAME = new QName("http://tempuri.org/", "transfer");
    private final static QName _InsertTransactionResponseInsertTransactionResult_QNAME = new QName("http://tempuri.org/", "InsertTransactionResult");
    private final static QName _GetPaidTransactionsResponseGetPaidTransactionsResult_QNAME = new QName("http://tempuri.org/", "GetPaidTransactionsResult");
    private final static QName _ConfirmPaymentReceipt_QNAME = new QName("http://tempuri.org/", "receipt");
    private final static QName _ConfirmPaymentResponseConfirmPaymentResult_QNAME = new QName("http://tempuri.org/", "ConfirmPaymentResult");
    private final static QName _RequestCancellationComment_QNAME = new QName("http://tempuri.org/", "comment");
    private final static QName _RequestCancellationResponseRequestCancellationResult_QNAME = new QName("http://tempuri.org/", "RequestCancellationResult");
    private final static QName _GetCancelledTransactionsResponseGetCancelledTransactionsResult_QNAME = new QName("http://tempuri.org/", "GetCancelledTransactionsResult");
    private final static QName _ConfirmCancellationResponseConfirmCancellationResult_QNAME = new QName("http://tempuri.org/", "ConfirmCancellationResult");
    private final static QName _RequestModificationData_QNAME = new QName("http://tempuri.org/", "data");
    private final static QName _RequestModificationResponseRequestModificationResult_QNAME = new QName("http://tempuri.org/", "RequestModificationResult");
    private final static QName _GetModifiedTransactionsResponseGetModifiedTransactionsResult_QNAME = new QName("http://tempuri.org/", "GetModifiedTransactionsResult");
    private final static QName _ConfirmModificationResponseConfirmModificationResult_QNAME = new QName("http://tempuri.org/", "ConfirmModificationResult");
    private final static QName _GetReleasedTransactionsResponseGetReleasedTransactionsResult_QNAME = new QName("http://tempuri.org/", "GetReleasedTransactionsResult");
    private final static QName _ConfirmReleaseResponseConfirmReleaseResult_QNAME = new QName("http://tempuri.org/", "ConfirmReleaseResult");
    private final static QName _GetClearedAchTransactionsResponseGetClearedAchTransactionsResult_QNAME = new QName("http://tempuri.org/", "GetClearedAchTransactionsResult");
    private final static QName _ConfirmCollectionResponseConfirmCollectionResult_QNAME = new QName("http://tempuri.org/", "ConfirmCollectionResult");
    private final static QName _GetNotificationsResponseGetNotificationsResult_QNAME = new QName("http://tempuri.org/", "GetNotificationsResult");
    private final static QName _GetAchStatusResponseGetAchStatusResult_QNAME = new QName("http://tempuri.org/", "GetAchStatusResult");
    private final static QName _GetTransactionStatusResponseGetTransactionStatusResult_QNAME = new QName("http://tempuri.org/", "GetTransactionStatusResult");
    private final static QName _GetSingleExchangeRatePayer_QNAME = new QName("http://tempuri.org/", "payer");
    private final static QName _GetSingleExchangeRateMts_QNAME = new QName("http://tempuri.org/", "mts");
    private final static QName _GetSingleExchangeRateService_QNAME = new QName("http://tempuri.org/", "service");
    private final static QName _GetSingleExchangeRateCurrency_QNAME = new QName("http://tempuri.org/", "currency");
    private final static QName _GetSingleExchangeRateResponseGetSingleExchangeRateResult_QNAME = new QName("http://tempuri.org/", "GetSingleExchangeRateResult");
    private final static QName _GetExchangeRatesResponseGetExchangeRatesResult_QNAME = new QName("http://tempuri.org/", "GetExchangeRatesResult");
    private final static QName _OfacVerificationLastName_QNAME = new QName("http://tempuri.org/", "lastName");
    private final static QName _OfacVerificationFirstName_QNAME = new QName("http://tempuri.org/", "firstName");
    private final static QName _OfacVerificationResponseOfacVerificationResult_QNAME = new QName("http://tempuri.org/", "OfacVerificationResult");
    private final static QName _ComplianceCheckResponseComplianceCheckResult_QNAME = new QName("http://tempuri.org/", "ComplianceCheckResult");
    private final static QName _SetVerifiedScore_QNAME = new QName("http://tempuri.org/", "score");
    private final static QName _SetVerifiedResponseSetVerifiedResult_QNAME = new QName("http://tempuri.org/", "SetVerifiedResult");
    private final static QName _BillConsultBillerId_QNAME = new QName("http://tempuri.org/", "billerId");
    private final static QName _BillConsultAccount_QNAME = new QName("http://tempuri.org/", "account");
    private final static QName _BillConsultFirstname_QNAME = new QName("http://tempuri.org/", "firstname");
    private final static QName _BillConsultLastname_QNAME = new QName("http://tempuri.org/", "lastname");
    private final static QName _BillConsultResponseBillConsultResult_QNAME = new QName("http://tempuri.org/", "BillConsultResult");
    private final static QName _PayersConsultCountryCode_QNAME = new QName("http://tempuri.org/", "countryCode");
    private final static QName _PayersConsultPayerCode_QNAME = new QName("http://tempuri.org/", "payerCode");
    private final static QName _PayersConsultResponsePayersConsultResult_QNAME = new QName("http://tempuri.org/", "PayersConsultResult");
    private final static QName _GetReceiptDataRemEdo_QNAME = new QName("http://tempuri.org/", "rem_edo");
    private final static QName _GetReceiptDataPais_QNAME = new QName("http://tempuri.org/", "pais");
    private final static QName _GetReceiptDataResponseGetReceiptDataResult_QNAME = new QName("http://tempuri.org/", "GetReceiptDataResult");
    private final static QName _GetCityByZipZip_QNAME = new QName("http://tempuri.org/", "zip");
    private final static QName _GetCityByZipResponseGetCityByZipResult_QNAME = new QName("http://tempuri.org/", "GetCityByZipResult");
    private final static QName _CheckPayerLimitsPayercode_QNAME = new QName("http://tempuri.org/", "payercode");
    private final static QName _CheckPayerLimitsServicecode_QNAME = new QName("http://tempuri.org/", "servicecode");
    private final static QName _CheckPayerLimitsBen_QNAME = new QName("http://tempuri.org/", "ben");
    private final static QName _CheckPayerLimitsRem_QNAME = new QName("http://tempuri.org/", "rem");
    private final static QName _CheckPayerLimitsResponseCheckPayerLimitsResult_QNAME = new QName("http://tempuri.org/", "CheckPayerLimitsResult");
    private final static QName _PromotionsCodeCodePromo_QNAME = new QName("http://tempuri.org/", "Code_promo");
    private final static QName _PromotionsCodeResponsePromotionsCodeResult_QNAME = new QName("http://tempuri.org/", "PromotionsCodeResult");
    private final static QName _WsSelectPayerServicesResultServiceCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ServiceCode");
    private final static QName _WsSelectPayerServicesResultServiceName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ServiceName");
    private final static QName _WsSelectPayerOfficesResultCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "City");
    private final static QName _WsSelectPayerOfficesResultCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CountryCode");
    private final static QName _WsSelectPayerOfficesResultOfficeCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfficeCode");
    private final static QName _WsSelectPayerOfficesResultOfficeGroupName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfficeGroupName");
    private final static QName _WsSelectPayerOfficesResultState_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "State");
    private final static QName _WsSelectPayerLimitsResultCurrencyCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CurrencyCode");
    private final static QName _WsSelectPayerLimitsResultType_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Type");
    private final static QName _WsSelectPayerCurrenciesResultCurrencyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CurrencyName");
    private final static QName _WsSelectPayerBanksResultBankCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BankCode");
    private final static QName _WsSelectPayerBanksResultBankName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BankName");
    private final static QName _WsSelectPayerAccountTypesResultAccountTypeCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "AccountTypeCode");
    private final static QName _WsSelectPayerAccountTypesResultAccountTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "AccountTypeName");
    private final static QName _WsSelectPayersByCountryCodeResultPayerAccountTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PayerAccountTypes");
    private final static QName _WsSelectPayersByCountryCodeResultPayerBanks_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PayerBanks");
    private final static QName _WsSelectPayersByCountryCodeResultPayerCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PayerCode");
    private final static QName _WsSelectPayersByCountryCodeResultPayerCountryName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PayerCountryName");
    private final static QName _WsSelectPayersByCountryCodeResultPayerCurrencies_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PayerCurrencies");
    private final static QName _WsSelectPayersByCountryCodeResultPayerLimits_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PayerLimits");
    private final static QName _WsSelectPayersByCountryCodeResultPayerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PayerName");
    private final static QName _WsSelectPayersByCountryCodeResultPayerOffices_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PayerOffices");
    private final static QName _WsSelectPayersByCountryCodeResultPayerServices_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PayerServices");
    private final static QName _WsSelectPayersByCountryCodeResultPayerType_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PayerType");
    private final static QName _WsExRateListExRate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ExRate");
    private final static QName _WsExRateListCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "code");
    private final static QName _WsExRateListCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "country");
    private final static QName _WsExRateListCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "currency");
    private final static QName _WsExRateListPayer_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "payer");
    private final static QName _WsNotificationsPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Password");
    private final static QName _WsNotificationsReceipt_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Receipt");
    private final static QName _WsNotificationsStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Status");
    private final static QName _WsNotificationsStatusDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "StatusDate");
    private final static QName _WsNotificationsThirdPartyReceipt_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ThirdPartyReceipt");
    private final static QName _WsNotificationsWireDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "WireDate");
    private final static QName _WsCollectedAchClearedDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ClearedDate");
    private final static QName _WsReleasedTransactionsHoldDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "HoldDate");
    private final static QName _WsModifiedTransactionsModifyDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ModifyDate");
    private final static QName _WsVoidTransactionsCancelDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CancelDate");
    private final static QName _WsPaidTransactionsPaymentDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PaymentDate");
    private final static QName _WsSelectPromoResultMSG_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "MSG");
    private final static QName _WsSelectPromoResultPROCANT_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PRO_CANT");
    private final static QName _WsSelectPromoResultPROCODE_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PRO_CODE");
    private final static QName _WsSelectPromoResultPRODESC_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PRO_DESC");
    private final static QName _WsSelectPromoResultPROFEE_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PRO_FEE");
    private final static QName _WsLimitByPayerResultAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Amount");
    private final static QName _WsLimitByPayerResultContinueSaving_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ContinueSaving");
    private final static QName _WsLimitByPayerResultLimit_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Limit");
    private final static QName _WsLimitByPayerResultMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Message");
    private final static QName _CityByZipCioCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CioCountryCode");
    private final static QName _CityByZipCioName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CioName");
    private final static QName _CityByZipCioState_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CioState");
    private final static QName _CityByZipCioStateCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CioStateCode");
    private final static QName _ReceiptTemplateRecContact_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "rec_contact");
    private final static QName _ReceiptTemplateRecContactEn_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "rec_contact_en");
    private final static QName _ReceiptTemplateRecError_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "rec_error");
    private final static QName _ReceiptTemplateRecErrorEn_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "rec_error_en");
    private final static QName _ReceiptTemplateRecLicense_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "rec_license");
    private final static QName _ReceiptTemplateRecPdf_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "rec_pdf");
    private final static QName _ReceiptTemplateRecRtr_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "rec_rtr");
    private final static QName _ReceiptTemplateRecRtrEn_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "rec_rtr_en");
    private final static QName _WsBillInfoBillAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BillAccount");
    private final static QName _WsBillInfoBillErrorCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BillErrorCode");
    private final static QName _WsBillInfoBillInvoice_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BillInvoice");
    private final static QName _WsBillInfoBillInvoiceDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BillInvoiceDate");
    private final static QName _WsBillInfoBillLocalCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BillLocalCurrency");
    private final static QName _WsBillInfoBillMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BillMessage");
    private final static QName _WsBillInfoBillName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BillName");
    private final static QName _WsOfacOfacAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacAddress");
    private final static QName _WsOfacOfacAka_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacAka");
    private final static QName _WsOfacOfacCitizenship_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacCitizenship");
    private final static QName _WsOfacOfacComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacComment");
    private final static QName _WsOfacOfacDob_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacDob");
    private final static QName _WsOfacOfacFirst_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacFirst");
    private final static QName _WsOfacOfacIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacIds");
    private final static QName _WsOfacOfacLast_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacLast");
    private final static QName _WsOfacOfacName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacName");
    private final static QName _WsOfacOfacNationality_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacNationality");
    private final static QName _WsOfacOfacPob_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacPob");
    private final static QName _WsOfacOfacProgram_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacProgram");
    private final static QName _WsOfacOfacRemark_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacRemark");
    private final static QName _WsOfacOfacSource_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacSource");
    private final static QName _WsOfacOfacTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacTitle");
    private final static QName _WsOfacOfacType_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfacType");
    private final static QName _WsStatusLastComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "LastComment");
    private final static QName _WsStatusPayMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PayMethod");
    private final static QName _WsAchStatusName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Name");
    private final static QName _WsChangeRequestDataReceiverAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverAccount");
    private final static QName _WsChangeRequestDataReceiverAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverAddress");
    private final static QName _WsChangeRequestDataReceiverBirthDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverBirthDate");
    private final static QName _WsChangeRequestDataReceiverEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverEmail");
    private final static QName _WsChangeRequestDataReceiverIdNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverIdNumber");
    private final static QName _WsChangeRequestDataReceiverIdType_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverIdType");
    private final static QName _WsChangeRequestDataReceiverLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverLastName");
    private final static QName _WsChangeRequestDataReceiverMobile_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverMobile");
    private final static QName _WsChangeRequestDataReceiverName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverName");
    private final static QName _WsChangeRequestDataReceiverPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverPhone");
    private final static QName _WsChangeRequestDataReceiverZip_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverZip");
    private final static QName _WsResponseReceiptContact_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Receipt_Contact");
    private final static QName _WsResponseReceiptContactEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Receipt_Contact_EN");
    private final static QName _WsResponseReceiptError_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Receipt_Error");
    private final static QName _WsResponseReceiptErrorEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Receipt_Error_EN");
    private final static QName _WsResponseReceiptLicense_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Receipt_License");
    private final static QName _WsResponseReceiptRTR_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Receipt_RTR");
    private final static QName _WsResponseReceiptRTREN_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Receipt_RTR_EN");
    private final static QName _WsTransferInfoAgenciaCodigo_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "AgenciaCodigo");
    private final static QName _WsTransferInfoAgencySpecialDiscounts_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "AgencySpecialDiscounts");
    private final static QName _WsTransferInfoAttachedFile_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "AttachedFile");
    private final static QName _WsTransferInfoBancoCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BancoCuenta");
    private final static QName _WsTransferInfoBancosId_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BancosId");
    private final static QName _WsTransferInfoBancosNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BancosNombre");
    private final static QName _WsTransferInfoBankAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BankAccount");
    private final static QName _WsTransferInfoBeneficiarioCelular_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BeneficiarioCelular");
    private final static QName _WsTransferInfoBeneficiarioCiudad_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BeneficiarioCiudad");
    private final static QName _WsTransferInfoBeneficiarioDialCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BeneficiarioDialCode");
    private final static QName _WsTransferInfoBeneficiarioEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BeneficiarioEstado");
    private final static QName _WsTransferInfoBeneficiarioIdDescripcion_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BeneficiarioIdDescripcion");
    private final static QName _WsTransferInfoBeneficiarioIdTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BeneficiarioIdTipo");
    private final static QName _WsTransferInfoBeneficiarioMensaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BeneficiarioMensaje");
    private final static QName _WsTransferInfoBeneficiarioNotas_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BeneficiarioNotas");
    private final static QName _WsTransferInfoBeneficiarioZip_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "BeneficiarioZip");
    private final static QName _WsTransferInfoBoleto_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "Boleto");
    private final static QName _WsTransferInfoCiudadNombreBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CiudadNombreBeneficiario");
    private final static QName _WsTransferInfoCiudadNombreRemitente_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CiudadNombreRemitente");
    private final static QName _WsTransferInfoCiudadRemitente_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CiudadRemitente");
    private final static QName _WsTransferInfoComplianceBanksName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceBanksName");
    private final static QName _WsTransferInfoComplianceBirthDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceBirthDate");
    private final static QName _WsTransferInfoComplianceDireccion2_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceDireccion2");
    private final static QName _WsTransferInfoComplianceEmployerAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceEmployerAddress");
    private final static QName _WsTransferInfoComplianceEmployersName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceEmployersName");
    private final static QName _WsTransferInfoComplianceHomeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceHomeType");
    private final static QName _WsTransferInfoComplianceIdExpirationDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceIdExpirationDate");
    private final static QName _WsTransferInfoComplianceIdIssuer_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceIdIssuer");
    private final static QName _WsTransferInfoComplianceIdNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceIdNumber");
    private final static QName _WsTransferInfoComplianceIdType_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceIdType");
    private final static QName _WsTransferInfoComplianceOccupation_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceOccupation");
    private final static QName _WsTransferInfoComplianceOtherSendingReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceOtherSendingReason");
    private final static QName _WsTransferInfoComplianceOverLimitMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceOverLimitMessage");
    private final static QName _WsTransferInfoCompliancePhoneConfirmation_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CompliancePhoneConfirmation");
    private final static QName _WsTransferInfoCompliancePhoneType_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CompliancePhoneType");
    private final static QName _WsTransferInfoComplianceRelationshipWithBeneficiary_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceRelationshipWithBeneficiary");
    private final static QName _WsTransferInfoComplianceSSN_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceSSN");
    private final static QName _WsTransferInfoComplianceSendingReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceSendingReason");
    private final static QName _WsTransferInfoComplianceSourceOfFunds_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceSourceOfFunds");
    private final static QName _WsTransferInfoComplianceSpecial_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceSpecial");
    private final static QName _WsTransferInfoComplianceTextType_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceTextType");
    private final static QName _WsTransferInfoComplianceWorkPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ComplianceWorkPhone");
    private final static QName _WsTransferInfoCorrespondentCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CorrespondentCode");
    private final static QName _WsTransferInfoCustomerID_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "CustomerID");
    private final static QName _WsTransferInfoDestinatarioApellido_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "DestinatarioApellido");
    private final static QName _WsTransferInfoDestinatarioNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "DestinatarioNombre");
    private final static QName _WsTransferInfoDestinationCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "DestinationCurrency");
    private final static QName _WsTransferInfoDireccionBancoTexto_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "DireccionBancoTexto");
    private final static QName _WsTransferInfoDireccionBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "DireccionBeneficiario");
    private final static QName _WsTransferInfoDireccionCalleRemitente_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "DireccionCalleRemitente");
    private final static QName _WsTransferInfoDireccionRemitente_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "DireccionRemitente");
    private final static QName _WsTransferInfoExchangeRateEffective_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ExchangeRateEffective");
    private final static QName _WsTransferInfoHDFieldBeneficiary_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "HDFieldBeneficiary");
    private final static QName _WsTransferInfoHdFieldCompliance_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "HdFieldCompliance");
    private final static QName _WsTransferInfoIDNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "IDNo");
    private final static QName _WsTransferInfoInformacionAdicionalRemitenteBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "InformacionAdicionalRemitenteBeneficiario");
    private final static QName _WsTransferInfoLegalIdBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "LegalIdBeneficiario");
    private final static QName _WsTransferInfoMovilRemitente_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "MovilRemitente");
    private final static QName _WsTransferInfoOFACBeneficiaryBirthDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OFACBeneficiaryBirthDate");
    private final static QName _WsTransferInfoOFACBeneficiaryPlaceOfBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OFACBeneficiaryPlaceOfBirth");
    private final static QName _WsTransferInfoOFACCountryOfNationality_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OFACCountryOfNationality");
    private final static QName _WsTransferInfoOFACPlaceOfBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OFACPlaceOfBirth");
    private final static QName _WsTransferInfoOFACRemitenteObliga_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OFACRemitenteObliga");
    private final static QName _WsTransferInfoOFACSenderBirthDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OFACSenderBirthDate");
    private final static QName _WsTransferInfoOfficeNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OfficeNombre");
    private final static QName _WsTransferInfoOriginalCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OriginalCurrency");
    private final static QName _WsTransferInfoOriginalPaymentMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OriginalPaymentMethod");
    private final static QName _WsTransferInfoOverLimitMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "OverLimitMessage");
    private final static QName _WsTransferInfoPEPBeneficiarioMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PEPBeneficiarioMessage");
    private final static QName _WsTransferInfoPEPRemitenteMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PEPRemitenteMessage");
    private final static QName _WsTransferInfoPOBofacBen_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "POBofacBen");
    private final static QName _WsTransferInfoPaisBeneficiarioNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PaisBeneficiarioNombre");
    private final static QName _WsTransferInfoPuntosRemitenteIdCard_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "PuntosRemitenteIdCard");
    private final static QName _WsTransferInfoRelationshipWithSenders_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "RelationshipWithSenders");
    private final static QName _WsTransferInfoRemitenteApellido_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "RemitenteApellido");
    private final static QName _WsTransferInfoRemitenteEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "RemitenteEmail");
    private final static QName _WsTransferInfoRemitenteEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "RemitenteEstado");
    private final static QName _WsTransferInfoRemitenteNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "RemitenteNombre");
    private final static QName _WsTransferInfoRemitentePais_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "RemitentePais");
    private final static QName _WsTransferInfoRemitentePaisNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "RemitentePaisNombre");
    private final static QName _WsTransferInfoRemitenteTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "RemitenteTelefono");
    private final static QName _WsTransferInfoRemitenteZip_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "RemitenteZip");
    private final static QName _WsTransferInfoRoutingNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "RoutingNumber");
    private final static QName _WsTransferInfoSenderAchAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderAchAccount");
    private final static QName _WsTransferInfoSenderAchRouting_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderAchRouting");
    private final static QName _WsTransferInfoSenderAchType_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderAchType");
    private final static QName _WsTransferInfoSenderBirthDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderBirthDate");
    private final static QName _WsTransferInfoServicioCodigo_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ServicioCodigo");
    private final static QName _WsTransferInfoSucursalBanco_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SucursalBanco");
    private final static QName _WsTransferInfoSuspendMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SuspendMessage");
    private final static QName _WsTransferInfoSuspendUserType_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SuspendUserType");
    private final static QName _WsTransferInfoTasaError_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "TasaError");
    private final static QName _WsTransferInfoTelefonoBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "TelefonoBeneficiario");
    private final static QName _WsTransferInfoTempCompliance_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "TempCompliance");
    private final static QName _WsTransferInfoTempGiroRepetido_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "TempGiroRepetido");
    private final static QName _WsTransferInfoTipoCuentaCodigo_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "TipoCuentaCodigo");
    private final static QName _WsReceiverReceiverCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverCity");
    private final static QName _WsReceiverReceiverCompany_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverCompany");
    private final static QName _WsReceiverReceiverCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverCountry");
    private final static QName _WsReceiverReceiverCountryNationallity_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverCountryNationallity");
    private final static QName _WsReceiverReceiverCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverCurrency");
    private final static QName _WsReceiverReceiverDocExpiration_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverDocExpiration");
    private final static QName _WsReceiverReceiverFileImg_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverFileImg");
    private final static QName _WsReceiverReceiverFileImg2_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverFileImg2");
    private final static QName _WsReceiverReceiverGender_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverGender");
    private final static QName _WsReceiverReceiverIdIssuer_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverIdIssuer");
    private final static QName _WsReceiverReceiverMaritalStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverMaritalStatus");
    private final static QName _WsReceiverReceiverMoneyOrigin_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverMoneyOrigin");
    private final static QName _WsReceiverReceiverOccupation_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverOccupation");
    private final static QName _WsReceiverReceiverOfficeCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverOfficeCode");
    private final static QName _WsReceiverReceiverPOB_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverPOB");
    private final static QName _WsReceiverReceiverPicture_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverPicture");
    private final static QName _WsReceiverReceiverRemark_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverRemark");
    private final static QName _WsReceiverReceiverState_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "ReceiverState");
    private final static QName _WsSenderAgentAlias_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "AgentAlias");
    private final static QName _WsSenderSenderAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderAddress");
    private final static QName _WsSenderSenderAddressStreet_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderAddressStreet");
    private final static QName _WsSenderSenderBank_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderBank");
    private final static QName _WsSenderSenderCardBank_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderCardBank");
    private final static QName _WsSenderSenderCardExpiration_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderCardExpiration");
    private final static QName _WsSenderSenderCardName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderCardName");
    private final static QName _WsSenderSenderCardNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderCardNumber");
    private final static QName _WsSenderSenderCardType_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderCardType");
    private final static QName _WsSenderSenderCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderCity");
    private final static QName _WsSenderSenderComments_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderComments");
    private final static QName _WsSenderSenderComments3_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderComments3");
    private final static QName _WsSenderSenderCompany_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderCompany");
    private final static QName _WsSenderSenderCompanyAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderCompanyAddress");
    private final static QName _WsSenderSenderCompanyPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderCompanyPhone");
    private final static QName _WsSenderSenderCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderCountryCode");
    private final static QName _WsSenderSenderCountryNationallity_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderCountryNationallity");
    private final static QName _WsSenderSenderCountryResidence_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderCountryResidence");
    private final static QName _WsSenderSenderCurrencyCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderCurrencyCode");
    private final static QName _WsSenderSenderDocExpiration_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderDocExpiration");
    private final static QName _WsSenderSenderEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderEmail");
    private final static QName _WsSenderSenderFileImg_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderFileImg");
    private final static QName _WsSenderSenderFileImg2_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderFileImg2");
    private final static QName _WsSenderSenderGender_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderGender");
    private final static QName _WsSenderSenderIP_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderIP");
    private final static QName _WsSenderSenderIdCard_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderIdCard");
    private final static QName _WsSenderSenderIdIssuer_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderIdIssuer");
    private final static QName _WsSenderSenderIdNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderIdNumber");
    private final static QName _WsSenderSenderIdNumber2_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderIdNumber2");
    private final static QName _WsSenderSenderIdType_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderIdType");
    private final static QName _WsSenderSenderIdType2_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderIdType2");
    private final static QName _WsSenderSenderLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderLastName");
    private final static QName _WsSenderSenderMaritalStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderMaritalStatus");
    private final static QName _WsSenderSenderMobile_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderMobile");
    private final static QName _WsSenderSenderMoneyOrigin_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderMoneyOrigin");
    private final static QName _WsSenderSenderName_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderName");
    private final static QName _WsSenderSenderOccupation_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderOccupation");
    private final static QName _WsSenderSenderPOB_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderPOB");
    private final static QName _WsSenderSenderPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderPassword");
    private final static QName _WsSenderSenderPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderPhone");
    private final static QName _WsSenderSenderPicture_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderPicture");
    private final static QName _WsSenderSenderResidenceAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderResidenceAddress");
    private final static QName _WsSenderSenderResidenceAddressExtra_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderResidenceAddressExtra");
    private final static QName _WsSenderSenderResidenceCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderResidenceCity");
    private final static QName _WsSenderSenderResidenceCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderResidenceCountryCode");
    private final static QName _WsSenderSenderResidenceState_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderResidenceState");
    private final static QName _WsSenderSenderResidenceZip_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderResidenceZip");
    private final static QName _WsSenderSenderSendingReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderSendingReason");
    private final static QName _WsSenderSenderState_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderState");
    private final static QName _WsSenderSenderTrackingNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderTrackingNumber");
    private final static QName _WsSenderSenderZip_QNAME = new QName("http://schemas.datacontract.org/2004/07/gmtpay", "SenderZip");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lftechnology.gmt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertTransaction }
     * 
     */
    public InsertTransaction createInsertTransaction() {
        return new InsertTransaction();
    }

    /**
     * Create an instance of {@link WsSender }
     * 
     */
    public WsSender createWsSender() {
        return new WsSender();
    }

    /**
     * Create an instance of {@link WsReceiver }
     * 
     */
    public WsReceiver createWsReceiver() {
        return new WsReceiver();
    }

    /**
     * Create an instance of {@link WsTransferInfo }
     * 
     */
    public WsTransferInfo createWsTransferInfo() {
        return new WsTransferInfo();
    }

    /**
     * Create an instance of {@link InsertTransactionResponse }
     * 
     */
    public InsertTransactionResponse createInsertTransactionResponse() {
        return new InsertTransactionResponse();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link GetPaidTransactions }
     * 
     */
    public GetPaidTransactions createGetPaidTransactions() {
        return new GetPaidTransactions();
    }

    /**
     * Create an instance of {@link GetPaidTransactionsResponse }
     * 
     */
    public GetPaidTransactionsResponse createGetPaidTransactionsResponse() {
        return new GetPaidTransactionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfwsPaidTransactions }
     * 
     */
    public ArrayOfwsPaidTransactions createArrayOfwsPaidTransactions() {
        return new ArrayOfwsPaidTransactions();
    }

    /**
     * Create an instance of {@link ConfirmPayment }
     * 
     */
    public ConfirmPayment createConfirmPayment() {
        return new ConfirmPayment();
    }

    /**
     * Create an instance of {@link ConfirmPaymentResponse }
     * 
     */
    public ConfirmPaymentResponse createConfirmPaymentResponse() {
        return new ConfirmPaymentResponse();
    }

    /**
     * Create an instance of {@link RequestCancellation }
     * 
     */
    public RequestCancellation createRequestCancellation() {
        return new RequestCancellation();
    }

    /**
     * Create an instance of {@link RequestCancellationResponse }
     * 
     */
    public RequestCancellationResponse createRequestCancellationResponse() {
        return new RequestCancellationResponse();
    }

    /**
     * Create an instance of {@link GetCancelledTransactions }
     * 
     */
    public GetCancelledTransactions createGetCancelledTransactions() {
        return new GetCancelledTransactions();
    }

    /**
     * Create an instance of {@link GetCancelledTransactionsResponse }
     * 
     */
    public GetCancelledTransactionsResponse createGetCancelledTransactionsResponse() {
        return new GetCancelledTransactionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfwsVoidTransactions }
     * 
     */
    public ArrayOfwsVoidTransactions createArrayOfwsVoidTransactions() {
        return new ArrayOfwsVoidTransactions();
    }

    /**
     * Create an instance of {@link ConfirmCancellation }
     * 
     */
    public ConfirmCancellation createConfirmCancellation() {
        return new ConfirmCancellation();
    }

    /**
     * Create an instance of {@link ConfirmCancellationResponse }
     * 
     */
    public ConfirmCancellationResponse createConfirmCancellationResponse() {
        return new ConfirmCancellationResponse();
    }

    /**
     * Create an instance of {@link RequestModification }
     * 
     */
    public RequestModification createRequestModification() {
        return new RequestModification();
    }

    /**
     * Create an instance of {@link WsChangeRequestData }
     * 
     */
    public WsChangeRequestData createWsChangeRequestData() {
        return new WsChangeRequestData();
    }

    /**
     * Create an instance of {@link RequestModificationResponse }
     * 
     */
    public RequestModificationResponse createRequestModificationResponse() {
        return new RequestModificationResponse();
    }

    /**
     * Create an instance of {@link GetModifiedTransactions }
     * 
     */
    public GetModifiedTransactions createGetModifiedTransactions() {
        return new GetModifiedTransactions();
    }

    /**
     * Create an instance of {@link GetModifiedTransactionsResponse }
     * 
     */
    public GetModifiedTransactionsResponse createGetModifiedTransactionsResponse() {
        return new GetModifiedTransactionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfwsModifiedTransactions }
     * 
     */
    public ArrayOfwsModifiedTransactions createArrayOfwsModifiedTransactions() {
        return new ArrayOfwsModifiedTransactions();
    }

    /**
     * Create an instance of {@link ConfirmModification }
     * 
     */
    public ConfirmModification createConfirmModification() {
        return new ConfirmModification();
    }

    /**
     * Create an instance of {@link ConfirmModificationResponse }
     * 
     */
    public ConfirmModificationResponse createConfirmModificationResponse() {
        return new ConfirmModificationResponse();
    }

    /**
     * Create an instance of {@link GetReleasedTransactions }
     * 
     */
    public GetReleasedTransactions createGetReleasedTransactions() {
        return new GetReleasedTransactions();
    }

    /**
     * Create an instance of {@link GetReleasedTransactionsResponse }
     * 
     */
    public GetReleasedTransactionsResponse createGetReleasedTransactionsResponse() {
        return new GetReleasedTransactionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfwsReleasedTransactions }
     * 
     */
    public ArrayOfwsReleasedTransactions createArrayOfwsReleasedTransactions() {
        return new ArrayOfwsReleasedTransactions();
    }

    /**
     * Create an instance of {@link ConfirmRelease }
     * 
     */
    public ConfirmRelease createConfirmRelease() {
        return new ConfirmRelease();
    }

    /**
     * Create an instance of {@link ConfirmReleaseResponse }
     * 
     */
    public ConfirmReleaseResponse createConfirmReleaseResponse() {
        return new ConfirmReleaseResponse();
    }

    /**
     * Create an instance of {@link GetClearedAchTransactions }
     * 
     */
    public GetClearedAchTransactions createGetClearedAchTransactions() {
        return new GetClearedAchTransactions();
    }

    /**
     * Create an instance of {@link GetClearedAchTransactionsResponse }
     * 
     */
    public GetClearedAchTransactionsResponse createGetClearedAchTransactionsResponse() {
        return new GetClearedAchTransactionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfwsCollectedAch }
     * 
     */
    public ArrayOfwsCollectedAch createArrayOfwsCollectedAch() {
        return new ArrayOfwsCollectedAch();
    }

    /**
     * Create an instance of {@link ConfirmCollection }
     * 
     */
    public ConfirmCollection createConfirmCollection() {
        return new ConfirmCollection();
    }

    /**
     * Create an instance of {@link ConfirmCollectionResponse }
     * 
     */
    public ConfirmCollectionResponse createConfirmCollectionResponse() {
        return new ConfirmCollectionResponse();
    }

    /**
     * Create an instance of {@link GetNotifications }
     * 
     */
    public GetNotifications createGetNotifications() {
        return new GetNotifications();
    }

    /**
     * Create an instance of {@link GetNotificationsResponse }
     * 
     */
    public GetNotificationsResponse createGetNotificationsResponse() {
        return new GetNotificationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfwsNotifications }
     * 
     */
    public ArrayOfwsNotifications createArrayOfwsNotifications() {
        return new ArrayOfwsNotifications();
    }

    /**
     * Create an instance of {@link GetAchStatus }
     * 
     */
    public GetAchStatus createGetAchStatus() {
        return new GetAchStatus();
    }

    /**
     * Create an instance of {@link GetAchStatusResponse }
     * 
     */
    public GetAchStatusResponse createGetAchStatusResponse() {
        return new GetAchStatusResponse();
    }

    /**
     * Create an instance of {@link WsAchStatus }
     * 
     */
    public WsAchStatus createWsAchStatus() {
        return new WsAchStatus();
    }

    /**
     * Create an instance of {@link GetTransactionStatus }
     * 
     */
    public GetTransactionStatus createGetTransactionStatus() {
        return new GetTransactionStatus();
    }

    /**
     * Create an instance of {@link GetTransactionStatusResponse }
     * 
     */
    public GetTransactionStatusResponse createGetTransactionStatusResponse() {
        return new GetTransactionStatusResponse();
    }

    /**
     * Create an instance of {@link WsStatus }
     * 
     */
    public WsStatus createWsStatus() {
        return new WsStatus();
    }

    /**
     * Create an instance of {@link GetSingleExchangeRate }
     * 
     */
    public GetSingleExchangeRate createGetSingleExchangeRate() {
        return new GetSingleExchangeRate();
    }

    /**
     * Create an instance of {@link GetSingleExchangeRateResponse }
     * 
     */
    public GetSingleExchangeRateResponse createGetSingleExchangeRateResponse() {
        return new GetSingleExchangeRateResponse();
    }

    /**
     * Create an instance of {@link WsExRate }
     * 
     */
    public WsExRate createWsExRate() {
        return new WsExRate();
    }

    /**
     * Create an instance of {@link GetExchangeRates }
     * 
     */
    public GetExchangeRates createGetExchangeRates() {
        return new GetExchangeRates();
    }

    /**
     * Create an instance of {@link GetExchangeRatesResponse }
     * 
     */
    public GetExchangeRatesResponse createGetExchangeRatesResponse() {
        return new GetExchangeRatesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfwsExRateList }
     * 
     */
    public ArrayOfwsExRateList createArrayOfwsExRateList() {
        return new ArrayOfwsExRateList();
    }

    /**
     * Create an instance of {@link OfacVerification }
     * 
     */
    public OfacVerification createOfacVerification() {
        return new OfacVerification();
    }

    /**
     * Create an instance of {@link OfacVerificationResponse }
     * 
     */
    public OfacVerificationResponse createOfacVerificationResponse() {
        return new OfacVerificationResponse();
    }

    /**
     * Create an instance of {@link WsOfac }
     * 
     */
    public WsOfac createWsOfac() {
        return new WsOfac();
    }

    /**
     * Create an instance of {@link ComplianceCheck }
     * 
     */
    public ComplianceCheck createComplianceCheck() {
        return new ComplianceCheck();
    }

    /**
     * Create an instance of {@link ComplianceCheckResponse }
     * 
     */
    public ComplianceCheckResponse createComplianceCheckResponse() {
        return new ComplianceCheckResponse();
    }

    /**
     * Create an instance of {@link SetVerified }
     * 
     */
    public SetVerified createSetVerified() {
        return new SetVerified();
    }

    /**
     * Create an instance of {@link SetVerifiedResponse }
     * 
     */
    public SetVerifiedResponse createSetVerifiedResponse() {
        return new SetVerifiedResponse();
    }

    /**
     * Create an instance of {@link WsResult }
     * 
     */
    public WsResult createWsResult() {
        return new WsResult();
    }

    /**
     * Create an instance of {@link BillConsult }
     * 
     */
    public BillConsult createBillConsult() {
        return new BillConsult();
    }

    /**
     * Create an instance of {@link BillConsultResponse }
     * 
     */
    public BillConsultResponse createBillConsultResponse() {
        return new BillConsultResponse();
    }

    /**
     * Create an instance of {@link WsBillInfo }
     * 
     */
    public WsBillInfo createWsBillInfo() {
        return new WsBillInfo();
    }

    /**
     * Create an instance of {@link PayersConsult }
     * 
     */
    public PayersConsult createPayersConsult() {
        return new PayersConsult();
    }

    /**
     * Create an instance of {@link PayersConsultResponse }
     * 
     */
    public PayersConsultResponse createPayersConsultResponse() {
        return new PayersConsultResponse();
    }

    /**
     * Create an instance of {@link ArrayOfwsSelectPayersByCountryCodeResult }
     * 
     */
    public ArrayOfwsSelectPayersByCountryCodeResult createArrayOfwsSelectPayersByCountryCodeResult() {
        return new ArrayOfwsSelectPayersByCountryCodeResult();
    }

    /**
     * Create an instance of {@link GetReceiptData }
     * 
     */
    public GetReceiptData createGetReceiptData() {
        return new GetReceiptData();
    }

    /**
     * Create an instance of {@link GetReceiptDataResponse }
     * 
     */
    public GetReceiptDataResponse createGetReceiptDataResponse() {
        return new GetReceiptDataResponse();
    }

    /**
     * Create an instance of {@link ReceiptTemplate }
     * 
     */
    public ReceiptTemplate createReceiptTemplate() {
        return new ReceiptTemplate();
    }

    /**
     * Create an instance of {@link GetCityByZip }
     * 
     */
    public GetCityByZip createGetCityByZip() {
        return new GetCityByZip();
    }

    /**
     * Create an instance of {@link GetCityByZipResponse }
     * 
     */
    public GetCityByZipResponse createGetCityByZipResponse() {
        return new GetCityByZipResponse();
    }

    /**
     * Create an instance of {@link CityByZip }
     * 
     */
    public CityByZip createCityByZip() {
        return new CityByZip();
    }

    /**
     * Create an instance of {@link CheckPayerLimits }
     * 
     */
    public CheckPayerLimits createCheckPayerLimits() {
        return new CheckPayerLimits();
    }

    /**
     * Create an instance of {@link CheckPayerLimitsResponse }
     * 
     */
    public CheckPayerLimitsResponse createCheckPayerLimitsResponse() {
        return new CheckPayerLimitsResponse();
    }

    /**
     * Create an instance of {@link WsLimitByPayerResult }
     * 
     */
    public WsLimitByPayerResult createWsLimitByPayerResult() {
        return new WsLimitByPayerResult();
    }

    /**
     * Create an instance of {@link PromotionsCode }
     * 
     */
    public PromotionsCode createPromotionsCode() {
        return new PromotionsCode();
    }

    /**
     * Create an instance of {@link PromotionsCodeResponse }
     * 
     */
    public PromotionsCodeResponse createPromotionsCodeResponse() {
        return new PromotionsCodeResponse();
    }

    /**
     * Create an instance of {@link WsSelectPromoResult }
     * 
     */
    public WsSelectPromoResult createWsSelectPromoResult() {
        return new WsSelectPromoResult();
    }

    /**
     * Create an instance of {@link WsPaidTransactions }
     * 
     */
    public WsPaidTransactions createWsPaidTransactions() {
        return new WsPaidTransactions();
    }

    /**
     * Create an instance of {@link WsVoidTransactions }
     * 
     */
    public WsVoidTransactions createWsVoidTransactions() {
        return new WsVoidTransactions();
    }

    /**
     * Create an instance of {@link WsModifiedTransactions }
     * 
     */
    public WsModifiedTransactions createWsModifiedTransactions() {
        return new WsModifiedTransactions();
    }

    /**
     * Create an instance of {@link WsReleasedTransactions }
     * 
     */
    public WsReleasedTransactions createWsReleasedTransactions() {
        return new WsReleasedTransactions();
    }

    /**
     * Create an instance of {@link WsCollectedAch }
     * 
     */
    public WsCollectedAch createWsCollectedAch() {
        return new WsCollectedAch();
    }

    /**
     * Create an instance of {@link WsNotifications }
     * 
     */
    public WsNotifications createWsNotifications() {
        return new WsNotifications();
    }

    /**
     * Create an instance of {@link WsExRateList }
     * 
     */
    public WsExRateList createWsExRateList() {
        return new WsExRateList();
    }

    /**
     * Create an instance of {@link WsSelectPayersByCountryCodeResult }
     * 
     */
    public WsSelectPayersByCountryCodeResult createWsSelectPayersByCountryCodeResult() {
        return new WsSelectPayersByCountryCodeResult();
    }

    /**
     * Create an instance of {@link ArrayOfwsSelectPayerAccountTypesResult }
     * 
     */
    public ArrayOfwsSelectPayerAccountTypesResult createArrayOfwsSelectPayerAccountTypesResult() {
        return new ArrayOfwsSelectPayerAccountTypesResult();
    }

    /**
     * Create an instance of {@link WsSelectPayerAccountTypesResult }
     * 
     */
    public WsSelectPayerAccountTypesResult createWsSelectPayerAccountTypesResult() {
        return new WsSelectPayerAccountTypesResult();
    }

    /**
     * Create an instance of {@link ArrayOfwsSelectPayerBanksResult }
     * 
     */
    public ArrayOfwsSelectPayerBanksResult createArrayOfwsSelectPayerBanksResult() {
        return new ArrayOfwsSelectPayerBanksResult();
    }

    /**
     * Create an instance of {@link WsSelectPayerBanksResult }
     * 
     */
    public WsSelectPayerBanksResult createWsSelectPayerBanksResult() {
        return new WsSelectPayerBanksResult();
    }

    /**
     * Create an instance of {@link ArrayOfwsSelectPayerCurrenciesResult }
     * 
     */
    public ArrayOfwsSelectPayerCurrenciesResult createArrayOfwsSelectPayerCurrenciesResult() {
        return new ArrayOfwsSelectPayerCurrenciesResult();
    }

    /**
     * Create an instance of {@link WsSelectPayerCurrenciesResult }
     * 
     */
    public WsSelectPayerCurrenciesResult createWsSelectPayerCurrenciesResult() {
        return new WsSelectPayerCurrenciesResult();
    }

    /**
     * Create an instance of {@link ArrayOfwsSelectPayerLimitsResult }
     * 
     */
    public ArrayOfwsSelectPayerLimitsResult createArrayOfwsSelectPayerLimitsResult() {
        return new ArrayOfwsSelectPayerLimitsResult();
    }

    /**
     * Create an instance of {@link WsSelectPayerLimitsResult }
     * 
     */
    public WsSelectPayerLimitsResult createWsSelectPayerLimitsResult() {
        return new WsSelectPayerLimitsResult();
    }

    /**
     * Create an instance of {@link ArrayOfwsSelectPayerOfficesResult }
     * 
     */
    public ArrayOfwsSelectPayerOfficesResult createArrayOfwsSelectPayerOfficesResult() {
        return new ArrayOfwsSelectPayerOfficesResult();
    }

    /**
     * Create an instance of {@link WsSelectPayerOfficesResult }
     * 
     */
    public WsSelectPayerOfficesResult createWsSelectPayerOfficesResult() {
        return new WsSelectPayerOfficesResult();
    }

    /**
     * Create an instance of {@link ArrayOfwsSelectPayerServicesResult }
     * 
     */
    public ArrayOfwsSelectPayerServicesResult createArrayOfwsSelectPayerServicesResult() {
        return new ArrayOfwsSelectPayerServicesResult();
    }

    /**
     * Create an instance of {@link WsSelectPayerServicesResult }
     * 
     */
    public WsSelectPayerServicesResult createWsSelectPayerServicesResult() {
        return new WsSelectPayerServicesResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSender }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsSender }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsSender")
    public JAXBElement<WsSender> createWsSender(WsSender value) {
        return new JAXBElement<WsSender>(_WsSender_QNAME, WsSender.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsReceiver }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsReceiver }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsReceiver")
    public JAXBElement<WsReceiver> createWsReceiver(WsReceiver value) {
        return new JAXBElement<WsReceiver>(_WsReceiver_QNAME, WsReceiver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsTransferInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsTransferInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsTransferInfo")
    public JAXBElement<WsTransferInfo> createWsTransferInfo(WsTransferInfo value) {
        return new JAXBElement<WsTransferInfo>(_WsTransferInfo_QNAME, WsTransferInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsResponse")
    public JAXBElement<WsResponse> createWsResponse(WsResponse value) {
        return new JAXBElement<WsResponse>(_WsResponse_QNAME, WsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsPaidTransactions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsPaidTransactions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfwsPaidTransactions")
    public JAXBElement<ArrayOfwsPaidTransactions> createArrayOfwsPaidTransactions(ArrayOfwsPaidTransactions value) {
        return new JAXBElement<ArrayOfwsPaidTransactions>(_ArrayOfwsPaidTransactions_QNAME, ArrayOfwsPaidTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsPaidTransactions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsPaidTransactions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsPaidTransactions")
    public JAXBElement<WsPaidTransactions> createWsPaidTransactions(WsPaidTransactions value) {
        return new JAXBElement<WsPaidTransactions>(_WsPaidTransactions_QNAME, WsPaidTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsVoidTransactions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsVoidTransactions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfwsVoidTransactions")
    public JAXBElement<ArrayOfwsVoidTransactions> createArrayOfwsVoidTransactions(ArrayOfwsVoidTransactions value) {
        return new JAXBElement<ArrayOfwsVoidTransactions>(_ArrayOfwsVoidTransactions_QNAME, ArrayOfwsVoidTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsVoidTransactions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsVoidTransactions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsVoidTransactions")
    public JAXBElement<WsVoidTransactions> createWsVoidTransactions(WsVoidTransactions value) {
        return new JAXBElement<WsVoidTransactions>(_WsVoidTransactions_QNAME, WsVoidTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsChangeRequestData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsChangeRequestData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsChangeRequestData")
    public JAXBElement<WsChangeRequestData> createWsChangeRequestData(WsChangeRequestData value) {
        return new JAXBElement<WsChangeRequestData>(_WsChangeRequestData_QNAME, WsChangeRequestData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsModifiedTransactions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsModifiedTransactions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfwsModifiedTransactions")
    public JAXBElement<ArrayOfwsModifiedTransactions> createArrayOfwsModifiedTransactions(ArrayOfwsModifiedTransactions value) {
        return new JAXBElement<ArrayOfwsModifiedTransactions>(_ArrayOfwsModifiedTransactions_QNAME, ArrayOfwsModifiedTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsModifiedTransactions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsModifiedTransactions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsModifiedTransactions")
    public JAXBElement<WsModifiedTransactions> createWsModifiedTransactions(WsModifiedTransactions value) {
        return new JAXBElement<WsModifiedTransactions>(_WsModifiedTransactions_QNAME, WsModifiedTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsReleasedTransactions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsReleasedTransactions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfwsReleasedTransactions")
    public JAXBElement<ArrayOfwsReleasedTransactions> createArrayOfwsReleasedTransactions(ArrayOfwsReleasedTransactions value) {
        return new JAXBElement<ArrayOfwsReleasedTransactions>(_ArrayOfwsReleasedTransactions_QNAME, ArrayOfwsReleasedTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsReleasedTransactions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsReleasedTransactions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsReleasedTransactions")
    public JAXBElement<WsReleasedTransactions> createWsReleasedTransactions(WsReleasedTransactions value) {
        return new JAXBElement<WsReleasedTransactions>(_WsReleasedTransactions_QNAME, WsReleasedTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsCollectedAch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsCollectedAch }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfwsCollectedAch")
    public JAXBElement<ArrayOfwsCollectedAch> createArrayOfwsCollectedAch(ArrayOfwsCollectedAch value) {
        return new JAXBElement<ArrayOfwsCollectedAch>(_ArrayOfwsCollectedAch_QNAME, ArrayOfwsCollectedAch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsCollectedAch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsCollectedAch }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsCollectedAch")
    public JAXBElement<WsCollectedAch> createWsCollectedAch(WsCollectedAch value) {
        return new JAXBElement<WsCollectedAch>(_WsCollectedAch_QNAME, WsCollectedAch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsNotifications }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsNotifications }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfwsNotifications")
    public JAXBElement<ArrayOfwsNotifications> createArrayOfwsNotifications(ArrayOfwsNotifications value) {
        return new JAXBElement<ArrayOfwsNotifications>(_ArrayOfwsNotifications_QNAME, ArrayOfwsNotifications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsNotifications }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsNotifications }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsNotifications")
    public JAXBElement<WsNotifications> createWsNotifications(WsNotifications value) {
        return new JAXBElement<WsNotifications>(_WsNotifications_QNAME, WsNotifications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsAchStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsAchStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsAchStatus")
    public JAXBElement<WsAchStatus> createWsAchStatus(WsAchStatus value) {
        return new JAXBElement<WsAchStatus>(_WsAchStatus_QNAME, WsAchStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsStatus")
    public JAXBElement<WsStatus> createWsStatus(WsStatus value) {
        return new JAXBElement<WsStatus>(_WsStatus_QNAME, WsStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsExRate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsExRate }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsExRate")
    public JAXBElement<WsExRate> createWsExRate(WsExRate value) {
        return new JAXBElement<WsExRate>(_WsExRate_QNAME, WsExRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsExRateList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsExRateList }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfwsExRateList")
    public JAXBElement<ArrayOfwsExRateList> createArrayOfwsExRateList(ArrayOfwsExRateList value) {
        return new JAXBElement<ArrayOfwsExRateList>(_ArrayOfwsExRateList_QNAME, ArrayOfwsExRateList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsExRateList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsExRateList }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsExRateList")
    public JAXBElement<WsExRateList> createWsExRateList(WsExRateList value) {
        return new JAXBElement<WsExRateList>(_WsExRateList_QNAME, WsExRateList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsOfac }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsOfac }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsOfac")
    public JAXBElement<WsOfac> createWsOfac(WsOfac value) {
        return new JAXBElement<WsOfac>(_WsOfac_QNAME, WsOfac.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsResult")
    public JAXBElement<WsResult> createWsResult(WsResult value) {
        return new JAXBElement<WsResult>(_WsResult_QNAME, WsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsBillInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsBillInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "wsBillInfo")
    public JAXBElement<WsBillInfo> createWsBillInfo(WsBillInfo value) {
        return new JAXBElement<WsBillInfo>(_WsBillInfo_QNAME, WsBillInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayersByCountryCodeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayersByCountryCodeResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfws_Select_PayersByCountryCodeResult")
    public JAXBElement<ArrayOfwsSelectPayersByCountryCodeResult> createArrayOfwsSelectPayersByCountryCodeResult(ArrayOfwsSelectPayersByCountryCodeResult value) {
        return new JAXBElement<ArrayOfwsSelectPayersByCountryCodeResult>(_ArrayOfwsSelectPayersByCountryCodeResult_QNAME, ArrayOfwsSelectPayersByCountryCodeResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSelectPayersByCountryCodeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsSelectPayersByCountryCodeResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ws_Select_PayersByCountryCodeResult")
    public JAXBElement<WsSelectPayersByCountryCodeResult> createWsSelectPayersByCountryCodeResult(WsSelectPayersByCountryCodeResult value) {
        return new JAXBElement<WsSelectPayersByCountryCodeResult>(_WsSelectPayersByCountryCodeResult_QNAME, WsSelectPayersByCountryCodeResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerAccountTypesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerAccountTypesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfws_Select_PayerAccountTypesResult")
    public JAXBElement<ArrayOfwsSelectPayerAccountTypesResult> createArrayOfwsSelectPayerAccountTypesResult(ArrayOfwsSelectPayerAccountTypesResult value) {
        return new JAXBElement<ArrayOfwsSelectPayerAccountTypesResult>(_ArrayOfwsSelectPayerAccountTypesResult_QNAME, ArrayOfwsSelectPayerAccountTypesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSelectPayerAccountTypesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsSelectPayerAccountTypesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ws_Select_PayerAccountTypesResult")
    public JAXBElement<WsSelectPayerAccountTypesResult> createWsSelectPayerAccountTypesResult(WsSelectPayerAccountTypesResult value) {
        return new JAXBElement<WsSelectPayerAccountTypesResult>(_WsSelectPayerAccountTypesResult_QNAME, WsSelectPayerAccountTypesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerBanksResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerBanksResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfws_Select_PayerBanksResult")
    public JAXBElement<ArrayOfwsSelectPayerBanksResult> createArrayOfwsSelectPayerBanksResult(ArrayOfwsSelectPayerBanksResult value) {
        return new JAXBElement<ArrayOfwsSelectPayerBanksResult>(_ArrayOfwsSelectPayerBanksResult_QNAME, ArrayOfwsSelectPayerBanksResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSelectPayerBanksResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsSelectPayerBanksResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ws_Select_PayerBanksResult")
    public JAXBElement<WsSelectPayerBanksResult> createWsSelectPayerBanksResult(WsSelectPayerBanksResult value) {
        return new JAXBElement<WsSelectPayerBanksResult>(_WsSelectPayerBanksResult_QNAME, WsSelectPayerBanksResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerCurrenciesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerCurrenciesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfws_Select_PayerCurrenciesResult")
    public JAXBElement<ArrayOfwsSelectPayerCurrenciesResult> createArrayOfwsSelectPayerCurrenciesResult(ArrayOfwsSelectPayerCurrenciesResult value) {
        return new JAXBElement<ArrayOfwsSelectPayerCurrenciesResult>(_ArrayOfwsSelectPayerCurrenciesResult_QNAME, ArrayOfwsSelectPayerCurrenciesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSelectPayerCurrenciesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsSelectPayerCurrenciesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ws_Select_PayerCurrenciesResult")
    public JAXBElement<WsSelectPayerCurrenciesResult> createWsSelectPayerCurrenciesResult(WsSelectPayerCurrenciesResult value) {
        return new JAXBElement<WsSelectPayerCurrenciesResult>(_WsSelectPayerCurrenciesResult_QNAME, WsSelectPayerCurrenciesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerLimitsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerLimitsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfws_Select_PayerLimitsResult")
    public JAXBElement<ArrayOfwsSelectPayerLimitsResult> createArrayOfwsSelectPayerLimitsResult(ArrayOfwsSelectPayerLimitsResult value) {
        return new JAXBElement<ArrayOfwsSelectPayerLimitsResult>(_ArrayOfwsSelectPayerLimitsResult_QNAME, ArrayOfwsSelectPayerLimitsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSelectPayerLimitsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsSelectPayerLimitsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ws_Select_PayerLimitsResult")
    public JAXBElement<WsSelectPayerLimitsResult> createWsSelectPayerLimitsResult(WsSelectPayerLimitsResult value) {
        return new JAXBElement<WsSelectPayerLimitsResult>(_WsSelectPayerLimitsResult_QNAME, WsSelectPayerLimitsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerOfficesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerOfficesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfws_Select_PayerOfficesResult")
    public JAXBElement<ArrayOfwsSelectPayerOfficesResult> createArrayOfwsSelectPayerOfficesResult(ArrayOfwsSelectPayerOfficesResult value) {
        return new JAXBElement<ArrayOfwsSelectPayerOfficesResult>(_ArrayOfwsSelectPayerOfficesResult_QNAME, ArrayOfwsSelectPayerOfficesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSelectPayerOfficesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsSelectPayerOfficesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ws_Select_PayerOfficesResult")
    public JAXBElement<WsSelectPayerOfficesResult> createWsSelectPayerOfficesResult(WsSelectPayerOfficesResult value) {
        return new JAXBElement<WsSelectPayerOfficesResult>(_WsSelectPayerOfficesResult_QNAME, WsSelectPayerOfficesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerServicesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerServicesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ArrayOfws_Select_PayerServicesResult")
    public JAXBElement<ArrayOfwsSelectPayerServicesResult> createArrayOfwsSelectPayerServicesResult(ArrayOfwsSelectPayerServicesResult value) {
        return new JAXBElement<ArrayOfwsSelectPayerServicesResult>(_ArrayOfwsSelectPayerServicesResult_QNAME, ArrayOfwsSelectPayerServicesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSelectPayerServicesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsSelectPayerServicesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ws_Select_PayerServicesResult")
    public JAXBElement<WsSelectPayerServicesResult> createWsSelectPayerServicesResult(WsSelectPayerServicesResult value) {
        return new JAXBElement<WsSelectPayerServicesResult>(_WsSelectPayerServicesResult_QNAME, WsSelectPayerServicesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptTemplate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReceiptTemplate }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiptTemplate")
    public JAXBElement<ReceiptTemplate> createReceiptTemplate(ReceiptTemplate value) {
        return new JAXBElement<ReceiptTemplate>(_ReceiptTemplate_QNAME, ReceiptTemplate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityByZip }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CityByZip }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CityByZip")
    public JAXBElement<CityByZip> createCityByZip(CityByZip value) {
        return new JAXBElement<CityByZip>(_CityByZip_QNAME, CityByZip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsLimitByPayerResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsLimitByPayerResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ws_LimitByPayerResult")
    public JAXBElement<WsLimitByPayerResult> createWsLimitByPayerResult(WsLimitByPayerResult value) {
        return new JAXBElement<WsLimitByPayerResult>(_WsLimitByPayerResult_QNAME, WsLimitByPayerResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSelectPromoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsSelectPromoResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ws_Select_PromoResult")
    public JAXBElement<WsSelectPromoResult> createWsSelectPromoResult(WsSelectPromoResult value) {
        return new JAXBElement<WsSelectPromoResult>(_WsSelectPromoResult_QNAME, WsSelectPromoResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = InsertTransaction.class)
    public JAXBElement<String> createInsertTransactionAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, InsertTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = InsertTransaction.class)
    public JAXBElement<String> createInsertTransactionUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, InsertTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = InsertTransaction.class)
    public JAXBElement<String> createInsertTransactionPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, InsertTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSender }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsSender }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sender", scope = InsertTransaction.class)
    public JAXBElement<WsSender> createInsertTransactionSender(WsSender value) {
        return new JAXBElement<WsSender>(_InsertTransactionSender_QNAME, WsSender.class, InsertTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsReceiver }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsReceiver }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "receiver", scope = InsertTransaction.class)
    public JAXBElement<WsReceiver> createInsertTransactionReceiver(WsReceiver value) {
        return new JAXBElement<WsReceiver>(_InsertTransactionReceiver_QNAME, WsReceiver.class, InsertTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsTransferInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsTransferInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "transfer", scope = InsertTransaction.class)
    public JAXBElement<WsTransferInfo> createInsertTransactionTransfer(WsTransferInfo value) {
        return new JAXBElement<WsTransferInfo>(_InsertTransactionTransfer_QNAME, WsTransferInfo.class, InsertTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InsertTransactionResult", scope = InsertTransactionResponse.class)
    public JAXBElement<WsResponse> createInsertTransactionResponseInsertTransactionResult(WsResponse value) {
        return new JAXBElement<WsResponse>(_InsertTransactionResponseInsertTransactionResult_QNAME, WsResponse.class, InsertTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = GetPaidTransactions.class)
    public JAXBElement<String> createGetPaidTransactionsAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, GetPaidTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetPaidTransactions.class)
    public JAXBElement<String> createGetPaidTransactionsUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, GetPaidTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = GetPaidTransactions.class)
    public JAXBElement<String> createGetPaidTransactionsPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, GetPaidTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsPaidTransactions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsPaidTransactions }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPaidTransactionsResult", scope = GetPaidTransactionsResponse.class)
    public JAXBElement<ArrayOfwsPaidTransactions> createGetPaidTransactionsResponseGetPaidTransactionsResult(ArrayOfwsPaidTransactions value) {
        return new JAXBElement<ArrayOfwsPaidTransactions>(_GetPaidTransactionsResponseGetPaidTransactionsResult_QNAME, ArrayOfwsPaidTransactions.class, GetPaidTransactionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = ConfirmPayment.class)
    public JAXBElement<String> createConfirmPaymentAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, ConfirmPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = ConfirmPayment.class)
    public JAXBElement<String> createConfirmPaymentUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, ConfirmPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = ConfirmPayment.class)
    public JAXBElement<String> createConfirmPaymentPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, ConfirmPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "receipt", scope = ConfirmPayment.class)
    public JAXBElement<String> createConfirmPaymentReceipt(String value) {
        return new JAXBElement<String>(_ConfirmPaymentReceipt_QNAME, String.class, ConfirmPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConfirmPaymentResult", scope = ConfirmPaymentResponse.class)
    public JAXBElement<WsResponse> createConfirmPaymentResponseConfirmPaymentResult(WsResponse value) {
        return new JAXBElement<WsResponse>(_ConfirmPaymentResponseConfirmPaymentResult_QNAME, WsResponse.class, ConfirmPaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = RequestCancellation.class)
    public JAXBElement<String> createRequestCancellationAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, RequestCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = RequestCancellation.class)
    public JAXBElement<String> createRequestCancellationUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, RequestCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = RequestCancellation.class)
    public JAXBElement<String> createRequestCancellationPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, RequestCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "receipt", scope = RequestCancellation.class)
    public JAXBElement<String> createRequestCancellationReceipt(String value) {
        return new JAXBElement<String>(_ConfirmPaymentReceipt_QNAME, String.class, RequestCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "comment", scope = RequestCancellation.class)
    public JAXBElement<String> createRequestCancellationComment(String value) {
        return new JAXBElement<String>(_RequestCancellationComment_QNAME, String.class, RequestCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestCancellationResult", scope = RequestCancellationResponse.class)
    public JAXBElement<WsResponse> createRequestCancellationResponseRequestCancellationResult(WsResponse value) {
        return new JAXBElement<WsResponse>(_RequestCancellationResponseRequestCancellationResult_QNAME, WsResponse.class, RequestCancellationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = GetCancelledTransactions.class)
    public JAXBElement<String> createGetCancelledTransactionsAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, GetCancelledTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetCancelledTransactions.class)
    public JAXBElement<String> createGetCancelledTransactionsUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, GetCancelledTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = GetCancelledTransactions.class)
    public JAXBElement<String> createGetCancelledTransactionsPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, GetCancelledTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsVoidTransactions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsVoidTransactions }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCancelledTransactionsResult", scope = GetCancelledTransactionsResponse.class)
    public JAXBElement<ArrayOfwsVoidTransactions> createGetCancelledTransactionsResponseGetCancelledTransactionsResult(ArrayOfwsVoidTransactions value) {
        return new JAXBElement<ArrayOfwsVoidTransactions>(_GetCancelledTransactionsResponseGetCancelledTransactionsResult_QNAME, ArrayOfwsVoidTransactions.class, GetCancelledTransactionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = ConfirmCancellation.class)
    public JAXBElement<String> createConfirmCancellationAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, ConfirmCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = ConfirmCancellation.class)
    public JAXBElement<String> createConfirmCancellationUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, ConfirmCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = ConfirmCancellation.class)
    public JAXBElement<String> createConfirmCancellationPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, ConfirmCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "receipt", scope = ConfirmCancellation.class)
    public JAXBElement<String> createConfirmCancellationReceipt(String value) {
        return new JAXBElement<String>(_ConfirmPaymentReceipt_QNAME, String.class, ConfirmCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConfirmCancellationResult", scope = ConfirmCancellationResponse.class)
    public JAXBElement<WsResponse> createConfirmCancellationResponseConfirmCancellationResult(WsResponse value) {
        return new JAXBElement<WsResponse>(_ConfirmCancellationResponseConfirmCancellationResult_QNAME, WsResponse.class, ConfirmCancellationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = RequestModification.class)
    public JAXBElement<String> createRequestModificationAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, RequestModification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = RequestModification.class)
    public JAXBElement<String> createRequestModificationUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, RequestModification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = RequestModification.class)
    public JAXBElement<String> createRequestModificationPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, RequestModification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "receipt", scope = RequestModification.class)
    public JAXBElement<String> createRequestModificationReceipt(String value) {
        return new JAXBElement<String>(_ConfirmPaymentReceipt_QNAME, String.class, RequestModification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "comment", scope = RequestModification.class)
    public JAXBElement<String> createRequestModificationComment(String value) {
        return new JAXBElement<String>(_RequestCancellationComment_QNAME, String.class, RequestModification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsChangeRequestData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsChangeRequestData }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "data", scope = RequestModification.class)
    public JAXBElement<WsChangeRequestData> createRequestModificationData(WsChangeRequestData value) {
        return new JAXBElement<WsChangeRequestData>(_RequestModificationData_QNAME, WsChangeRequestData.class, RequestModification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestModificationResult", scope = RequestModificationResponse.class)
    public JAXBElement<WsResponse> createRequestModificationResponseRequestModificationResult(WsResponse value) {
        return new JAXBElement<WsResponse>(_RequestModificationResponseRequestModificationResult_QNAME, WsResponse.class, RequestModificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = GetModifiedTransactions.class)
    public JAXBElement<String> createGetModifiedTransactionsAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, GetModifiedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetModifiedTransactions.class)
    public JAXBElement<String> createGetModifiedTransactionsUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, GetModifiedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = GetModifiedTransactions.class)
    public JAXBElement<String> createGetModifiedTransactionsPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, GetModifiedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsModifiedTransactions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsModifiedTransactions }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetModifiedTransactionsResult", scope = GetModifiedTransactionsResponse.class)
    public JAXBElement<ArrayOfwsModifiedTransactions> createGetModifiedTransactionsResponseGetModifiedTransactionsResult(ArrayOfwsModifiedTransactions value) {
        return new JAXBElement<ArrayOfwsModifiedTransactions>(_GetModifiedTransactionsResponseGetModifiedTransactionsResult_QNAME, ArrayOfwsModifiedTransactions.class, GetModifiedTransactionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = ConfirmModification.class)
    public JAXBElement<String> createConfirmModificationAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, ConfirmModification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = ConfirmModification.class)
    public JAXBElement<String> createConfirmModificationUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, ConfirmModification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = ConfirmModification.class)
    public JAXBElement<String> createConfirmModificationPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, ConfirmModification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "receipt", scope = ConfirmModification.class)
    public JAXBElement<String> createConfirmModificationReceipt(String value) {
        return new JAXBElement<String>(_ConfirmPaymentReceipt_QNAME, String.class, ConfirmModification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConfirmModificationResult", scope = ConfirmModificationResponse.class)
    public JAXBElement<WsResponse> createConfirmModificationResponseConfirmModificationResult(WsResponse value) {
        return new JAXBElement<WsResponse>(_ConfirmModificationResponseConfirmModificationResult_QNAME, WsResponse.class, ConfirmModificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = GetReleasedTransactions.class)
    public JAXBElement<String> createGetReleasedTransactionsAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, GetReleasedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetReleasedTransactions.class)
    public JAXBElement<String> createGetReleasedTransactionsUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, GetReleasedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = GetReleasedTransactions.class)
    public JAXBElement<String> createGetReleasedTransactionsPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, GetReleasedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsReleasedTransactions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsReleasedTransactions }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetReleasedTransactionsResult", scope = GetReleasedTransactionsResponse.class)
    public JAXBElement<ArrayOfwsReleasedTransactions> createGetReleasedTransactionsResponseGetReleasedTransactionsResult(ArrayOfwsReleasedTransactions value) {
        return new JAXBElement<ArrayOfwsReleasedTransactions>(_GetReleasedTransactionsResponseGetReleasedTransactionsResult_QNAME, ArrayOfwsReleasedTransactions.class, GetReleasedTransactionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = ConfirmRelease.class)
    public JAXBElement<String> createConfirmReleaseAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, ConfirmRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = ConfirmRelease.class)
    public JAXBElement<String> createConfirmReleaseUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, ConfirmRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = ConfirmRelease.class)
    public JAXBElement<String> createConfirmReleasePass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, ConfirmRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "receipt", scope = ConfirmRelease.class)
    public JAXBElement<String> createConfirmReleaseReceipt(String value) {
        return new JAXBElement<String>(_ConfirmPaymentReceipt_QNAME, String.class, ConfirmRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConfirmReleaseResult", scope = ConfirmReleaseResponse.class)
    public JAXBElement<WsResponse> createConfirmReleaseResponseConfirmReleaseResult(WsResponse value) {
        return new JAXBElement<WsResponse>(_ConfirmReleaseResponseConfirmReleaseResult_QNAME, WsResponse.class, ConfirmReleaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = GetClearedAchTransactions.class)
    public JAXBElement<String> createGetClearedAchTransactionsAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, GetClearedAchTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetClearedAchTransactions.class)
    public JAXBElement<String> createGetClearedAchTransactionsUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, GetClearedAchTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = GetClearedAchTransactions.class)
    public JAXBElement<String> createGetClearedAchTransactionsPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, GetClearedAchTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsCollectedAch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsCollectedAch }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetClearedAchTransactionsResult", scope = GetClearedAchTransactionsResponse.class)
    public JAXBElement<ArrayOfwsCollectedAch> createGetClearedAchTransactionsResponseGetClearedAchTransactionsResult(ArrayOfwsCollectedAch value) {
        return new JAXBElement<ArrayOfwsCollectedAch>(_GetClearedAchTransactionsResponseGetClearedAchTransactionsResult_QNAME, ArrayOfwsCollectedAch.class, GetClearedAchTransactionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = ConfirmCollection.class)
    public JAXBElement<String> createConfirmCollectionAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, ConfirmCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = ConfirmCollection.class)
    public JAXBElement<String> createConfirmCollectionUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, ConfirmCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = ConfirmCollection.class)
    public JAXBElement<String> createConfirmCollectionPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, ConfirmCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "receipt", scope = ConfirmCollection.class)
    public JAXBElement<String> createConfirmCollectionReceipt(String value) {
        return new JAXBElement<String>(_ConfirmPaymentReceipt_QNAME, String.class, ConfirmCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConfirmCollectionResult", scope = ConfirmCollectionResponse.class)
    public JAXBElement<WsResponse> createConfirmCollectionResponseConfirmCollectionResult(WsResponse value) {
        return new JAXBElement<WsResponse>(_ConfirmCollectionResponseConfirmCollectionResult_QNAME, WsResponse.class, ConfirmCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = GetNotifications.class)
    public JAXBElement<String> createGetNotificationsAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, GetNotifications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetNotifications.class)
    public JAXBElement<String> createGetNotificationsUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, GetNotifications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = GetNotifications.class)
    public JAXBElement<String> createGetNotificationsPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, GetNotifications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsNotifications }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsNotifications }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetNotificationsResult", scope = GetNotificationsResponse.class)
    public JAXBElement<ArrayOfwsNotifications> createGetNotificationsResponseGetNotificationsResult(ArrayOfwsNotifications value) {
        return new JAXBElement<ArrayOfwsNotifications>(_GetNotificationsResponseGetNotificationsResult_QNAME, ArrayOfwsNotifications.class, GetNotificationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = GetAchStatus.class)
    public JAXBElement<String> createGetAchStatusAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, GetAchStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetAchStatus.class)
    public JAXBElement<String> createGetAchStatusUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, GetAchStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = GetAchStatus.class)
    public JAXBElement<String> createGetAchStatusPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, GetAchStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "receipt", scope = GetAchStatus.class)
    public JAXBElement<String> createGetAchStatusReceipt(String value) {
        return new JAXBElement<String>(_ConfirmPaymentReceipt_QNAME, String.class, GetAchStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsAchStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsAchStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAchStatusResult", scope = GetAchStatusResponse.class)
    public JAXBElement<WsAchStatus> createGetAchStatusResponseGetAchStatusResult(WsAchStatus value) {
        return new JAXBElement<WsAchStatus>(_GetAchStatusResponseGetAchStatusResult_QNAME, WsAchStatus.class, GetAchStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = GetTransactionStatus.class)
    public JAXBElement<String> createGetTransactionStatusAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, GetTransactionStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetTransactionStatus.class)
    public JAXBElement<String> createGetTransactionStatusUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, GetTransactionStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = GetTransactionStatus.class)
    public JAXBElement<String> createGetTransactionStatusPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, GetTransactionStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "receipt", scope = GetTransactionStatus.class)
    public JAXBElement<String> createGetTransactionStatusReceipt(String value) {
        return new JAXBElement<String>(_ConfirmPaymentReceipt_QNAME, String.class, GetTransactionStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTransactionStatusResult", scope = GetTransactionStatusResponse.class)
    public JAXBElement<WsStatus> createGetTransactionStatusResponseGetTransactionStatusResult(WsStatus value) {
        return new JAXBElement<WsStatus>(_GetTransactionStatusResponseGetTransactionStatusResult_QNAME, WsStatus.class, GetTransactionStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = GetSingleExchangeRate.class)
    public JAXBElement<String> createGetSingleExchangeRateAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, GetSingleExchangeRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetSingleExchangeRate.class)
    public JAXBElement<String> createGetSingleExchangeRateUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, GetSingleExchangeRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = GetSingleExchangeRate.class)
    public JAXBElement<String> createGetSingleExchangeRatePass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, GetSingleExchangeRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "payer", scope = GetSingleExchangeRate.class)
    public JAXBElement<String> createGetSingleExchangeRatePayer(String value) {
        return new JAXBElement<String>(_GetSingleExchangeRatePayer_QNAME, String.class, GetSingleExchangeRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "mts", scope = GetSingleExchangeRate.class)
    public JAXBElement<String> createGetSingleExchangeRateMts(String value) {
        return new JAXBElement<String>(_GetSingleExchangeRateMts_QNAME, String.class, GetSingleExchangeRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "service", scope = GetSingleExchangeRate.class)
    public JAXBElement<String> createGetSingleExchangeRateService(String value) {
        return new JAXBElement<String>(_GetSingleExchangeRateService_QNAME, String.class, GetSingleExchangeRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "currency", scope = GetSingleExchangeRate.class)
    public JAXBElement<String> createGetSingleExchangeRateCurrency(String value) {
        return new JAXBElement<String>(_GetSingleExchangeRateCurrency_QNAME, String.class, GetSingleExchangeRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsExRate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsExRate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSingleExchangeRateResult", scope = GetSingleExchangeRateResponse.class)
    public JAXBElement<WsExRate> createGetSingleExchangeRateResponseGetSingleExchangeRateResult(WsExRate value) {
        return new JAXBElement<WsExRate>(_GetSingleExchangeRateResponseGetSingleExchangeRateResult_QNAME, WsExRate.class, GetSingleExchangeRateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = GetExchangeRates.class)
    public JAXBElement<String> createGetExchangeRatesAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, GetExchangeRates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetExchangeRates.class)
    public JAXBElement<String> createGetExchangeRatesUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, GetExchangeRates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = GetExchangeRates.class)
    public JAXBElement<String> createGetExchangeRatesPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, GetExchangeRates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "currency", scope = GetExchangeRates.class)
    public JAXBElement<String> createGetExchangeRatesCurrency(String value) {
        return new JAXBElement<String>(_GetSingleExchangeRateCurrency_QNAME, String.class, GetExchangeRates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsExRateList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsExRateList }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetExchangeRatesResult", scope = GetExchangeRatesResponse.class)
    public JAXBElement<ArrayOfwsExRateList> createGetExchangeRatesResponseGetExchangeRatesResult(ArrayOfwsExRateList value) {
        return new JAXBElement<ArrayOfwsExRateList>(_GetExchangeRatesResponseGetExchangeRatesResult_QNAME, ArrayOfwsExRateList.class, GetExchangeRatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = OfacVerification.class)
    public JAXBElement<String> createOfacVerificationAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, OfacVerification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = OfacVerification.class)
    public JAXBElement<String> createOfacVerificationUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, OfacVerification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = OfacVerification.class)
    public JAXBElement<String> createOfacVerificationPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, OfacVerification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lastName", scope = OfacVerification.class)
    public JAXBElement<String> createOfacVerificationLastName(String value) {
        return new JAXBElement<String>(_OfacVerificationLastName_QNAME, String.class, OfacVerification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "firstName", scope = OfacVerification.class)
    public JAXBElement<String> createOfacVerificationFirstName(String value) {
        return new JAXBElement<String>(_OfacVerificationFirstName_QNAME, String.class, OfacVerification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsOfac }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsOfac }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OfacVerificationResult", scope = OfacVerificationResponse.class)
    public JAXBElement<WsOfac> createOfacVerificationResponseOfacVerificationResult(WsOfac value) {
        return new JAXBElement<WsOfac>(_OfacVerificationResponseOfacVerificationResult_QNAME, WsOfac.class, OfacVerificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = ComplianceCheck.class)
    public JAXBElement<String> createComplianceCheckAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, ComplianceCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = ComplianceCheck.class)
    public JAXBElement<String> createComplianceCheckUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, ComplianceCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = ComplianceCheck.class)
    public JAXBElement<String> createComplianceCheckPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, ComplianceCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSender }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsSender }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sender", scope = ComplianceCheck.class)
    public JAXBElement<WsSender> createComplianceCheckSender(WsSender value) {
        return new JAXBElement<WsSender>(_InsertTransactionSender_QNAME, WsSender.class, ComplianceCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsReceiver }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsReceiver }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "receiver", scope = ComplianceCheck.class)
    public JAXBElement<WsReceiver> createComplianceCheckReceiver(WsReceiver value) {
        return new JAXBElement<WsReceiver>(_InsertTransactionReceiver_QNAME, WsReceiver.class, ComplianceCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsTransferInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsTransferInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "transfer", scope = ComplianceCheck.class)
    public JAXBElement<WsTransferInfo> createComplianceCheckTransfer(WsTransferInfo value) {
        return new JAXBElement<WsTransferInfo>(_InsertTransactionTransfer_QNAME, WsTransferInfo.class, ComplianceCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ComplianceCheckResult", scope = ComplianceCheckResponse.class)
    public JAXBElement<WsResponse> createComplianceCheckResponseComplianceCheckResult(WsResponse value) {
        return new JAXBElement<WsResponse>(_ComplianceCheckResponseComplianceCheckResult_QNAME, WsResponse.class, ComplianceCheckResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = SetVerified.class)
    public JAXBElement<String> createSetVerifiedAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, SetVerified.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = SetVerified.class)
    public JAXBElement<String> createSetVerifiedUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, SetVerified.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = SetVerified.class)
    public JAXBElement<String> createSetVerifiedPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, SetVerified.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "receipt", scope = SetVerified.class)
    public JAXBElement<String> createSetVerifiedReceipt(String value) {
        return new JAXBElement<String>(_ConfirmPaymentReceipt_QNAME, String.class, SetVerified.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "score", scope = SetVerified.class)
    public JAXBElement<String> createSetVerifiedScore(String value) {
        return new JAXBElement<String>(_SetVerifiedScore_QNAME, String.class, SetVerified.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "comment", scope = SetVerified.class)
    public JAXBElement<String> createSetVerifiedComment(String value) {
        return new JAXBElement<String>(_RequestCancellationComment_QNAME, String.class, SetVerified.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SetVerifiedResult", scope = SetVerifiedResponse.class)
    public JAXBElement<WsResult> createSetVerifiedResponseSetVerifiedResult(WsResult value) {
        return new JAXBElement<WsResult>(_SetVerifiedResponseSetVerifiedResult_QNAME, WsResult.class, SetVerifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = BillConsult.class)
    public JAXBElement<String> createBillConsultAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, BillConsult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = BillConsult.class)
    public JAXBElement<String> createBillConsultUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, BillConsult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = BillConsult.class)
    public JAXBElement<String> createBillConsultPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, BillConsult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "billerId", scope = BillConsult.class)
    public JAXBElement<String> createBillConsultBillerId(String value) {
        return new JAXBElement<String>(_BillConsultBillerId_QNAME, String.class, BillConsult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "account", scope = BillConsult.class)
    public JAXBElement<String> createBillConsultAccount(String value) {
        return new JAXBElement<String>(_BillConsultAccount_QNAME, String.class, BillConsult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "firstname", scope = BillConsult.class)
    public JAXBElement<String> createBillConsultFirstname(String value) {
        return new JAXBElement<String>(_BillConsultFirstname_QNAME, String.class, BillConsult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lastname", scope = BillConsult.class)
    public JAXBElement<String> createBillConsultLastname(String value) {
        return new JAXBElement<String>(_BillConsultLastname_QNAME, String.class, BillConsult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsBillInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsBillInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BillConsultResult", scope = BillConsultResponse.class)
    public JAXBElement<WsBillInfo> createBillConsultResponseBillConsultResult(WsBillInfo value) {
        return new JAXBElement<WsBillInfo>(_BillConsultResponseBillConsultResult_QNAME, WsBillInfo.class, BillConsultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = PayersConsult.class)
    public JAXBElement<String> createPayersConsultAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, PayersConsult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = PayersConsult.class)
    public JAXBElement<String> createPayersConsultUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, PayersConsult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = PayersConsult.class)
    public JAXBElement<String> createPayersConsultPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, PayersConsult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "countryCode", scope = PayersConsult.class)
    public JAXBElement<String> createPayersConsultCountryCode(String value) {
        return new JAXBElement<String>(_PayersConsultCountryCode_QNAME, String.class, PayersConsult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "payerCode", scope = PayersConsult.class)
    public JAXBElement<String> createPayersConsultPayerCode(String value) {
        return new JAXBElement<String>(_PayersConsultPayerCode_QNAME, String.class, PayersConsult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayersByCountryCodeResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayersByCountryCodeResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PayersConsultResult", scope = PayersConsultResponse.class)
    public JAXBElement<ArrayOfwsSelectPayersByCountryCodeResult> createPayersConsultResponsePayersConsultResult(ArrayOfwsSelectPayersByCountryCodeResult value) {
        return new JAXBElement<ArrayOfwsSelectPayersByCountryCodeResult>(_PayersConsultResponsePayersConsultResult_QNAME, ArrayOfwsSelectPayersByCountryCodeResult.class, PayersConsultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = GetReceiptData.class)
    public JAXBElement<String> createGetReceiptDataAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, GetReceiptData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetReceiptData.class)
    public JAXBElement<String> createGetReceiptDataUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, GetReceiptData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = GetReceiptData.class)
    public JAXBElement<String> createGetReceiptDataPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, GetReceiptData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rem_edo", scope = GetReceiptData.class)
    public JAXBElement<String> createGetReceiptDataRemEdo(String value) {
        return new JAXBElement<String>(_GetReceiptDataRemEdo_QNAME, String.class, GetReceiptData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pais", scope = GetReceiptData.class)
    public JAXBElement<String> createGetReceiptDataPais(String value) {
        return new JAXBElement<String>(_GetReceiptDataPais_QNAME, String.class, GetReceiptData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptTemplate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReceiptTemplate }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetReceiptDataResult", scope = GetReceiptDataResponse.class)
    public JAXBElement<ReceiptTemplate> createGetReceiptDataResponseGetReceiptDataResult(ReceiptTemplate value) {
        return new JAXBElement<ReceiptTemplate>(_GetReceiptDataResponseGetReceiptDataResult_QNAME, ReceiptTemplate.class, GetReceiptDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = GetCityByZip.class)
    public JAXBElement<String> createGetCityByZipAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, GetCityByZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = GetCityByZip.class)
    public JAXBElement<String> createGetCityByZipUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, GetCityByZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = GetCityByZip.class)
    public JAXBElement<String> createGetCityByZipPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, GetCityByZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "zip", scope = GetCityByZip.class)
    public JAXBElement<String> createGetCityByZipZip(String value) {
        return new JAXBElement<String>(_GetCityByZipZip_QNAME, String.class, GetCityByZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityByZip }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CityByZip }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCityByZipResult", scope = GetCityByZipResponse.class)
    public JAXBElement<CityByZip> createGetCityByZipResponseGetCityByZipResult(CityByZip value) {
        return new JAXBElement<CityByZip>(_GetCityByZipResponseGetCityByZipResult_QNAME, CityByZip.class, GetCityByZipResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "alias", scope = CheckPayerLimits.class)
    public JAXBElement<String> createCheckPayerLimitsAlias(String value) {
        return new JAXBElement<String>(_InsertTransactionAlias_QNAME, String.class, CheckPayerLimits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = CheckPayerLimits.class)
    public JAXBElement<String> createCheckPayerLimitsUser(String value) {
        return new JAXBElement<String>(_InsertTransactionUser_QNAME, String.class, CheckPayerLimits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pass", scope = CheckPayerLimits.class)
    public JAXBElement<String> createCheckPayerLimitsPass(String value) {
        return new JAXBElement<String>(_InsertTransactionPass_QNAME, String.class, CheckPayerLimits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "payercode", scope = CheckPayerLimits.class)
    public JAXBElement<String> createCheckPayerLimitsPayercode(String value) {
        return new JAXBElement<String>(_CheckPayerLimitsPayercode_QNAME, String.class, CheckPayerLimits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "servicecode", scope = CheckPayerLimits.class)
    public JAXBElement<String> createCheckPayerLimitsServicecode(String value) {
        return new JAXBElement<String>(_CheckPayerLimitsServicecode_QNAME, String.class, CheckPayerLimits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ben", scope = CheckPayerLimits.class)
    public JAXBElement<String> createCheckPayerLimitsBen(String value) {
        return new JAXBElement<String>(_CheckPayerLimitsBen_QNAME, String.class, CheckPayerLimits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "rem", scope = CheckPayerLimits.class)
    public JAXBElement<String> createCheckPayerLimitsRem(String value) {
        return new JAXBElement<String>(_CheckPayerLimitsRem_QNAME, String.class, CheckPayerLimits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsLimitByPayerResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsLimitByPayerResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CheckPayerLimitsResult", scope = CheckPayerLimitsResponse.class)
    public JAXBElement<WsLimitByPayerResult> createCheckPayerLimitsResponseCheckPayerLimitsResult(WsLimitByPayerResult value) {
        return new JAXBElement<WsLimitByPayerResult>(_CheckPayerLimitsResponseCheckPayerLimitsResult_QNAME, WsLimitByPayerResult.class, CheckPayerLimitsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Code_promo", scope = PromotionsCode.class)
    public JAXBElement<String> createPromotionsCodeCodePromo(String value) {
        return new JAXBElement<String>(_PromotionsCodeCodePromo_QNAME, String.class, PromotionsCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSelectPromoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WsSelectPromoResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PromotionsCodeResult", scope = PromotionsCodeResponse.class)
    public JAXBElement<WsSelectPromoResult> createPromotionsCodeResponsePromotionsCodeResult(WsSelectPromoResult value) {
        return new JAXBElement<WsSelectPromoResult>(_PromotionsCodeResponsePromotionsCodeResult_QNAME, WsSelectPromoResult.class, PromotionsCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ServiceCode", scope = WsSelectPayerServicesResult.class)
    public JAXBElement<String> createWsSelectPayerServicesResultServiceCode(String value) {
        return new JAXBElement<String>(_WsSelectPayerServicesResultServiceCode_QNAME, String.class, WsSelectPayerServicesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ServiceName", scope = WsSelectPayerServicesResult.class)
    public JAXBElement<String> createWsSelectPayerServicesResultServiceName(String value) {
        return new JAXBElement<String>(_WsSelectPayerServicesResultServiceName_QNAME, String.class, WsSelectPayerServicesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "City", scope = WsSelectPayerOfficesResult.class)
    public JAXBElement<String> createWsSelectPayerOfficesResultCity(String value) {
        return new JAXBElement<String>(_WsSelectPayerOfficesResultCity_QNAME, String.class, WsSelectPayerOfficesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CountryCode", scope = WsSelectPayerOfficesResult.class)
    public JAXBElement<String> createWsSelectPayerOfficesResultCountryCode(String value) {
        return new JAXBElement<String>(_WsSelectPayerOfficesResultCountryCode_QNAME, String.class, WsSelectPayerOfficesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfficeCode", scope = WsSelectPayerOfficesResult.class)
    public JAXBElement<String> createWsSelectPayerOfficesResultOfficeCode(String value) {
        return new JAXBElement<String>(_WsSelectPayerOfficesResultOfficeCode_QNAME, String.class, WsSelectPayerOfficesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfficeGroupName", scope = WsSelectPayerOfficesResult.class)
    public JAXBElement<String> createWsSelectPayerOfficesResultOfficeGroupName(String value) {
        return new JAXBElement<String>(_WsSelectPayerOfficesResultOfficeGroupName_QNAME, String.class, WsSelectPayerOfficesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "State", scope = WsSelectPayerOfficesResult.class)
    public JAXBElement<String> createWsSelectPayerOfficesResultState(String value) {
        return new JAXBElement<String>(_WsSelectPayerOfficesResultState_QNAME, String.class, WsSelectPayerOfficesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CurrencyCode", scope = WsSelectPayerLimitsResult.class)
    public JAXBElement<String> createWsSelectPayerLimitsResultCurrencyCode(String value) {
        return new JAXBElement<String>(_WsSelectPayerLimitsResultCurrencyCode_QNAME, String.class, WsSelectPayerLimitsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfficeGroupName", scope = WsSelectPayerLimitsResult.class)
    public JAXBElement<String> createWsSelectPayerLimitsResultOfficeGroupName(String value) {
        return new JAXBElement<String>(_WsSelectPayerOfficesResultOfficeGroupName_QNAME, String.class, WsSelectPayerLimitsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ServiceCode", scope = WsSelectPayerLimitsResult.class)
    public JAXBElement<String> createWsSelectPayerLimitsResultServiceCode(String value) {
        return new JAXBElement<String>(_WsSelectPayerServicesResultServiceCode_QNAME, String.class, WsSelectPayerLimitsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Type", scope = WsSelectPayerLimitsResult.class)
    public JAXBElement<String> createWsSelectPayerLimitsResultType(String value) {
        return new JAXBElement<String>(_WsSelectPayerLimitsResultType_QNAME, String.class, WsSelectPayerLimitsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CurrencyCode", scope = WsSelectPayerCurrenciesResult.class)
    public JAXBElement<String> createWsSelectPayerCurrenciesResultCurrencyCode(String value) {
        return new JAXBElement<String>(_WsSelectPayerLimitsResultCurrencyCode_QNAME, String.class, WsSelectPayerCurrenciesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CurrencyName", scope = WsSelectPayerCurrenciesResult.class)
    public JAXBElement<String> createWsSelectPayerCurrenciesResultCurrencyName(String value) {
        return new JAXBElement<String>(_WsSelectPayerCurrenciesResultCurrencyName_QNAME, String.class, WsSelectPayerCurrenciesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BankCode", scope = WsSelectPayerBanksResult.class)
    public JAXBElement<String> createWsSelectPayerBanksResultBankCode(String value) {
        return new JAXBElement<String>(_WsSelectPayerBanksResultBankCode_QNAME, String.class, WsSelectPayerBanksResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BankName", scope = WsSelectPayerBanksResult.class)
    public JAXBElement<String> createWsSelectPayerBanksResultBankName(String value) {
        return new JAXBElement<String>(_WsSelectPayerBanksResultBankName_QNAME, String.class, WsSelectPayerBanksResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "AccountTypeCode", scope = WsSelectPayerAccountTypesResult.class)
    public JAXBElement<String> createWsSelectPayerAccountTypesResultAccountTypeCode(String value) {
        return new JAXBElement<String>(_WsSelectPayerAccountTypesResultAccountTypeCode_QNAME, String.class, WsSelectPayerAccountTypesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "AccountTypeName", scope = WsSelectPayerAccountTypesResult.class)
    public JAXBElement<String> createWsSelectPayerAccountTypesResultAccountTypeName(String value) {
        return new JAXBElement<String>(_WsSelectPayerAccountTypesResultAccountTypeName_QNAME, String.class, WsSelectPayerAccountTypesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerAccountTypesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerAccountTypesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PayerAccountTypes", scope = WsSelectPayersByCountryCodeResult.class)
    public JAXBElement<ArrayOfwsSelectPayerAccountTypesResult> createWsSelectPayersByCountryCodeResultPayerAccountTypes(ArrayOfwsSelectPayerAccountTypesResult value) {
        return new JAXBElement<ArrayOfwsSelectPayerAccountTypesResult>(_WsSelectPayersByCountryCodeResultPayerAccountTypes_QNAME, ArrayOfwsSelectPayerAccountTypesResult.class, WsSelectPayersByCountryCodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerBanksResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerBanksResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PayerBanks", scope = WsSelectPayersByCountryCodeResult.class)
    public JAXBElement<ArrayOfwsSelectPayerBanksResult> createWsSelectPayersByCountryCodeResultPayerBanks(ArrayOfwsSelectPayerBanksResult value) {
        return new JAXBElement<ArrayOfwsSelectPayerBanksResult>(_WsSelectPayersByCountryCodeResultPayerBanks_QNAME, ArrayOfwsSelectPayerBanksResult.class, WsSelectPayersByCountryCodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PayerCode", scope = WsSelectPayersByCountryCodeResult.class)
    public JAXBElement<String> createWsSelectPayersByCountryCodeResultPayerCode(String value) {
        return new JAXBElement<String>(_WsSelectPayersByCountryCodeResultPayerCode_QNAME, String.class, WsSelectPayersByCountryCodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PayerCountryName", scope = WsSelectPayersByCountryCodeResult.class)
    public JAXBElement<String> createWsSelectPayersByCountryCodeResultPayerCountryName(String value) {
        return new JAXBElement<String>(_WsSelectPayersByCountryCodeResultPayerCountryName_QNAME, String.class, WsSelectPayersByCountryCodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerCurrenciesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerCurrenciesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PayerCurrencies", scope = WsSelectPayersByCountryCodeResult.class)
    public JAXBElement<ArrayOfwsSelectPayerCurrenciesResult> createWsSelectPayersByCountryCodeResultPayerCurrencies(ArrayOfwsSelectPayerCurrenciesResult value) {
        return new JAXBElement<ArrayOfwsSelectPayerCurrenciesResult>(_WsSelectPayersByCountryCodeResultPayerCurrencies_QNAME, ArrayOfwsSelectPayerCurrenciesResult.class, WsSelectPayersByCountryCodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerLimitsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerLimitsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PayerLimits", scope = WsSelectPayersByCountryCodeResult.class)
    public JAXBElement<ArrayOfwsSelectPayerLimitsResult> createWsSelectPayersByCountryCodeResultPayerLimits(ArrayOfwsSelectPayerLimitsResult value) {
        return new JAXBElement<ArrayOfwsSelectPayerLimitsResult>(_WsSelectPayersByCountryCodeResultPayerLimits_QNAME, ArrayOfwsSelectPayerLimitsResult.class, WsSelectPayersByCountryCodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PayerName", scope = WsSelectPayersByCountryCodeResult.class)
    public JAXBElement<String> createWsSelectPayersByCountryCodeResultPayerName(String value) {
        return new JAXBElement<String>(_WsSelectPayersByCountryCodeResultPayerName_QNAME, String.class, WsSelectPayersByCountryCodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerOfficesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerOfficesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PayerOffices", scope = WsSelectPayersByCountryCodeResult.class)
    public JAXBElement<ArrayOfwsSelectPayerOfficesResult> createWsSelectPayersByCountryCodeResultPayerOffices(ArrayOfwsSelectPayerOfficesResult value) {
        return new JAXBElement<ArrayOfwsSelectPayerOfficesResult>(_WsSelectPayersByCountryCodeResultPayerOffices_QNAME, ArrayOfwsSelectPayerOfficesResult.class, WsSelectPayersByCountryCodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerServicesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfwsSelectPayerServicesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PayerServices", scope = WsSelectPayersByCountryCodeResult.class)
    public JAXBElement<ArrayOfwsSelectPayerServicesResult> createWsSelectPayersByCountryCodeResultPayerServices(ArrayOfwsSelectPayerServicesResult value) {
        return new JAXBElement<ArrayOfwsSelectPayerServicesResult>(_WsSelectPayersByCountryCodeResultPayerServices_QNAME, ArrayOfwsSelectPayerServicesResult.class, WsSelectPayersByCountryCodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PayerType", scope = WsSelectPayersByCountryCodeResult.class)
    public JAXBElement<String> createWsSelectPayersByCountryCodeResultPayerType(String value) {
        return new JAXBElement<String>(_WsSelectPayersByCountryCodeResultPayerType_QNAME, String.class, WsSelectPayersByCountryCodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ExRate", scope = WsExRateList.class)
    public JAXBElement<Double> createWsExRateListExRate(Double value) {
        return new JAXBElement<Double>(_WsExRateListExRate_QNAME, Double.class, WsExRateList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "code", scope = WsExRateList.class)
    public JAXBElement<String> createWsExRateListCode(String value) {
        return new JAXBElement<String>(_WsExRateListCode_QNAME, String.class, WsExRateList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "country", scope = WsExRateList.class)
    public JAXBElement<String> createWsExRateListCountry(String value) {
        return new JAXBElement<String>(_WsExRateListCountry_QNAME, String.class, WsExRateList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "currency", scope = WsExRateList.class)
    public JAXBElement<String> createWsExRateListCurrency(String value) {
        return new JAXBElement<String>(_WsExRateListCurrency_QNAME, String.class, WsExRateList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "payer", scope = WsExRateList.class)
    public JAXBElement<String> createWsExRateListPayer(String value) {
        return new JAXBElement<String>(_WsExRateListPayer_QNAME, String.class, WsExRateList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Password", scope = WsNotifications.class)
    public JAXBElement<String> createWsNotificationsPassword(String value) {
        return new JAXBElement<String>(_WsNotificationsPassword_QNAME, String.class, WsNotifications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt", scope = WsNotifications.class)
    public JAXBElement<String> createWsNotificationsReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsReceipt_QNAME, String.class, WsNotifications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Status", scope = WsNotifications.class)
    public JAXBElement<String> createWsNotificationsStatus(String value) {
        return new JAXBElement<String>(_WsNotificationsStatus_QNAME, String.class, WsNotifications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "StatusDate", scope = WsNotifications.class)
    public JAXBElement<XMLGregorianCalendar> createWsNotificationsStatusDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsNotificationsStatusDate_QNAME, XMLGregorianCalendar.class, WsNotifications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ThirdPartyReceipt", scope = WsNotifications.class)
    public JAXBElement<String> createWsNotificationsThirdPartyReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsThirdPartyReceipt_QNAME, String.class, WsNotifications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "WireDate", scope = WsNotifications.class)
    public JAXBElement<XMLGregorianCalendar> createWsNotificationsWireDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsNotificationsWireDate_QNAME, XMLGregorianCalendar.class, WsNotifications.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ClearedDate", scope = WsCollectedAch.class)
    public JAXBElement<XMLGregorianCalendar> createWsCollectedAchClearedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsCollectedAchClearedDate_QNAME, XMLGregorianCalendar.class, WsCollectedAch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Password", scope = WsCollectedAch.class)
    public JAXBElement<String> createWsCollectedAchPassword(String value) {
        return new JAXBElement<String>(_WsNotificationsPassword_QNAME, String.class, WsCollectedAch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt", scope = WsCollectedAch.class)
    public JAXBElement<String> createWsCollectedAchReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsReceipt_QNAME, String.class, WsCollectedAch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ThirdPartyReceipt", scope = WsCollectedAch.class)
    public JAXBElement<String> createWsCollectedAchThirdPartyReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsThirdPartyReceipt_QNAME, String.class, WsCollectedAch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "HoldDate", scope = WsReleasedTransactions.class)
    public JAXBElement<XMLGregorianCalendar> createWsReleasedTransactionsHoldDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsReleasedTransactionsHoldDate_QNAME, XMLGregorianCalendar.class, WsReleasedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Password", scope = WsReleasedTransactions.class)
    public JAXBElement<String> createWsReleasedTransactionsPassword(String value) {
        return new JAXBElement<String>(_WsNotificationsPassword_QNAME, String.class, WsReleasedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt", scope = WsReleasedTransactions.class)
    public JAXBElement<String> createWsReleasedTransactionsReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsReceipt_QNAME, String.class, WsReleasedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ThirdPartyReceipt", scope = WsReleasedTransactions.class)
    public JAXBElement<String> createWsReleasedTransactionsThirdPartyReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsThirdPartyReceipt_QNAME, String.class, WsReleasedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ModifyDate", scope = WsModifiedTransactions.class)
    public JAXBElement<XMLGregorianCalendar> createWsModifiedTransactionsModifyDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsModifiedTransactionsModifyDate_QNAME, XMLGregorianCalendar.class, WsModifiedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Password", scope = WsModifiedTransactions.class)
    public JAXBElement<String> createWsModifiedTransactionsPassword(String value) {
        return new JAXBElement<String>(_WsNotificationsPassword_QNAME, String.class, WsModifiedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt", scope = WsModifiedTransactions.class)
    public JAXBElement<String> createWsModifiedTransactionsReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsReceipt_QNAME, String.class, WsModifiedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ThirdPartyReceipt", scope = WsModifiedTransactions.class)
    public JAXBElement<String> createWsModifiedTransactionsThirdPartyReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsThirdPartyReceipt_QNAME, String.class, WsModifiedTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CancelDate", scope = WsVoidTransactions.class)
    public JAXBElement<XMLGregorianCalendar> createWsVoidTransactionsCancelDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsVoidTransactionsCancelDate_QNAME, XMLGregorianCalendar.class, WsVoidTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Password", scope = WsVoidTransactions.class)
    public JAXBElement<String> createWsVoidTransactionsPassword(String value) {
        return new JAXBElement<String>(_WsNotificationsPassword_QNAME, String.class, WsVoidTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt", scope = WsVoidTransactions.class)
    public JAXBElement<String> createWsVoidTransactionsReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsReceipt_QNAME, String.class, WsVoidTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ThirdPartyReceipt", scope = WsVoidTransactions.class)
    public JAXBElement<String> createWsVoidTransactionsThirdPartyReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsThirdPartyReceipt_QNAME, String.class, WsVoidTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Password", scope = WsPaidTransactions.class)
    public JAXBElement<String> createWsPaidTransactionsPassword(String value) {
        return new JAXBElement<String>(_WsNotificationsPassword_QNAME, String.class, WsPaidTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PaymentDate", scope = WsPaidTransactions.class)
    public JAXBElement<XMLGregorianCalendar> createWsPaidTransactionsPaymentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsPaidTransactionsPaymentDate_QNAME, XMLGregorianCalendar.class, WsPaidTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt", scope = WsPaidTransactions.class)
    public JAXBElement<String> createWsPaidTransactionsReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsReceipt_QNAME, String.class, WsPaidTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ThirdPartyReceipt", scope = WsPaidTransactions.class)
    public JAXBElement<String> createWsPaidTransactionsThirdPartyReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsThirdPartyReceipt_QNAME, String.class, WsPaidTransactions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "MSG", scope = WsSelectPromoResult.class)
    public JAXBElement<String> createWsSelectPromoResultMSG(String value) {
        return new JAXBElement<String>(_WsSelectPromoResultMSG_QNAME, String.class, WsSelectPromoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PRO_CANT", scope = WsSelectPromoResult.class)
    public JAXBElement<Double> createWsSelectPromoResultPROCANT(Double value) {
        return new JAXBElement<Double>(_WsSelectPromoResultPROCANT_QNAME, Double.class, WsSelectPromoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PRO_CODE", scope = WsSelectPromoResult.class)
    public JAXBElement<String> createWsSelectPromoResultPROCODE(String value) {
        return new JAXBElement<String>(_WsSelectPromoResultPROCODE_QNAME, String.class, WsSelectPromoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PRO_DESC", scope = WsSelectPromoResult.class)
    public JAXBElement<Double> createWsSelectPromoResultPRODESC(Double value) {
        return new JAXBElement<Double>(_WsSelectPromoResultPRODESC_QNAME, Double.class, WsSelectPromoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PRO_FEE", scope = WsSelectPromoResult.class)
    public JAXBElement<Double> createWsSelectPromoResultPROFEE(Double value) {
        return new JAXBElement<Double>(_WsSelectPromoResultPROFEE_QNAME, Double.class, WsSelectPromoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Amount", scope = WsLimitByPayerResult.class)
    public JAXBElement<BigDecimal> createWsLimitByPayerResultAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WsLimitByPayerResultAmount_QNAME, BigDecimal.class, WsLimitByPayerResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ContinueSaving", scope = WsLimitByPayerResult.class)
    public JAXBElement<Boolean> createWsLimitByPayerResultContinueSaving(Boolean value) {
        return new JAXBElement<Boolean>(_WsLimitByPayerResultContinueSaving_QNAME, Boolean.class, WsLimitByPayerResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Limit", scope = WsLimitByPayerResult.class)
    public JAXBElement<BigDecimal> createWsLimitByPayerResultLimit(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WsLimitByPayerResultLimit_QNAME, BigDecimal.class, WsLimitByPayerResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Message", scope = WsLimitByPayerResult.class)
    public JAXBElement<String> createWsLimitByPayerResultMessage(String value) {
        return new JAXBElement<String>(_WsLimitByPayerResultMessage_QNAME, String.class, WsLimitByPayerResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CioCountryCode", scope = CityByZip.class)
    public JAXBElement<String> createCityByZipCioCountryCode(String value) {
        return new JAXBElement<String>(_CityByZipCioCountryCode_QNAME, String.class, CityByZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CioName", scope = CityByZip.class)
    public JAXBElement<String> createCityByZipCioName(String value) {
        return new JAXBElement<String>(_CityByZipCioName_QNAME, String.class, CityByZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CioState", scope = CityByZip.class)
    public JAXBElement<String> createCityByZipCioState(String value) {
        return new JAXBElement<String>(_CityByZipCioState_QNAME, String.class, CityByZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CioStateCode", scope = CityByZip.class)
    public JAXBElement<String> createCityByZipCioStateCode(String value) {
        return new JAXBElement<String>(_CityByZipCioStateCode_QNAME, String.class, CityByZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "rec_contact", scope = ReceiptTemplate.class)
    public JAXBElement<String> createReceiptTemplateRecContact(String value) {
        return new JAXBElement<String>(_ReceiptTemplateRecContact_QNAME, String.class, ReceiptTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "rec_contact_en", scope = ReceiptTemplate.class)
    public JAXBElement<String> createReceiptTemplateRecContactEn(String value) {
        return new JAXBElement<String>(_ReceiptTemplateRecContactEn_QNAME, String.class, ReceiptTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "rec_error", scope = ReceiptTemplate.class)
    public JAXBElement<String> createReceiptTemplateRecError(String value) {
        return new JAXBElement<String>(_ReceiptTemplateRecError_QNAME, String.class, ReceiptTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "rec_error_en", scope = ReceiptTemplate.class)
    public JAXBElement<String> createReceiptTemplateRecErrorEn(String value) {
        return new JAXBElement<String>(_ReceiptTemplateRecErrorEn_QNAME, String.class, ReceiptTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "rec_license", scope = ReceiptTemplate.class)
    public JAXBElement<String> createReceiptTemplateRecLicense(String value) {
        return new JAXBElement<String>(_ReceiptTemplateRecLicense_QNAME, String.class, ReceiptTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "rec_pdf", scope = ReceiptTemplate.class)
    public JAXBElement<String> createReceiptTemplateRecPdf(String value) {
        return new JAXBElement<String>(_ReceiptTemplateRecPdf_QNAME, String.class, ReceiptTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "rec_rtr", scope = ReceiptTemplate.class)
    public JAXBElement<String> createReceiptTemplateRecRtr(String value) {
        return new JAXBElement<String>(_ReceiptTemplateRecRtr_QNAME, String.class, ReceiptTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "rec_rtr_en", scope = ReceiptTemplate.class)
    public JAXBElement<String> createReceiptTemplateRecRtrEn(String value) {
        return new JAXBElement<String>(_ReceiptTemplateRecRtrEn_QNAME, String.class, ReceiptTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BillAccount", scope = WsBillInfo.class)
    public JAXBElement<String> createWsBillInfoBillAccount(String value) {
        return new JAXBElement<String>(_WsBillInfoBillAccount_QNAME, String.class, WsBillInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BillErrorCode", scope = WsBillInfo.class)
    public JAXBElement<String> createWsBillInfoBillErrorCode(String value) {
        return new JAXBElement<String>(_WsBillInfoBillErrorCode_QNAME, String.class, WsBillInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BillInvoice", scope = WsBillInfo.class)
    public JAXBElement<String> createWsBillInfoBillInvoice(String value) {
        return new JAXBElement<String>(_WsBillInfoBillInvoice_QNAME, String.class, WsBillInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BillInvoiceDate", scope = WsBillInfo.class)
    public JAXBElement<String> createWsBillInfoBillInvoiceDate(String value) {
        return new JAXBElement<String>(_WsBillInfoBillInvoiceDate_QNAME, String.class, WsBillInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BillLocalCurrency", scope = WsBillInfo.class)
    public JAXBElement<String> createWsBillInfoBillLocalCurrency(String value) {
        return new JAXBElement<String>(_WsBillInfoBillLocalCurrency_QNAME, String.class, WsBillInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BillMessage", scope = WsBillInfo.class)
    public JAXBElement<String> createWsBillInfoBillMessage(String value) {
        return new JAXBElement<String>(_WsBillInfoBillMessage_QNAME, String.class, WsBillInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BillName", scope = WsBillInfo.class)
    public JAXBElement<String> createWsBillInfoBillName(String value) {
        return new JAXBElement<String>(_WsBillInfoBillName_QNAME, String.class, WsBillInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Message", scope = WsResult.class)
    public JAXBElement<String> createWsResultMessage(String value) {
        return new JAXBElement<String>(_WsLimitByPayerResultMessage_QNAME, String.class, WsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Message", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacMessage(String value) {
        return new JAXBElement<String>(_WsLimitByPayerResultMessage_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacAddress", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacAddress(String value) {
        return new JAXBElement<String>(_WsOfacOfacAddress_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacAka", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacAka(String value) {
        return new JAXBElement<String>(_WsOfacOfacAka_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacCitizenship", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacCitizenship(String value) {
        return new JAXBElement<String>(_WsOfacOfacCitizenship_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacComment", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacComment(String value) {
        return new JAXBElement<String>(_WsOfacOfacComment_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacDob", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacDob(String value) {
        return new JAXBElement<String>(_WsOfacOfacDob_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacFirst", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacFirst(String value) {
        return new JAXBElement<String>(_WsOfacOfacFirst_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacIds", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacIds(String value) {
        return new JAXBElement<String>(_WsOfacOfacIds_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacLast", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacLast(String value) {
        return new JAXBElement<String>(_WsOfacOfacLast_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacName", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacName(String value) {
        return new JAXBElement<String>(_WsOfacOfacName_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacNationality", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacNationality(String value) {
        return new JAXBElement<String>(_WsOfacOfacNationality_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacPob", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacPob(String value) {
        return new JAXBElement<String>(_WsOfacOfacPob_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacProgram", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacProgram(String value) {
        return new JAXBElement<String>(_WsOfacOfacProgram_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacRemark", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacRemark(String value) {
        return new JAXBElement<String>(_WsOfacOfacRemark_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacSource", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacSource(String value) {
        return new JAXBElement<String>(_WsOfacOfacSource_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacTitle", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacTitle(String value) {
        return new JAXBElement<String>(_WsOfacOfacTitle_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfacType", scope = WsOfac.class)
    public JAXBElement<String> createWsOfacOfacType(String value) {
        return new JAXBElement<String>(_WsOfacOfacType_QNAME, String.class, WsOfac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ExRate", scope = WsExRate.class)
    public JAXBElement<BigDecimal> createWsExRateExRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WsExRateListExRate_QNAME, BigDecimal.class, WsExRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "LastComment", scope = WsStatus.class)
    public JAXBElement<String> createWsStatusLastComment(String value) {
        return new JAXBElement<String>(_WsStatusLastComment_QNAME, String.class, WsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Password", scope = WsStatus.class)
    public JAXBElement<String> createWsStatusPassword(String value) {
        return new JAXBElement<String>(_WsNotificationsPassword_QNAME, String.class, WsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PayMethod", scope = WsStatus.class)
    public JAXBElement<String> createWsStatusPayMethod(String value) {
        return new JAXBElement<String>(_WsStatusPayMethod_QNAME, String.class, WsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt", scope = WsStatus.class)
    public JAXBElement<String> createWsStatusReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsReceipt_QNAME, String.class, WsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Status", scope = WsStatus.class)
    public JAXBElement<String> createWsStatusStatus(String value) {
        return new JAXBElement<String>(_WsNotificationsStatus_QNAME, String.class, WsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ThirdPartyReceipt", scope = WsStatus.class)
    public JAXBElement<String> createWsStatusThirdPartyReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsThirdPartyReceipt_QNAME, String.class, WsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Amount", scope = WsAchStatus.class)
    public JAXBElement<BigDecimal> createWsAchStatusAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WsLimitByPayerResultAmount_QNAME, BigDecimal.class, WsAchStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Name", scope = WsAchStatus.class)
    public JAXBElement<String> createWsAchStatusName(String value) {
        return new JAXBElement<String>(_WsAchStatusName_QNAME, String.class, WsAchStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Password", scope = WsAchStatus.class)
    public JAXBElement<String> createWsAchStatusPassword(String value) {
        return new JAXBElement<String>(_WsNotificationsPassword_QNAME, String.class, WsAchStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Status", scope = WsAchStatus.class)
    public JAXBElement<String> createWsAchStatusStatus(String value) {
        return new JAXBElement<String>(_WsNotificationsStatus_QNAME, String.class, WsAchStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverAccount", scope = WsChangeRequestData.class)
    public JAXBElement<String> createWsChangeRequestDataReceiverAccount(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverAccount_QNAME, String.class, WsChangeRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverAddress", scope = WsChangeRequestData.class)
    public JAXBElement<String> createWsChangeRequestDataReceiverAddress(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverAddress_QNAME, String.class, WsChangeRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverBirthDate", scope = WsChangeRequestData.class)
    public JAXBElement<XMLGregorianCalendar> createWsChangeRequestDataReceiverBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsChangeRequestDataReceiverBirthDate_QNAME, XMLGregorianCalendar.class, WsChangeRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverEmail", scope = WsChangeRequestData.class)
    public JAXBElement<String> createWsChangeRequestDataReceiverEmail(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverEmail_QNAME, String.class, WsChangeRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverIdNumber", scope = WsChangeRequestData.class)
    public JAXBElement<String> createWsChangeRequestDataReceiverIdNumber(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverIdNumber_QNAME, String.class, WsChangeRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverIdType", scope = WsChangeRequestData.class)
    public JAXBElement<String> createWsChangeRequestDataReceiverIdType(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverIdType_QNAME, String.class, WsChangeRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverLastName", scope = WsChangeRequestData.class)
    public JAXBElement<String> createWsChangeRequestDataReceiverLastName(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverLastName_QNAME, String.class, WsChangeRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverMobile", scope = WsChangeRequestData.class)
    public JAXBElement<String> createWsChangeRequestDataReceiverMobile(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverMobile_QNAME, String.class, WsChangeRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverName", scope = WsChangeRequestData.class)
    public JAXBElement<String> createWsChangeRequestDataReceiverName(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverName_QNAME, String.class, WsChangeRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverPhone", scope = WsChangeRequestData.class)
    public JAXBElement<String> createWsChangeRequestDataReceiverPhone(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverPhone_QNAME, String.class, WsChangeRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverZip", scope = WsChangeRequestData.class)
    public JAXBElement<String> createWsChangeRequestDataReceiverZip(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverZip_QNAME, String.class, WsChangeRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Message", scope = WsResponse.class)
    public JAXBElement<String> createWsResponseMessage(String value) {
        return new JAXBElement<String>(_WsLimitByPayerResultMessage_QNAME, String.class, WsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Password", scope = WsResponse.class)
    public JAXBElement<String> createWsResponsePassword(String value) {
        return new JAXBElement<String>(_WsNotificationsPassword_QNAME, String.class, WsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt", scope = WsResponse.class)
    public JAXBElement<String> createWsResponseReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsReceipt_QNAME, String.class, WsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt_Contact", scope = WsResponse.class)
    public JAXBElement<String> createWsResponseReceiptContact(String value) {
        return new JAXBElement<String>(_WsResponseReceiptContact_QNAME, String.class, WsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt_Contact_EN", scope = WsResponse.class)
    public JAXBElement<String> createWsResponseReceiptContactEN(String value) {
        return new JAXBElement<String>(_WsResponseReceiptContactEN_QNAME, String.class, WsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt_Error", scope = WsResponse.class)
    public JAXBElement<String> createWsResponseReceiptError(String value) {
        return new JAXBElement<String>(_WsResponseReceiptError_QNAME, String.class, WsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt_Error_EN", scope = WsResponse.class)
    public JAXBElement<String> createWsResponseReceiptErrorEN(String value) {
        return new JAXBElement<String>(_WsResponseReceiptErrorEN_QNAME, String.class, WsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt_License", scope = WsResponse.class)
    public JAXBElement<String> createWsResponseReceiptLicense(String value) {
        return new JAXBElement<String>(_WsResponseReceiptLicense_QNAME, String.class, WsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt_RTR", scope = WsResponse.class)
    public JAXBElement<String> createWsResponseReceiptRTR(String value) {
        return new JAXBElement<String>(_WsResponseReceiptRTR_QNAME, String.class, WsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Receipt_RTR_EN", scope = WsResponse.class)
    public JAXBElement<String> createWsResponseReceiptRTREN(String value) {
        return new JAXBElement<String>(_WsResponseReceiptRTREN_QNAME, String.class, WsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Status", scope = WsResponse.class)
    public JAXBElement<String> createWsResponseStatus(String value) {
        return new JAXBElement<String>(_WsNotificationsStatus_QNAME, String.class, WsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "AgenciaCodigo", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoAgenciaCodigo(String value) {
        return new JAXBElement<String>(_WsTransferInfoAgenciaCodigo_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "AgencySpecialDiscounts", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoAgencySpecialDiscounts(String value) {
        return new JAXBElement<String>(_WsTransferInfoAgencySpecialDiscounts_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "AttachedFile", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoAttachedFile(String value) {
        return new JAXBElement<String>(_WsTransferInfoAttachedFile_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BancoCuenta", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBancoCuenta(String value) {
        return new JAXBElement<String>(_WsTransferInfoBancoCuenta_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BancosId", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBancosId(String value) {
        return new JAXBElement<String>(_WsTransferInfoBancosId_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BancosNombre", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBancosNombre(String value) {
        return new JAXBElement<String>(_WsTransferInfoBancosNombre_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BankAccount", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBankAccount(String value) {
        return new JAXBElement<String>(_WsTransferInfoBankAccount_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BankCode", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBankCode(String value) {
        return new JAXBElement<String>(_WsSelectPayerBanksResultBankCode_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BeneficiarioCelular", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBeneficiarioCelular(String value) {
        return new JAXBElement<String>(_WsTransferInfoBeneficiarioCelular_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BeneficiarioCiudad", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBeneficiarioCiudad(String value) {
        return new JAXBElement<String>(_WsTransferInfoBeneficiarioCiudad_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BeneficiarioDialCode", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBeneficiarioDialCode(String value) {
        return new JAXBElement<String>(_WsTransferInfoBeneficiarioDialCode_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BeneficiarioEstado", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBeneficiarioEstado(String value) {
        return new JAXBElement<String>(_WsTransferInfoBeneficiarioEstado_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BeneficiarioIdDescripcion", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBeneficiarioIdDescripcion(String value) {
        return new JAXBElement<String>(_WsTransferInfoBeneficiarioIdDescripcion_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BeneficiarioIdTipo", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBeneficiarioIdTipo(String value) {
        return new JAXBElement<String>(_WsTransferInfoBeneficiarioIdTipo_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BeneficiarioMensaje", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBeneficiarioMensaje(String value) {
        return new JAXBElement<String>(_WsTransferInfoBeneficiarioMensaje_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BeneficiarioNotas", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBeneficiarioNotas(String value) {
        return new JAXBElement<String>(_WsTransferInfoBeneficiarioNotas_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "BeneficiarioZip", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBeneficiarioZip(String value) {
        return new JAXBElement<String>(_WsTransferInfoBeneficiarioZip_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "Boleto", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoBoleto(String value) {
        return new JAXBElement<String>(_WsTransferInfoBoleto_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CiudadNombreBeneficiario", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoCiudadNombreBeneficiario(String value) {
        return new JAXBElement<String>(_WsTransferInfoCiudadNombreBeneficiario_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CiudadNombreRemitente", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoCiudadNombreRemitente(String value) {
        return new JAXBElement<String>(_WsTransferInfoCiudadNombreRemitente_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CiudadRemitente", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoCiudadRemitente(String value) {
        return new JAXBElement<String>(_WsTransferInfoCiudadRemitente_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceBanksName", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceBanksName(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceBanksName_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceBirthDate", scope = WsTransferInfo.class)
    public JAXBElement<XMLGregorianCalendar> createWsTransferInfoComplianceBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsTransferInfoComplianceBirthDate_QNAME, XMLGregorianCalendar.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceDireccion2", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceDireccion2(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceDireccion2_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceEmployerAddress", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceEmployerAddress(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceEmployerAddress_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceEmployersName", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceEmployersName(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceEmployersName_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceHomeType", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceHomeType(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceHomeType_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceIdExpirationDate", scope = WsTransferInfo.class)
    public JAXBElement<XMLGregorianCalendar> createWsTransferInfoComplianceIdExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsTransferInfoComplianceIdExpirationDate_QNAME, XMLGregorianCalendar.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceIdIssuer", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceIdIssuer(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceIdIssuer_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceIdNumber", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceIdNumber(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceIdNumber_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceIdType", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceIdType(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceIdType_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceOccupation", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceOccupation(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceOccupation_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceOtherSendingReason", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceOtherSendingReason(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceOtherSendingReason_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceOverLimitMessage", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceOverLimitMessage(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceOverLimitMessage_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CompliancePhoneConfirmation", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoCompliancePhoneConfirmation(String value) {
        return new JAXBElement<String>(_WsTransferInfoCompliancePhoneConfirmation_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CompliancePhoneType", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoCompliancePhoneType(String value) {
        return new JAXBElement<String>(_WsTransferInfoCompliancePhoneType_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceRelationshipWithBeneficiary", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceRelationshipWithBeneficiary(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceRelationshipWithBeneficiary_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceSSN", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceSSN(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceSSN_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceSendingReason", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceSendingReason(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceSendingReason_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceSourceOfFunds", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceSourceOfFunds(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceSourceOfFunds_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceSpecial", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceSpecial(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceSpecial_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceTextType", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceTextType(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceTextType_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ComplianceWorkPhone", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoComplianceWorkPhone(String value) {
        return new JAXBElement<String>(_WsTransferInfoComplianceWorkPhone_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CorrespondentCode", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoCorrespondentCode(String value) {
        return new JAXBElement<String>(_WsTransferInfoCorrespondentCode_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "CustomerID", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoCustomerID(String value) {
        return new JAXBElement<String>(_WsTransferInfoCustomerID_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "DestinatarioApellido", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoDestinatarioApellido(String value) {
        return new JAXBElement<String>(_WsTransferInfoDestinatarioApellido_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "DestinatarioNombre", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoDestinatarioNombre(String value) {
        return new JAXBElement<String>(_WsTransferInfoDestinatarioNombre_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "DestinationCurrency", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoDestinationCurrency(String value) {
        return new JAXBElement<String>(_WsTransferInfoDestinationCurrency_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "DireccionBancoTexto", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoDireccionBancoTexto(String value) {
        return new JAXBElement<String>(_WsTransferInfoDireccionBancoTexto_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "DireccionBeneficiario", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoDireccionBeneficiario(String value) {
        return new JAXBElement<String>(_WsTransferInfoDireccionBeneficiario_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "DireccionCalleRemitente", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoDireccionCalleRemitente(String value) {
        return new JAXBElement<String>(_WsTransferInfoDireccionCalleRemitente_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "DireccionRemitente", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoDireccionRemitente(String value) {
        return new JAXBElement<String>(_WsTransferInfoDireccionRemitente_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ExchangeRateEffective", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoExchangeRateEffective(String value) {
        return new JAXBElement<String>(_WsTransferInfoExchangeRateEffective_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "HDFieldBeneficiary", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoHDFieldBeneficiary(String value) {
        return new JAXBElement<String>(_WsTransferInfoHDFieldBeneficiary_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "HdFieldCompliance", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoHdFieldCompliance(String value) {
        return new JAXBElement<String>(_WsTransferInfoHdFieldCompliance_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "IDNo", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoIDNo(String value) {
        return new JAXBElement<String>(_WsTransferInfoIDNo_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "InformacionAdicionalRemitenteBeneficiario", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoInformacionAdicionalRemitenteBeneficiario(String value) {
        return new JAXBElement<String>(_WsTransferInfoInformacionAdicionalRemitenteBeneficiario_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "LegalIdBeneficiario", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoLegalIdBeneficiario(String value) {
        return new JAXBElement<String>(_WsTransferInfoLegalIdBeneficiario_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "MovilRemitente", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoMovilRemitente(String value) {
        return new JAXBElement<String>(_WsTransferInfoMovilRemitente_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OFACBeneficiaryBirthDate", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoOFACBeneficiaryBirthDate(String value) {
        return new JAXBElement<String>(_WsTransferInfoOFACBeneficiaryBirthDate_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OFACBeneficiaryPlaceOfBirth", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoOFACBeneficiaryPlaceOfBirth(String value) {
        return new JAXBElement<String>(_WsTransferInfoOFACBeneficiaryPlaceOfBirth_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OFACCountryOfNationality", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoOFACCountryOfNationality(String value) {
        return new JAXBElement<String>(_WsTransferInfoOFACCountryOfNationality_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OFACPlaceOfBirth", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoOFACPlaceOfBirth(String value) {
        return new JAXBElement<String>(_WsTransferInfoOFACPlaceOfBirth_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OFACRemitenteObliga", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoOFACRemitenteObliga(String value) {
        return new JAXBElement<String>(_WsTransferInfoOFACRemitenteObliga_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OFACSenderBirthDate", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoOFACSenderBirthDate(String value) {
        return new JAXBElement<String>(_WsTransferInfoOFACSenderBirthDate_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfficeCode", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoOfficeCode(String value) {
        return new JAXBElement<String>(_WsSelectPayerOfficesResultOfficeCode_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OfficeNombre", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoOfficeNombre(String value) {
        return new JAXBElement<String>(_WsTransferInfoOfficeNombre_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OriginalCurrency", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoOriginalCurrency(String value) {
        return new JAXBElement<String>(_WsTransferInfoOriginalCurrency_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OriginalPaymentMethod", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoOriginalPaymentMethod(String value) {
        return new JAXBElement<String>(_WsTransferInfoOriginalPaymentMethod_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "OverLimitMessage", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoOverLimitMessage(String value) {
        return new JAXBElement<String>(_WsTransferInfoOverLimitMessage_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PEPBeneficiarioMessage", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoPEPBeneficiarioMessage(String value) {
        return new JAXBElement<String>(_WsTransferInfoPEPBeneficiarioMessage_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PEPRemitenteMessage", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoPEPRemitenteMessage(String value) {
        return new JAXBElement<String>(_WsTransferInfoPEPRemitenteMessage_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "POBofacBen", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoPOBofacBen(String value) {
        return new JAXBElement<String>(_WsTransferInfoPOBofacBen_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PaisBeneficiarioNombre", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoPaisBeneficiarioNombre(String value) {
        return new JAXBElement<String>(_WsTransferInfoPaisBeneficiarioNombre_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "PuntosRemitenteIdCard", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoPuntosRemitenteIdCard(String value) {
        return new JAXBElement<String>(_WsTransferInfoPuntosRemitenteIdCard_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "RelationshipWithSenders", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoRelationshipWithSenders(String value) {
        return new JAXBElement<String>(_WsTransferInfoRelationshipWithSenders_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "RemitenteApellido", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoRemitenteApellido(String value) {
        return new JAXBElement<String>(_WsTransferInfoRemitenteApellido_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "RemitenteEmail", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoRemitenteEmail(String value) {
        return new JAXBElement<String>(_WsTransferInfoRemitenteEmail_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "RemitenteEstado", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoRemitenteEstado(String value) {
        return new JAXBElement<String>(_WsTransferInfoRemitenteEstado_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "RemitenteNombre", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoRemitenteNombre(String value) {
        return new JAXBElement<String>(_WsTransferInfoRemitenteNombre_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "RemitentePais", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoRemitentePais(String value) {
        return new JAXBElement<String>(_WsTransferInfoRemitentePais_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "RemitentePaisNombre", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoRemitentePaisNombre(String value) {
        return new JAXBElement<String>(_WsTransferInfoRemitentePaisNombre_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "RemitenteTelefono", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoRemitenteTelefono(String value) {
        return new JAXBElement<String>(_WsTransferInfoRemitenteTelefono_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "RemitenteZip", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoRemitenteZip(String value) {
        return new JAXBElement<String>(_WsTransferInfoRemitenteZip_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "RoutingNumber", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoRoutingNumber(String value) {
        return new JAXBElement<String>(_WsTransferInfoRoutingNumber_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderAchAccount", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoSenderAchAccount(String value) {
        return new JAXBElement<String>(_WsTransferInfoSenderAchAccount_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderAchRouting", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoSenderAchRouting(String value) {
        return new JAXBElement<String>(_WsTransferInfoSenderAchRouting_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderAchType", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoSenderAchType(String value) {
        return new JAXBElement<String>(_WsTransferInfoSenderAchType_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderBirthDate", scope = WsTransferInfo.class)
    public JAXBElement<XMLGregorianCalendar> createWsTransferInfoSenderBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsTransferInfoSenderBirthDate_QNAME, XMLGregorianCalendar.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ServicioCodigo", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoServicioCodigo(String value) {
        return new JAXBElement<String>(_WsTransferInfoServicioCodigo_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SucursalBanco", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoSucursalBanco(String value) {
        return new JAXBElement<String>(_WsTransferInfoSucursalBanco_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SuspendMessage", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoSuspendMessage(String value) {
        return new JAXBElement<String>(_WsTransferInfoSuspendMessage_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SuspendUserType", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoSuspendUserType(String value) {
        return new JAXBElement<String>(_WsTransferInfoSuspendUserType_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "TasaError", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoTasaError(String value) {
        return new JAXBElement<String>(_WsTransferInfoTasaError_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "TelefonoBeneficiario", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoTelefonoBeneficiario(String value) {
        return new JAXBElement<String>(_WsTransferInfoTelefonoBeneficiario_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "TempCompliance", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoTempCompliance(String value) {
        return new JAXBElement<String>(_WsTransferInfoTempCompliance_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "TempGiroRepetido", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoTempGiroRepetido(String value) {
        return new JAXBElement<String>(_WsTransferInfoTempGiroRepetido_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ThirdPartyReceipt", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoThirdPartyReceipt(String value) {
        return new JAXBElement<String>(_WsNotificationsThirdPartyReceipt_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "TipoCuentaCodigo", scope = WsTransferInfo.class)
    public JAXBElement<String> createWsTransferInfoTipoCuentaCodigo(String value) {
        return new JAXBElement<String>(_WsTransferInfoTipoCuentaCodigo_QNAME, String.class, WsTransferInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverAddress", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverAddress(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverAddress_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverBirthDate", scope = WsReceiver.class)
    public JAXBElement<XMLGregorianCalendar> createWsReceiverReceiverBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsChangeRequestDataReceiverBirthDate_QNAME, XMLGregorianCalendar.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverCity", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverCity(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverCity_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverCompany", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverCompany(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverCompany_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverCountry", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverCountry(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverCountry_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverCountryNationallity", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverCountryNationallity(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverCountryNationallity_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverCurrency", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverCurrency(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverCurrency_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverDocExpiration", scope = WsReceiver.class)
    public JAXBElement<XMLGregorianCalendar> createWsReceiverReceiverDocExpiration(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsReceiverReceiverDocExpiration_QNAME, XMLGregorianCalendar.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverEmail", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverEmail(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverEmail_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverFileImg", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverFileImg(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverFileImg_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverFileImg2", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverFileImg2(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverFileImg2_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverGender", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverGender(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverGender_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverIdIssuer", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverIdIssuer(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverIdIssuer_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverIdNumber", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverIdNumber(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverIdNumber_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverIdType", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverIdType(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverIdType_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverLastName", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverLastName(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverLastName_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverMaritalStatus", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverMaritalStatus(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverMaritalStatus_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverMobile", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverMobile(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverMobile_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverMoneyOrigin", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverMoneyOrigin(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverMoneyOrigin_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverName", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverName(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverName_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverOccupation", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverOccupation(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverOccupation_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverOfficeCode", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverOfficeCode(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverOfficeCode_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverPOB", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverPOB(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverPOB_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverPhone", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverPhone(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverPhone_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverPicture", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverPicture(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverPicture_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverRemark", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverRemark(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverRemark_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverState", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverState(String value) {
        return new JAXBElement<String>(_WsReceiverReceiverState_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "ReceiverZip", scope = WsReceiver.class)
    public JAXBElement<String> createWsReceiverReceiverZip(String value) {
        return new JAXBElement<String>(_WsChangeRequestDataReceiverZip_QNAME, String.class, WsReceiver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "AgentAlias", scope = WsSender.class)
    public JAXBElement<String> createWsSenderAgentAlias(String value) {
        return new JAXBElement<String>(_WsSenderAgentAlias_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderAchAccount", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderAchAccount(String value) {
        return new JAXBElement<String>(_WsTransferInfoSenderAchAccount_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderAchRouting", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderAchRouting(String value) {
        return new JAXBElement<String>(_WsTransferInfoSenderAchRouting_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderAchType", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderAchType(String value) {
        return new JAXBElement<String>(_WsTransferInfoSenderAchType_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderAddress", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderAddress(String value) {
        return new JAXBElement<String>(_WsSenderSenderAddress_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderAddressStreet", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderAddressStreet(String value) {
        return new JAXBElement<String>(_WsSenderSenderAddressStreet_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderBank", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderBank(String value) {
        return new JAXBElement<String>(_WsSenderSenderBank_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderBirthDate", scope = WsSender.class)
    public JAXBElement<XMLGregorianCalendar> createWsSenderSenderBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsTransferInfoSenderBirthDate_QNAME, XMLGregorianCalendar.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderCardBank", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderCardBank(String value) {
        return new JAXBElement<String>(_WsSenderSenderCardBank_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderCardExpiration", scope = WsSender.class)
    public JAXBElement<XMLGregorianCalendar> createWsSenderSenderCardExpiration(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsSenderSenderCardExpiration_QNAME, XMLGregorianCalendar.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderCardName", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderCardName(String value) {
        return new JAXBElement<String>(_WsSenderSenderCardName_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderCardNumber", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderCardNumber(String value) {
        return new JAXBElement<String>(_WsSenderSenderCardNumber_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderCardType", scope = WsSender.class)
    public JAXBElement<Integer> createWsSenderSenderCardType(Integer value) {
        return new JAXBElement<Integer>(_WsSenderSenderCardType_QNAME, Integer.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderCity", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderCity(String value) {
        return new JAXBElement<String>(_WsSenderSenderCity_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderComments", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderComments(String value) {
        return new JAXBElement<String>(_WsSenderSenderComments_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderComments3", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderComments3(String value) {
        return new JAXBElement<String>(_WsSenderSenderComments3_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderCompany", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderCompany(String value) {
        return new JAXBElement<String>(_WsSenderSenderCompany_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderCompanyAddress", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderCompanyAddress(String value) {
        return new JAXBElement<String>(_WsSenderSenderCompanyAddress_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderCompanyPhone", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderCompanyPhone(String value) {
        return new JAXBElement<String>(_WsSenderSenderCompanyPhone_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderCountryCode", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderCountryCode(String value) {
        return new JAXBElement<String>(_WsSenderSenderCountryCode_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderCountryNationallity", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderCountryNationallity(String value) {
        return new JAXBElement<String>(_WsSenderSenderCountryNationallity_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderCountryResidence", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderCountryResidence(String value) {
        return new JAXBElement<String>(_WsSenderSenderCountryResidence_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderCurrencyCode", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderCurrencyCode(String value) {
        return new JAXBElement<String>(_WsSenderSenderCurrencyCode_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderDocExpiration", scope = WsSender.class)
    public JAXBElement<XMLGregorianCalendar> createWsSenderSenderDocExpiration(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WsSenderSenderDocExpiration_QNAME, XMLGregorianCalendar.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderEmail", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderEmail(String value) {
        return new JAXBElement<String>(_WsSenderSenderEmail_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderFileImg", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderFileImg(String value) {
        return new JAXBElement<String>(_WsSenderSenderFileImg_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderFileImg2", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderFileImg2(String value) {
        return new JAXBElement<String>(_WsSenderSenderFileImg2_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderGender", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderGender(String value) {
        return new JAXBElement<String>(_WsSenderSenderGender_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderIP", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderIP(String value) {
        return new JAXBElement<String>(_WsSenderSenderIP_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderIdCard", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderIdCard(String value) {
        return new JAXBElement<String>(_WsSenderSenderIdCard_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderIdIssuer", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderIdIssuer(String value) {
        return new JAXBElement<String>(_WsSenderSenderIdIssuer_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderIdNumber", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderIdNumber(String value) {
        return new JAXBElement<String>(_WsSenderSenderIdNumber_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderIdNumber2", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderIdNumber2(String value) {
        return new JAXBElement<String>(_WsSenderSenderIdNumber2_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderIdType", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderIdType(String value) {
        return new JAXBElement<String>(_WsSenderSenderIdType_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderIdType2", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderIdType2(String value) {
        return new JAXBElement<String>(_WsSenderSenderIdType2_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderLastName", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderLastName(String value) {
        return new JAXBElement<String>(_WsSenderSenderLastName_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderMaritalStatus", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderMaritalStatus(String value) {
        return new JAXBElement<String>(_WsSenderSenderMaritalStatus_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderMobile", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderMobile(String value) {
        return new JAXBElement<String>(_WsSenderSenderMobile_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderMoneyOrigin", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderMoneyOrigin(String value) {
        return new JAXBElement<String>(_WsSenderSenderMoneyOrigin_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderName", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderName(String value) {
        return new JAXBElement<String>(_WsSenderSenderName_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderOccupation", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderOccupation(String value) {
        return new JAXBElement<String>(_WsSenderSenderOccupation_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderPOB", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderPOB(String value) {
        return new JAXBElement<String>(_WsSenderSenderPOB_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderPassword", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderPassword(String value) {
        return new JAXBElement<String>(_WsSenderSenderPassword_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderPhone", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderPhone(String value) {
        return new JAXBElement<String>(_WsSenderSenderPhone_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderPicture", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderPicture(String value) {
        return new JAXBElement<String>(_WsSenderSenderPicture_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderResidenceAddress", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderResidenceAddress(String value) {
        return new JAXBElement<String>(_WsSenderSenderResidenceAddress_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderResidenceAddressExtra", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderResidenceAddressExtra(String value) {
        return new JAXBElement<String>(_WsSenderSenderResidenceAddressExtra_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderResidenceCity", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderResidenceCity(String value) {
        return new JAXBElement<String>(_WsSenderSenderResidenceCity_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderResidenceCountryCode", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderResidenceCountryCode(String value) {
        return new JAXBElement<String>(_WsSenderSenderResidenceCountryCode_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderResidenceState", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderResidenceState(String value) {
        return new JAXBElement<String>(_WsSenderSenderResidenceState_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderResidenceZip", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderResidenceZip(String value) {
        return new JAXBElement<String>(_WsSenderSenderResidenceZip_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderSendingReason", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderSendingReason(String value) {
        return new JAXBElement<String>(_WsSenderSenderSendingReason_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderState", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderState(String value) {
        return new JAXBElement<String>(_WsSenderSenderState_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderTrackingNumber", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderTrackingNumber(String value) {
        return new JAXBElement<String>(_WsSenderSenderTrackingNumber_QNAME, String.class, WsSender.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/gmtpay", name = "SenderZip", scope = WsSender.class)
    public JAXBElement<String> createWsSenderSenderZip(String value) {
        return new JAXBElement<String>(_WsSenderSenderZip_QNAME, String.class, WsSender.class, value);
    }

}
